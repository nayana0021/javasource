<%@page import="user.domain.UserDTO"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	int no = Integer.parseInt(request.getParameter("no"));
	//out.print("no"+no);
	
	UserDAO dao = new UserDAO();
	UserDTO dto = dao.getRow(no);

	request.setAttribute("dto", dto);
	pageContext.forward("get.jsp");
%>
