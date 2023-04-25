<%@page import="user.domain.UserDTO"%>
<%@page import="user.persistence.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	// 수정할 회원 정보 보여 준 후 새로운 값을 입력한 후 수정 버튼 누르면 새로운 값으로 업데이트
	int no = Integer.parseInt(request.getParameter("no"));

	UserDAO dao = new UserDAO();
	UserDTO dto = dao.getRow(no);

	request.setAttribute("dto", dto);
	pageContext.forward("modify.jsp");
%>
