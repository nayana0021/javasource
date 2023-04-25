<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/include/header.jsp"%>
<h1>도서 목록</h1>
<table class="table">
	<thead>
		<tr>
			<th>code</th>
			<th>title</th>
			<th>writer</th>
			<th>price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="dto" items="${list}">
			<tr>	
				<td>${dto.code}</td>
				<td><a href="readPro.jsp?code=${dto.code}">${dto.title}</a></td> <%-- 무조건 pk 하나 보낸다 --%>
				<td>${dto.writer}</td>
				<td>${dto.price}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="/include/footer.jsp"%>