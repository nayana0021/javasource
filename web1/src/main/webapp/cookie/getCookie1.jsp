<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 

	jsp 스크립트 요소
	1. <% %> : 자바 코드( _jspService() 메소드 안에 들어가게 됨) - 메소드 안에 선언된 자바코드..
	2. <%= %> : 화면 출력 (이거 말고 out.print() 사용가능)
	3. <%! %> : 멤버 변수, 멤버 메소드 개념


 --%>
<% Cookie[] cookies = request.getCookies(); %> 
<%!
	private String getCookieValue(Cookie[] cookies, String name){
		if(cookies == null){
			return null;
		}
		for(Cookie c:cookies){
			if(c.getName().equals(name)) return c.getValue();
		}
		return null;
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>이름 : <%=getCookieValue(cookies, "name") %></li>
		<li>성별 : <%=getCookieValue(cookies, "gender") %></li>
		<li>나이 : <%=getCookieValue(cookies, "age") %></li>
		<li>주소 : <%=getCookieValue(cookies, "addr") %></li>
	</ul>
</body>
</html>