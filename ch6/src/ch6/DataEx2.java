package ch6;

public class DataEx2 {
	public static void main(String[] args) {
		// 인스턴스 생성
		// 참조형타입 변수명 = new 참조형타입();
		Data d = new Data ();
		d.x = 10;
		Data d2 = copy(d);	//주소가 넘어감 	(d.x는 값이 넘어감)	 ->출력문으로 받은 경우가 아닌 변수로 받은 경우이다
		//메소드의 리턴타입이 void가 아닌 경우 리턴타입->1)출력문으로 받기 2)변수로받기
		System.out.println(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
		
	}

	
	
	static Data copy(Data d) {
		Data temp = new Data();
		//
		temp.x = d.x;
		return temp;
	}
	
	
}
