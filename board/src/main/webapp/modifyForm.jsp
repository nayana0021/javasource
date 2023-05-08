<%@page import="board.domain.BoardDTO"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp"%>
<main>
	<h2>Board Update</h2>
	<form action='<c:url value="/update.do"/>' method="post" enctype="multipart/form-data">
  <div class="row mb-3">
    <label for="inputName" class="col-sm-2 col-form-label">작성자</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputName" name="name" value="${dto.name}" readonly>
    </div>
  </div>  
  <div class="row mb-3">
    <label for="inputTitle" class="col-sm-2 col-form-label">제목</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="inputTitle" name="title" value="${dto.title}" >
    </div>
  </div>
   <div class="row mb-3">
    <label for="inputContent" class="col-sm-2 col-form-label">내용</label>
    <div class="col-sm-10">
    <textarea rows="10" class="form-control" id="inputContent" name="content" >${dto.content}</textarea>
    </div>
  </div>
    <div class="row mb-3">
    <label for="inputAttach" class="col-sm-2 col-form-label">파일첨부</label>
<%--     <div class="col-sm-10">
    	<a href="download.jsp?fileName=${dto.attach}">${dto.attach}</a> <!-- 파일 태그 누르면 다운로드가 됨 -->
    </div>
 --%>  
 	<%-- 파일명에 ++ 와ㅏ 같은 특수문자가 들어있거나 하는 경우에는 다운로드 요청시 문제가 생김
 	
 	 --%>
 	<div class="col-sm-10">
 	 <%
 	 // EL 자체를 자바코드에서 사용할 수 없다
 	 // 다운로드 받을 파일명 가져오기 --> EL과 java코드가 호환이 안됨 ${dto.attach} 사용 못함
 	 
 	 	BoardDTO dto = (BoardDTO)request.getAttribute("dto"); // 형변환 반드시 하라구
 	 	
 	 	String attachFullName = dto.getAttach();
 	 	
 	 	if(attachFullName!=null){
 	 		// 작성자가 올린 파일명 분리
 	 		String attachName = attachFullName.substring(attachFullName.indexOf("_")+1);
 	 		// 특수문자 해결 (uuid 포함된 이름으로)
 	 		String encodeAttach = URLEncoder.encode(attachFullName, "utf-8"); 
 	 		out.print("<a href='download.jsp?fileName="+encodeAttach+"'>");
 	 		out.print(attachName); // 작성자가 올린 파일명만(uuid 빼고)
 	 		out.print("</a>"); // 이렇게 길게 하기 싫다고 하면 writeForm에서 파일 첨부를 할때 스크립트로 제한을 두면 된다(올릴 수 있는 파일이나 특수문자 이름 제한하도록)
 	 	} else{
 	 		out.print("<input type='file' class='form-control' id='inputAttach' name='attach'>");
 	 	}
 	 		
 	 
 	 %>
 		
 	</div>
	 <div class="row mb-3">
		    <label for="inputPassword" class="col-sm-2 col-form-label">비밀번호</label>
		    <div class="col-sm-10">
		      <input type="password" class="form-control" id="inputPassword" name="password" required>
		    </div>
	  </div>
	 </div>
	 <input type="hidden" name="bno" value="${dto.bno}" /> <!-- form 안에만 담아주면 됨 bno숨기기 -->
	  	<input type="hidden" name="criteria" value="${pageDTO.criteria}" />
	<input type="hidden" name="keyword" value="${pageDTO.keyword}" />
	<input type="hidden" name="page" value="${pageDTO.page}" />
	<input type="hidden" name="amount" value="${pageDTO.amount}" />
	  <button type="submit" class="btn btn-primary">수정</button>
	  <button type="button" class="btn btn-danger">삭제</button>
	  <button type="button" class="btn btn-success">목록보기</button>
	</form>
</main>
<form action="" id="modifyForm"> <!-- method 따로 지정하지 않으면 get이어서 주소줄에 따라감 -->
	<input type="hidden" name="bno" value="${dto.bno}" /> 
	<input type="hidden" name="password" value="" id="password" />
	<input type="hidden" name="criteria" value="${pageDTO.criteria}" />
	<input type="hidden" name="keyword" value="${pageDTO.keyword}" />
	<input type="hidden" name="page" value="${pageDTO.page}" />
	<input type="hidden" name="amount" value="${pageDTO.amount}" />
</form>

	<script src='<c:url value="/js/modify.js" />'></script>
<%-- <script src='<c:url value="/js/read.js" />'></script> --%>
<%@ include file="include/footer.jsp"%>