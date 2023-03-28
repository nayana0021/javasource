package shop2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static shop2.JdbcUtil.*;

public class ProductDAO { //작성 오후4시 0328 강의
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//전체 상품 조회
	public List<ProductDTO> getList(){
		
		List<ProductDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			// 전체 상품 조회
			String sql = "select * from product";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setProduct_id(rs.getInt("product_id"));
				dto.setPname(rs.getString("pname"));
				dto.setPrice(rs.getInt("price"));
				dto.setContent(rs.getString("content"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	
	//상품추가
	public boolean insert(ProductDTO dto) {
		boolean status = false;
		
		try {
			
			con = getConnection();
			
			String sql = "insert into product(product_id,pname,price,content) ";	//위에 밑에 연결하는 문장임 위에 반드시 한 칸 남겨놓아야함
			sql += "values(?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			// ? 처리
			pstmt.setInt(1, dto.getProduct_id());	//값을 꺼내오는 거임
			pstmt.setString(2, dto.getPname());
			pstmt.setInt(3, dto.getPrice());
			pstmt.setString(4, dto.getContent());
			
			int result = pstmt.executeUpdate();
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	
}
