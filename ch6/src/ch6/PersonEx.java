package ch6;

public class PersonEx {
	public static void main(String[] args) {
		//person 인스턴스 생성됨=>person이 가지고 있는 인스턴스 변수, 메소드 사용 가능
		 Person p = new Person();	
//		 print();	//이렇게는 못함 외부에서는 뭘 불라와야하는지 몰라 객체를 생성해줘야 함
		 p.setName("");
		 p.print();
		 
		 //다른곳에서 스태틱 메서드불러올거야 클래스이름.메서드이름
		 Person.print2();
		 
		 
		
	}

}
