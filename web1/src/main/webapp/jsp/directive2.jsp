<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%> <!-- 에러가 날 경우 error.jsp 로 이동 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a = 1, b = 0;
%>
<p>a+b = <%=a+b %></p>
<p>a-b = <%=a-b %></p>
<p>a*b = <%=a*b %></p>
<p>a/b = <%=a/b %></p>
</body>
</html>
<!-- try catch로 에러가 날 경우 대비해야하는데, 하지 않고 isErrorPage/errorPage로 에러가 날 경우 보여줄 페이지 작성 가능 -->