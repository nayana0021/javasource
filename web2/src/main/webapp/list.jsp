<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<h1>User List</h1>
<%
	// DB 연동 ==> JDBC 사용 (1,2는 고정)
	// 1. 드라이버 로드
	Class.forName("oracle.jdbc.OracleDriver");
	// 2. 커넥션 생성
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "javadb";
	String password = "12345";
	Connection con = DriverManager.getConnection(url, user, password);

	// 3. SQL 쿼리문 실행 - 1) 전체 조회
	String sql = "select * from usertbl";
	PreparedStatement pstmt = con.prepareStatement(sql);
	
	ResultSet rs = pstmt.executeQuery(); //쿼리문 실행한 후 결과 전송 (ResultSet:select 결과를 담을 수 있는 특수한 객체라고 보면 됨)
	// 테이블 모양의 데이터를 담는다
%>
<table class="table">
  <thead>
    <tr> <!-- 다섯개의 필드 -->
      <th scope="col">#</th>
      <th scope="col">이름</th>
      <th scope="col">태어난해</th>
      <th scope="col">주소</th>
      <th scope="col">핸드폰</th>
    </tr>
  </thead>
  <tbody>
<% 
	while(rs.next()){
%>
    <tr> <!-- tr 한 행 씩 while문으로 돌림 -->
      <th scope="row"><%=rs.getInt("no") %></th>
      <td><a href="get.jsp?no=<%=rs.getInt("no")%>&name=1"><%=rs.getString("username") %></a></td> <!-- 번호 붙여서 들어감 -->
      <!-- ? 를 쓰게 되면 주소줄에 따라 보내게 되고 보낼때 key=value 형식으로 보낸다 &로 더 연결가능 -->
      <td><%=rs.getInt("birthyear") %></td>
      <td><%=rs.getString("addr") %></td>
      <td><%=rs.getString("mobile") %></td>
    </tr>
<%
	}	
%>
  </tbody>
</table>


<%@ include file="/include/footer.jsp" %>