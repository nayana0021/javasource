package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import domain.ChangeDTO;
import domain.MemberDTO;

public class MemberDAO {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
		
	// DB 서버 연결
	public Connection getConnection() {
		
		try {
			
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myoracle");
			Connection con = ds.getConnection();
				// DML 실행 시 트랜잭션 관리를 직접 하겠음
				con.setAutoCommit(false);
				return con;
			} catch (Exception e) {
				e.printStackTrace();
			}
			return null;
	}
	
	// 자원해제
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// 로그인
	// 아이디와 비밀번호가 일치하면 아이디와 이름만 추출
	// select userid, name from membertbl where userid=? and password=? 결과는 하나의 행만 나오면 됨
	
	public MemberDTO isLogin(String userid, String password){
		MemberDTO dto = null;
		
		try {
			
			con = getConnection();
			
			String sql = "select userid, name from membertbl where userid=? and password=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				dto = new MemberDTO(); // 객체 생성하는 시점은 if문 실행 된 때 if 문이 실행이 안되면 dto 가 null 임 - null 이 아닌 경우를 생각해야 함
				dto.setUserid(rs.getString("userid"));
				dto.setName(rs.getString("name"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	
	// 회원가입
	public boolean insert(MemberDTO dto) {
		boolean flag = false;
		
		try {
			con = getConnection();
			String sql = "insert into membertbl(userid,password,name,gender,email) values(?,?,?,?,?) "; // 필드명 안 쓸거면 순서대로해라 하지만 필드명 써서 명확하게 하는게 낫다
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getUserid());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getGender());
			pstmt.setString(5, dto.getEmail());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				flag = true;
				commit(con); //insert했으니까 커밋해야됨
			}
		} catch (Exception e) {
			rollback(con); // 에러나는 상황이면 롤백하고
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	// 비밀번호 변경
	public boolean update(ChangeDTO dto) {
		boolean flag = false;
		
		try {
			con = getConnection();
			String sql = "update membertbl set password=? where userid=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getConfirmPassword());
			pstmt.setString(2, dto.getUserid());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				flag = true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	// 회원탈퇴 - 아이디와 비밀번호 일치시
	public boolean remove(String userid, String password) {
		boolean flag = false;
		
		try {
			con=getConnection();
			String sql = "delete from membertbl where userid=? and password=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				flag = true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	
	// 중복아이디 검사
	// 존재하는 아이디가 있다면 true 리턴 없으면 false 리턴
	public boolean duplicateId(String userid){
		
		boolean flag = true; // 사용할수있으면 true 
		
		try {
			con = getConnection();
			String sql = "select count(*) from membertbl where userid=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				int cnt = rs.getInt(1); // 결과값이 정수로 나옴 count -> 1
				if(cnt > 0) flag = false; // 아이디 존재하면 false
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return flag;
		
	}
	
	
	
}
