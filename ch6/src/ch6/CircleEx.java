package ch6;

public class CircleEx {
	public static void main(String[] args) {

		//객체 생성 => 초기화
		Circle circle = new Circle(3.5);
		
		//메서드 호출
		System.out.println("원의 넓이 : "+circle.getArea());
		
		Circle circle1 = new Circle(4.8);
		System.out.println("원의 넓이 : "+circle1.getArea());

		Circle circle2 = new Circle(5.3);
		System.out.println("원의 넓이 : "+circle2.getArea());
	}

}
