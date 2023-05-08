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
 	<input type="hidden" name="page" value="${pageDTO.page}" />
	<input type="hidden" name="amount" value="${pageDTO.amount}" /> <!-- form 안에만 있으면 됨 -->
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
		      		<a href='${dto.bno}' class="move">${dto.title}</a>
	      </td>
	      <td>${dto.name}</td>
	      <td>${dto.regDate}</td>
	      <td>${dto.cnt}</td>
		</tr>
	</c:forEach>
  </tbody>
</table>
<div class="row">
	<div class="col">
		<nav aria-label="page navigation">
		  <ul class="pagination justify-content-center">
		  
		  <c:if test="${pageDTO.prev}">
			    <li class="page-item">
			      	<a class="page-link" href="${pageDTO.startPage-1}">Previous</a>
			    </li>
		   </c:if>
		   <!-- 사용자가 요청한 번호와 idx 가 같은 상황이 생기면 activce라는 클래스명을 붙여줘 같지 않으면 붙여주지마 : active 는 부트스트랩 페이지 색 옵션임 -->
		   <c:forEach begin="${pageDTO.startPage}" end="${pageDTO.endPage}" var="idx">
			    <li class="page-item ${pageDTO.page == idx? 'active':'' }">
			    	<a class="page-link" href="${idx}">${idx}</a>
			    </li>
		   </c:forEach>
		    
		   <c:if test="${pageDTO.next}">
			    <li class="page-item">
			      	<a class="page-link" href="${pageDTO.endPage+1}">Next</a>
			    </li>
		   </c:if>
		  </ul>
		</nav>
	</div>
	<div class="col-2">
		<select class="form-select" aria-label="" name="amount">
			<option value="10" <c:out value="${pageDTO.amount == 10?'selected':''}"/> >10</option>
			<option value="20" <c:out value="${pageDTO.amount == 20?'selected':''}"/> >20</option>
			<option value="30" <c:out value="${pageDTO.amount == 30?'selected':''}"/> >30</option>
			<option value="40" <c:out value="${pageDTO.amount == 40?'selected':''}"/> >40</option>
		</select>
	</div>
</div>


<form action="list.do" id="actionForm">
	<input type="hidden" name="bno" value="" />
	<input type="hidden" name="criteria" value="${pageDTO.criteria}" />
	<input type="hidden" name="keyword" value="${pageDTO.keyword}" />
	<input type="hidden" name="page" value="${pageDTO.page}" />
	<input type="hidden" name="amount" value="${pageDTO.amount}" />
</form>
<script src='<c:url value="/js/list.js"/>'></script>
<%@ include file="include/footer.jsp" %>