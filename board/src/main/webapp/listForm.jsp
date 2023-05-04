<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>

	<h2>Board List</h2>
<form class="row g-3 justify-content-center" action='<c:url value="/list.do"/>' > <!-- form이 get 방식이라 주소줄 달려보내는거 안 적어도 됨 ?criteria=&keyword= -->
 <div class="col-auto">
	<select class="form-select" name="criteria">
		<option value="n" <c:out value="${pageDTO.criteria == null?'selected':'' }"/> >검색기준선택</option>
		<option value="title" <c:out value="${pageDTO.criteria == 'title'?'selected':'' }"/> >title</option>
		<option value="name" <c:out value="${pageDTO.criteria == 'name'?'selected':'' }"/> >name</option>
		<option value="content" <c:out value="${pageDTO.criteria == 'content'?'selected':'' }"/> >content</option>
	</select>
 </div>
 <div class="col-md-5">
	<input type="text" class="form-control" placeholder="검색어" name="keyword" value="${pageDTO.keyword}"> <!-- boardActionList 에서 담은 pageDTO -->
 </div>
 <div class="col-auto">
	<button type="submit" class="btn btn-secondary">검색</button>
 </div>
</form>
	
	<table class="table">
  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">작성자</th>
      <th scope="col">작성일</th>
      <th scope="col">조회수</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="dto" items="${list}">
    <tr>
      <th scope="row">${dto.bno}</th> <!-- BoardDTO에 있는 필드명과 똑같아야 한다 -->
      <td>
	      <c:if test="${dto.reLev != 0}"> 
	      	<c:forEach begin="0" end="${dto.reLev*1}"> <!-- *1 안해도 상관은 없고(re_lev 값이 있으니) *n을 함으로 공백을 많이 줄 수 있음 -->
	      		&nbsp; <!-- 공백으로 표시한것임 나중에 원하는 아이콘이나 등 사용 -->
	      	</c:forEach>
	      	<span class="material-symbols-outlined"> <!-- 구글 폰트 아이콘 사용 -->
				subdirectory_arrow_right
			</span>
	      </c:if>
      	<a href='<c:url value="/cntUpdate.do?bno=${dto.bno}"/>'>${dto.title}</a>
      </td>
      <td>${dto.name}</td>
      <td>${dto.regDate}</td>
      <td>${dto.cnt}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<script src='<c:url value="/js/list.js"/>'></script>
<%@ include file="include/footer.jsp" %>