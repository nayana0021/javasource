/**
 * 
 */

// index.html 에서 Start Board 버튼을 누르면 이동

// 전체리스트
//http://localhost:8082/board/list.do?criteria=&keyword=
//검색리스트
//http://localhost:8082/board/list.do?criteria=title&keyword=게시글
// value 는 비어있지만 이름은 따라가는 상태 get 방식
 document.querySelector(".btn-primary").addEventListener("click", ()=>{
	 location.href="list.do?criteria=&keyword=&page=1&amount=30";
 });