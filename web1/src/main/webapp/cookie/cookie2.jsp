<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// 사용자가 language 라는 이름의 쿠키가 있는지 확인
	String cookie = request.getHeader("Cookie"); // 헤더 정보에 쿠키라는게 있는지 물어보는 코드

	String language = "korea"; // 쿠키가 없으면 기본
	
	if(cookie != null){
		// 해당 서버가 저장해둔 쿠키가 있는지 확인
		Cookie[] cookies = request.getCookies();
		
		for(Cookie c:cookies){
			if(c.getName().equals("language")){
				language = c.getValue();
			}
		}
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

	if(language.equals("korea")){
		out.print("<h3>안녕하세요. 이것은 쿠키 예제입니다.</h3>");
	}else{
		out.print("<h3>Hello. This is Cookie Example.</h3>");
	}

%>
<%-- 사용자 언어 설정 --%>
<form action="cookie3.jsp" method="post">
	<input type="radio" name="language" id="" value="korea" <% if(language.equals("korea")){ %> checked <%} %>/> 한국어 페이지 보기
	<input type="radio" name="language" id="" value="english" <% if(language.equals("english")){ %> checked <%} %>/> 영어 페이지 보기
	<input type="submit" value="설정" />
</form>
</body>
</html>