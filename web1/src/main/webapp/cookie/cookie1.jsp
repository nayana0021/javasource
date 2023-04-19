<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
	세션과 쿠키
	세션 : 서버 쪽에 저장 (객체 상태로 저장 가능)
	쿠키 : 클라이언트 쪽에 저장 (객체로 저장 불가)
 --%>
 <%
 
 	// 서버에서 클라이언트한테 응답 시 특정 값을 붙여서 보냄
 	
 	response.addCookie(new Cookie("name", "john")); //객체로 저장이 안돼서 개별로 따로 값을 지정해야 함
 	response.addCookie(new Cookie("gender", "Male"));
 	response.addCookie(new Cookie("age", "30"));
 	response.addCookie(new Cookie("addr", "Seoul"));
 
 %>
 <h3>쿠키 데이터가 저장되었습니다.</h3>
 <a href="getCookie1.jsp">쿠키 확인하러 가기</a>
</body>
</html>