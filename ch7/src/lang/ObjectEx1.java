package lang;
/*	java.lang 패키지 : import 구문 없이 사용 가능
 *	Object : 모든 클래스의 부모
 */
public class ObjectEx1 {
	public static void main(String[] args) {
		
		Object obj1 = new Object();	//객체 생성. object 는 디폴트 생성자만 있음
		Object obj2 = new Object();
		
		//equals( ) : obj1과 obj2가 같은 객체냐?
		if(obj1.equals(obj2)) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		System.out.println(obj1 == obj2 ? "같음":"다름");
		//Object의 toString () 메소드
		System.out.println("obj1 toString "+obj1.toString());	//java.lang.Object@5e91993f
		System.out.println("obj2 toString "+obj2.toString());	//java.lang.Object@1c4af82c
		
		
		
		
		//Value 부모 : Object 클래스
		//부모 메소드 + Value 객체 메소드 사용 가능
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		System.out.println(v1.equals(v2) ? "v1==v2 같음" : "v1!=v2 다름");
		System.out.println("V1 toString "+v1.toString());	//lang.Value@cac736f
		//public boolean equals(Object obj) 호출
		//Object obj = v2
		//Value v = obj 형변환이 있어야함
		
		
		Person p1 = new Person(80110581122L);
		Person p2 = new Person(80110581122L);
		System.out.println(p1.equals(p2)? "p1과 p2는 같은 사람":"p1과 p2는 다른 사람");
		//toStrin() 이 오버라이딩 되어 있다면 참조변수명만 사용해도 됨
		System.out.println(p1);	// p1==p1.toString() 결과가 같다는뜻.
		System.out.println(p1.toString());
		
		Card card1 = new Card();
		Card card2 = new Card("HEART", 10);
		System.out.println(card1);
		System.out.println(card2);
	}

}
