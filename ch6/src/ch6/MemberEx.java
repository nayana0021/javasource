package ch6;

public class MemberEx {
	public static void main(String[] args) {
		Member member1 = new Member("hong123","hong123@!","hong123@!","01012341234");
		Member member2 = new Member("hong123","hong123@!","hong123!","010145671234","서울 종로구");
		//전화번호 String 타입인 이유는 "01012341234"로 입력을 하기도 했고 0으로 시작하는 숫자는 없다.int나 long에 인식안됨
		//Member member1 = new Member 인데 new Member1이 안되는 이유는 클래스가 Member만 있어서 그렇다
		
		if(member1.passwordAndConfirmPasswordEquals()) {
			//true 라면 비밀번호가 일치합니다.
			System.out.println("비밀번호가 일치합니다");
		}else {
			//false 라면 비밀번호를 확인해주세요 메세지 출력.
			System.out.println("비밀번호를 확인해주세요");
		}
		
		System.out.println(member2.passwordAndConfirmPasswordEquals() ? "비밀번호가 일치합니다." : "비밀번호를 확인해주세요");
		
//		//이것보다 낫다
//		MemberEx obj = new MemberEx();
//		obj.memberInfo(member1);	//member1과 member2 내용 출력하기
//		obj.memberInfo(member2);	//member1과 member2 내용 출력하기
//			//내가 메소드를 가지고 있기 때문에 이름만으로도 부를수있다
//	}
//	  void memberInfo(Member member) {	//같은 타입으로 받아서 값 받으려고(Member member)라고 입력했다
//		//출력결과
//		System.out.println("아이디 : "+member.userid);		//아이디 : 초기값 출력
//		System.out.println("비밀번호 : "+member.password);		//비밀번호 : 초기값 출력
//		System.out.println("전화번호 : "+member.hp);			//전화번호 : 초기값 출력
//		System.out.println("주소 : "+member.address);			//주소: 초기값 출력

		memberInfo(member1);	//member1과 member2 내용 출력하기
		memberInfo(member2);	//member1과 member2 내용 출력하기
			//내가 메소드를 가지고 있기 때문에 이름만으로도 부를수있다
	}
	
	
	 static void memberInfo(Member member) {	//같은 타입으로 받아서 값 받으려고(Member member)라고 입력했다
		//출력결과
		System.out.println("아이디 : "+member.userid);		//아이디 : 초기값 출력
		System.out.println("비밀번호 : "+member.password);		//비밀번호 : 초기값 출력
		System.out.println("전화번호 : "+member.hp);			//전화번호 : 초기값 출력
		System.out.println("주소 : "+member.address);			//주소: 초기값 출력
	}
	
	 //
	 //공통요소에 올라가면 부르는게 편하다
	 
	
	
	
	
}
