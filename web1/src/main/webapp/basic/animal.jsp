<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- jsp 주석 : 브라우저에서 안 보임--%>
<!-- html 주석 : 브라우저에서 보임 -->
<%
	request.setCharacterEncoding("utf-8"); // 한글 깨지지 말라고
	// getParameter는 값 하나만 가져온다
	//String animals = request.getParameter("animal"); 
	
	String animals[] = request.getParameterValues("animal");
	// getParameterValues 값 여러개 가져온다 - 매개변수의 값을 문자열 배열로 반환
	
	out.print("<h3>"+Arrays.toString(animals)+"</h3>");
%>
<!-- 대괄호가 나오는 이유는 Arrays.toString을 썼기 때문 이게 싫으면 for문 돌린다 -->
 <h3><%= Arrays.toString(animals) %></h3>
 <!-- 화면 출력 방법 2가지(자바코드,jsp코드), 위치 확인!! -->
</body>
</html>