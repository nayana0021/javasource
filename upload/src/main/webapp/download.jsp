<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// 사용자가 다운로드 받기를 원하는 파일명
	String fileName = request.getParameter("fileName");

	// 서버 폴더에 가서 사용자가 요청한 해당 파일 가져오기 (브라우저에서 해석이 가능한 사진이나 txt파일은 바로 열림)
	// 자바 File 
	FileInputStream fis = new FileInputStream("/Users/youngkyung/Documents/upload/"+fileName);
	BufferedInputStream bis = new BufferedInputStream(fis);
	
	out.clear();
	out = pageContext.pushBody();
	
	
	// 브라우저에 파일 붙여서 보내기
	// uuid 값 제거  : 1e9c7705-19cb-4f88-8b8c-9d2fa4cb54ab_배경1.jpg
	fileName = fileName.substring(fileName.indexOf("_")+1);
	// 인코딩 : te st.jpg ==> te\\+st.jpg 공백 정리가 됨  (한글,특수문자 때문에 깨지기 때문에 사용)
	fileName = URLEncoder.encode(fileName, "utf-8").replaceAll("//+", "%20"); // 공백을 %20으로 바꿔저
	response.setContentType("application/octet-stream"); // MIME 타입
	response.setHeader("Content-Disposition", "attachment;filename="+fileName);
	
	BufferedOutputStream buf = new BufferedOutputStream(response.getOutputStream());
	
	int numRead=0;
	byte[] b = new byte[4896];
	while((numRead = bis.read(b))!=-1){
		buf.write(b, 0, numRead);
	}

	buf.flush();
	buf.close();
	bis.close();
%>
