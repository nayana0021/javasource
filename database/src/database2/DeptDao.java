package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// ~~~DAO : DataBase 작업을 담당하는 클래스임
public class DeptDao {
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	// 커넥션을 위한 드라이버 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) { //static 이니까 클래스 작성시 바로 실행됨
			e.printStackTrace();
		}
	}
	
	
	// 커넥션을 리턴 메소드
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "TIGER";
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	//close() : 자원닫기
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// select-하나
	public DeptDTO getRow(int deptno) { //리턴값에 맞춰야해서 리턴값이 DeptDTO 임
		//커넥션 가져오기
		con = getConnection();
		
		DeptDTO dto = null; //블럭을 벗어나서 리턴구문 dto를 써야하는데 안에 선언하면 if문 에서 벗어날 경우 찾을수없어서 밖으로 뺐다
		//sql 구문 작성하기
		String sql = "select * from dept_temp where deptno=?";
		
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();
					
			if(rs.next()) {//if 문 실행이 안되면(부서번호에 없는 번호 입력시) 객체 생성이 안되고 null로 main에 넘겨준다
				//System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)); Dao는 직접 출력 안한다
//1)			//rs => DeptDTO 에 담기
//				deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3); //변수에 담고 담은걸 이용하여 dto 객체생성(객체생성을 해야 전달할수있다)
//				
//				 dto = new DeptDTO(deptno, dname, loc);
				
//2)				return new DeptDTO(rs.getInt(1), rs.getString(2),rs.getString(3)); //이렇게 간단히 쓸수있다 - 객체생성후리턴시키는 구문
//3)				
				dto = new DeptDTO();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));	//총 3가지 방법이 있다
				dto.setLoc(rs.getString(3));	//객체 생성해서 담기만하면 됨
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con,pstmt,rs);
		}
		return dto;
		//작성만 하고 컴파일만 한 상태임 메인은 따로
	}
	
	// select-all
	public ArrayList<DeptDTO> getRows() {
		
		ArrayList<DeptDTO> list = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select * from dept_temp";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
//				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				
//1)			int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				DeptDTO dto = new DeptDTO(deptno, dname, loc);
//				list.add(dto);
				
//2)			list.add(new DeptDTO(rs.getInt(1), rs.getString(2),rs.getString(3)));
//3)				
			DeptDTO dto = new DeptDTO();
			dto.setDeptno(rs.getInt(1));
			dto.setDname(rs.getString(2));
			dto.setLoc(rs.getString(3));
			list.add(dto);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
}





