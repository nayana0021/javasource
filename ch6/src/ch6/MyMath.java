package ch6;
/*
 * 인스턴스 메소드 : 인스턴스(객체)를 생성하고 사용해야 함
 * 클래스(static) 메소드 : 인스턴스를 생성하지 않고도 바로 사용이 가능함
 * 						클래스명.메소드명() --> 사용법 외부에서 부를때!
 * 내부에서 부르는 것은 이름만 ex) copy라는 메소드가 있으면 copy로 부른다
 */
public class MyMath {
	// 멤버(인스턴스)변수
	long a, b;
	
	long add() {
		return a + b;
	}
	long subtract() {
		return a - b;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b; 
	}

	// 기본형 매개변수(지역변수)를 이용한 사칙연산
//	static long add2() {
//		//Cannot make a static reference to the non-static field b
//		//static 메소드안에서는 인스턴스 변수를 바로 사용할 수 없음
//		return a + b;
//	}	

	static long add(long a, long b) {
		return a + b;
	}
	
	static long subtract(long a, long b) {
		return a - b;
	}
	static long multply(long a, long b) {
		return a * b;
	}
	static double divide(long a, long b) {
		return a / (double)b;
	}

}
