package inheritance;

//Math.random() : static 메소드
//Math.PI : final static double PI=3.141595000


public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;		//대문자 호출 - 상수
	}
	
}
