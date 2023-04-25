<%@page import="java.util.List"%>
<%@page import="user.domain.UserDTO"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	UserDAO dao = new UserDAO();
	List<UserDTO> list = dao.getList();
	
	// 결과값 list 를 list.jsp 에서 보여주고 싶음
	request.setAttribute("list", list);
	pageContext.forward("list.jsp");

%>