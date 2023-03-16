package ch6;

public class Person {
	String name;
	float height;
	float weight;
	
	void print() {
		System.out.println("이름 : "+name);
		System.out.println("키 : "+height);
		System.out.println("몸무게 : "+weight);
	}
	
	//name 매개변수에 값을 받아서
	//person이 가지고 있는 name 인스턴스변수의 값을 변경 세팅만할거라 리턴값이 없어서 void로 함
	public void setName(String name) {
		//name이 공백이 아니고 null 아니면
		//공백이거나 null이면 기본값을 홍길동
		if(name.equals("") || name==null) {
			this.name = "홍길동";
		}else {
			this.name = name;
		}
			
//		print();	//다른 클래스에 들어있어서 부를수있음
		
	}
	static void print2() {
		Person p = new Person();
//		setName("");	생성되는 시기가 달라서 스태틱이 있는 곳에서 스태틱을 못불러
		p.setName("");
	}
	
	
	
}
