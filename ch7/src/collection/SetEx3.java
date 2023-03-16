package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {
	public static void main(String[] args) {
		// Person 객체를 Set 구조에 담기
		Set<Person> set = new HashSet<>();	//<>생략가능 Person 넣어도 된다 자동으로 불러왔더니 생략이 되어있응 
		//사용자 정의 객체는 중복 저장을 허용함
		//허용하지 않으려면?-> 중복 저장이 안되도록 equals(), hashcode() 오버라이딩 해야 함 : Person클래스에 함
		set.add(new Person("David",10));
		set.add(new Person("David",10));	//개발자가 만든 객체들에 대한 중복의 형태는 중복값을 처리못해준다.Integer는 중복값안담김-이것도 사실 오버라이딩이 되어있는것임
		
		System.out.println(set);
		
		
		
		
		
		
	}

}
