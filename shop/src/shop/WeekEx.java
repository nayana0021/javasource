package shop;

public class WeekEx {
	
	final int NUM = 1;
	
	public static void main(String[] args) {
		// 요일명은 고정이고 변경되지 않는 형태이기 때문에 
		// 상수 형태로 선언이 가능하다
		// 클래스는 아님 열거타입 모아서
		// 내가 필요한 시점에 불러다 쓸수있다
		Week week1 = Week.FRIDAY;
		System.out.println(week1);
		
	}

}
