<%@page import="user.domain.LoginDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% //밑에 코드를 이렇게 자바코드로 작성할수있다
 	//if(5<10){
	//out.print("<h3>5는 10보다 작다</h3>");
	//}
 %>
 
 <%-- jstl if 는 else 없음 :if 두 번 쓰면 됨 --%>
<c:if test="${5 < 10}">
	<h3>5는 10보다 작다</h3>
</c:if>

<c:if test="${6 + 3 == 9}">
	<h3>6 + 3 = 9</h3>
</c:if>
<!-- 태그 처럼 자바 코드를 쓸 수 있다는 장점이 있다 -->

<!-- if else 개념 : choose when otherwise 사용 -->
<!-- if문 for문 개념만 잘 알면 됨 -->
<c:choose> 
	<c:when test="${5+10 == 50}">
		<h3>5 + 10 == 50 이다</h3>
	</c:when>
	<c:otherwise>
		<h3>5 + 10 == 50 이 아니다</h3>
	</c:otherwise>
</c:choose>
<%
  	
/* 	List<LoginDTO> loginDTO = (List<LoginDTO>)request.getAttribute("loginDTO");
 	
	for(LoginDTO dto : loginDTO){
		out.print("아이디 "+dto.getUserId()+"<br>");
		out.print("비밀번호 "+dto.getPassword()+"<br>");
		out.print("<hr/>");
	}
 */	
%>
<%-- 태그랑 섞일 때 : jstl로 forEach 돌리고 EL로 찾아오는 형태 -> 자바 코드를 간결하게 사용 가능 --%>
<%-- var : 변수명(마음대로), items : setAttribute() 에서 사용했던 이름 --%>
 <table border ="1">
	<tr>
		<th>아이디</th>
		<th>비밀번호</th>
	</tr>
	<c:forEach var="dto" items="${loginDTO}">
		<tr>
			<td>${dto.userId}</td>
			<td>${dto.password}</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>