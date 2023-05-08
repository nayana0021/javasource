/**
 * 
 */

 document.querySelector(".btn-success").addEventListener("click", ()=>{
	// location.href="list.do";
	 modifyForm.action = "list.do";
	 modifyForm.submit();
 })
 
	
	const modifyForm = document.querySelector("#modifyForm");
// 삭제 버튼 클릭 시 modifyForm 전송
// action=delete.do
document.querySelector(".btn-danger").addEventListener("click",()=>{
	//password 입력 여부 확인
	const password = document.querySelector("#inputPassword");
	
	if(password.value==""){
		alert("비밀번호를 입력해 주세요");
		password.focus();
		return;
	}
	// 사용자가 입력한 비밀번호를 가져와서
	// id / password 요소의 value 값으로 세팅
	document.querySelector("#password").value = password.value;
	
	modifyForm.action = "delete.do";	 // 액션 지정
	modifyForm.method = "post";			// 메소드를 post 로 지정
	console.log(modifyForm);
	modifyForm.submit();				// submit
	
})
	
	
	
