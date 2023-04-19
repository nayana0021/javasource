<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isErrorPage="true"%> <!-- isErrorPage 초기값은 false -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>에러가 발생했습니다. 잠시 후 접속해 주세요</p>
	<!-- e.printStackTrace() or e.getMessage() -->
	<p><%=exception.getMessage() %></p> <!-- e 라고 못 씀 exception 이라고 이름이 정해져있다 -->
</body>
</html>