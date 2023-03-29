package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {	//~dao 데이터베이스 작업할거야.
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	// 드라이버로드, 커넥션, select + DML 정의
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
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
	
	//close 두 가지
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
	
	// select - many : ArrayList 리턴		(두 개 이상 나오면 어레이리스트로)
	public ArrayList<EmpDTO> getList(String ename){	//물음표에 해당하는 거 인자를 넣어준다 타입맞춰서
		ArrayList<EmpDTO> list = new ArrayList<>();
		
		try {
			
			con = getConnection();
			//ename 이 홍길동인 사람 조회(empno, ename, job, hiredate)
			String sql = "select empno, ename, job, hiredate from emp_temp where ename=? "; //가지고 나오는거 4개 순서대로 1,2,3,4 밑에
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, ename);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {	//while 문에 안 걸리면 list에 없다
				EmpDTO empDTO = new EmpDTO();
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString(3));
				empDTO.setHiredate(rs.getDate(4));
				
				list.add(empDTO); //리스트에 담는다
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	// select - one : DTO 리턴
	public EmpDTO getRow(int empno) {
		EmpDTO empDTO = null;
		try {
			
			con = getConnection();
			
			// where 절에 pk(Primary key - 기본키(중복불가, null 불가)) 가 조건으로 들어오는 경우 무조건 하나의 행이 나옴
			// empno(pk), deptno(pk)
			String sql = "select empno, ename, job, sal, comm, deptno from emp_temp where empno=?";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				empDTO = new EmpDTO();	//if 문이 실행될때 객체가 생성된다
				empDTO.setEmpno(rs.getInt(1));
				empDTO.setEname(rs.getString(2));
				empDTO.setJob(rs.getString("job"));
				empDTO.setSal(rs.getInt("sal"));
				empDTO.setComm(rs.getInt("comm"));
				empDTO.setDeptno(rs.getInt("deptno"));	// 1,2,3,4,5,6 쓰거나 필드명으로 쓰면 된다
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return empDTO; //리턴 값이 null 이 올수있다
	}
	
	//급여 수정
	public boolean update(int sal, int empno) { //DML은 boolean으로 리턴받아라
		boolean status = false;
		try {
			
			con = getConnection();
			
			// 사번이 일치하면 급여 수정
			String sql = "update emp_temp set sal = ? where empno=?"; //sql 기준으로 보자 /물음표 두개니까 전달인자 두개로(메소드 매개변수)
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, sal);
			pstmt.setInt(2, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//사원 삭제
	public boolean remove(int empno) {
		boolean status = false;
		
		try {
			
			con = getConnection();
			
			//empno 일치 시 사원 삭제
			String sql = "delete from emp_temp where empno=?";
			
			pstmt = con.prepareStatement(sql);
			// ?  처리
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			
			if(result>0) status = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con,pstmt);
		}
		return status;
	}
	
	//사원추가
	public boolean insert(EmpDTO empDTO) {
		
		boolean status = false;
		
		try {
			
			con = getConnection();
			String sql = "insert into emp_temp(empno, ename, job, mgr, hiredate, sal, comm, deptno) "; //길어지면 밑으로 내려갈때 반드시 한 칸 띄고 내려감
			sql += "values(?,?,?,?,sysdate,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			//?처리 (순서대로)
			pstmt.setInt(1, empDTO.getEmpno());
			pstmt.setString(2, empDTO.getEname());
			pstmt.setString(3, empDTO.getJob());
			pstmt.setInt(4, empDTO.getMgr());
			pstmt.setInt(5, empDTO.getSal());
			pstmt.setInt(6, empDTO.getComm());
			pstmt.setInt(7, empDTO.getDeptno());
			
			
			int result = pstmt.executeUpdate();
			
			if(result>0) status =true;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return status;
	}
	
	
	
	
}
