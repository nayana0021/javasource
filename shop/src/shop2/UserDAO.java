package shop2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static shop2.JdbcUtil.*;

/*
 * JdbcUtil 메소드 호출하는 방법
 * 
 * 1) static 메소드이므로 클래스이름.메소드명(),
 * 2) JdbcUtil 클래스 안 메소드가 모두 static 이라면
 * 	  import static JdbcUtil.*; ==> 메소드명() 만 써도 됨
 * 
 * JdbcUtil.getConnection();
 */

public class UserDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	//회원가입
	public boolean insert(int userId, String name, int payNo ) {
		boolean status = false;
		try {
			
			con = getConnection();
			
			//suser insert
			String sql = "insert into suser(user_id,name,pay_no) values(?,?,?)";
			//오타 나면 sql 구문이 어쩌고 하면서 오류남
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, userId);
			pstmt.setString(2, name);
			pstmt.setInt(3, payNo);
			
			int result = pstmt.executeUpdate();
					
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//전체 조회 - select
	public List<UserDTO> getlList(){
		List<UserDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			// suser 전체 조회
			//String sql = "select * from suser ";
			
			String sql = "select u.user_id, u.name, u.pay_no, p.info "	//공백 꼭 주기
					+ "from suser u, paytype p "	//sql 은 자바에서 String이다
					+ "where u.pay_no = p.pay_no";	//db 서버에 넘어갈때 위에 구문 바로 뒤에 붙어버림 -> 제대로 해석이 안됨
			
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {	//user가 여러명이 나옴. DTO 에 담아라. - list에 담음. 
//				UserDTO dto = new UserDTO(rs.getInt(1), rs.getString(2), rs.getInt(3));
//				list.add(dto);
				
				list.add(new UserDTO(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));	//전체 인자를 받는 생성자를 이용함
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	 
	
	
}
