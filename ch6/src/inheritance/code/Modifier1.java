package inheritance.code;

import modifier.Account;


public class Modifier1 {
	//참조타입은 null로 세팅
	//	String str = new String("Hello"); 원래 스트링은 이렇게 객체생성하고 초기화를 해야하는데 
	//	String str="Hello";	//워낙에 많이 쓰다보니 걍 허용한거임

	Account acc=new Account();	//The type modifier.Account is not visible(public 이 생략되면)
	
	int age;	//기본타입은 정수형-0, 실수형-0.0, boolean-false 로 세팅
	
	private void print() {
		
		
		//Account가 가지고 있는 ano 접근하고 싶다면?
		String ano = acc.getAno();
		System.out.println("ano : "+ano);
		
		acc.setAno("111-22");
		System.out.println("ano : "+acc.getAno());
	}
	public static void main(String[] args) {
		//static 메소드에서 non-static 메소드 호출하기
		// 1) 같은 static으로 만들기
		// 2) 객체 생성 후 접근하기
		Modifier1 modifier1 = new Modifier1();
		modifier1.print();
		
		// java.lang.NullPointerException -> 런타임오류
		
		//메소드는 대부분 public이다
	}


}
