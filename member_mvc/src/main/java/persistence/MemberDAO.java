package persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

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
	
	
	
	
}
