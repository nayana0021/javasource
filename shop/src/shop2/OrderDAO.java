package shop2;

import static shop2.JdbcUtil.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//JdbcUtil 클래스 : 드라이버로드, connection, close 반복작업을 하나의 클래스에 정의

public class OrderDAO {	//0329 강의 오전부터
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	//C(INSERT)R(SELECT)U(UPDATE)D(DELETE) 메소드 작성
	
	// 장바구니 ==> sorder 추가
	public boolean insert( int userId, int productId) {
		boolean status = false;
		
		try {
			
			con = getConnection();	//커넥션 받아오고
			
			String sql = "insert into sorder(order_id, user_id, product_id, order_date) values(order_seq.nextval, ?, ?, sysdate)";
			
			pstmt= con.prepareStatement(sql); 	//sql 구문 보내고
			pstmt.setInt(1, userId); //물음표 처리 //userid 받아오고
			pstmt.setInt(2, productId);			//productid 받아오고
			
			int result = pstmt.executeUpdate();	//실행 갯수로 받아야해서 int 에 담음
			
			if(result > 0) status = true;		//result가 있으면 true로 변경
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);					//close 닫고
		}
		return status;
	}
	
	// 장바구니 조회 - 특정 회원
	public List<OrderDTO> carts(int userId){
		List<OrderDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			
			String sql = "select s.user_id, u.name, t.info, s.product_id, ";
			sql += "p.pname, p.price, p.content, s.order_date ";
			sql += "from sorder s, suser u, paytype t, product p ";
			sql += "where s.user_id = u.user_id AND u.pay_no = t.pay_no ";
			sql += "AND s.product_id = p.product_id AND s.user_id = ?";
			
			pstmt = con.prepareStatement(sql);	//sql 구문 해석해라고 보내줌
			pstmt.setInt(1, userId);
			rs=pstmt.executeQuery();	//실행해라
			
			// ResultSet 객체의 결과 : user_id, name, info, product_id, pname, price, content, order date => OrderDTO 담기
			// UserDTO : user_id, name, info
			// Product : product_id, pname, price, content
			//			order_date
			while(rs.next()) {
				
					UserDTO userDTO = new UserDTO();
					userDTO.setUserId(rs.getInt(1));
					userDTO.setName(rs.getString(2));
					userDTO.setType(rs.getString(3));
					
					ProductDTO productDTO = new ProductDTO();
					productDTO.setProductId(rs.getInt(4));
					productDTO.setPname(rs.getString(5));
					productDTO.setPrice(rs.getInt(6));
					productDTO.setContent(rs.getString(7));
					
					OrderDTO orderDTO = new OrderDTO();
					orderDTO.setUserDTO(userDTO);
					orderDTO.setProductDTO(productDTO);
					orderDTO.setOrderDate(rs.getDate(8));
					
					list.add(orderDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	
}
