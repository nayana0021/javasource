/**
 * 	폼 모든 요소가 비어있는지 확인 하나라도 비어있다면 못 가게 막기
 */

	const form = document.querySelector("form");
	
 	form.addEventListener("submit", (e) => {
		 e.preventDefault();
		 
	const id = document.querySelector("#userid");
	const pwd = document.querySelector("#password");
	const name = document.querySelector("#name");
	const gdr = document.querySelector("form div:nth-child(4)");
	console.log(gdr);
	const eml = document.querySelector("#email");
	
	if(id.value === ""){
		alert("아이디를 입력해 주세요")
		id.focus();
		return;
	}else if(pwd.value === ""){
		alert("비밀번호를 입력해 주세요")
		 pwd.focus();
		 return;
	 }else if(name.value === ""){
		 alert("이름을 입력해 주세요")
		 name.focus();
		 return;
	 }else if(gdr.value === ""){
		 alert("성별을 입력해 주세요")
		 gdr.focus();
		 return;
	 }else if(eml.value === ""){
		 alert("이메일을 입력해 주세요")
		 eml.focus();
		 return;
	 }
		 
		 
		 
		 
	 })