package ch1;

public class VariableEx1 {

	public static void main(String[] args) {
		/*
		 * 변수:단 하나의 값만 저장할 수 있는 메모리 공간
		 * 타입 변수명 = 값; => int num = 1; 
		 * 메모리에 어떤 값을 저장할 것인가? 에 따라 타입이 결정됨
		 * 문자 : 문자('가'-char), 문자열("가","가나다라")
		 * 숫자 : 정수 - byte, short, int, long
		 * 		 실수 - float, double
		 * 논리 : 참(true), 거짓(false)
		 * 자바 문장의 끝은 세미콜론으로 끝나야 함
		 * "쌍따옴표" 안에 넣으면 문자 그대로 출력됨
		 */
		
//		변수의 선언(int a ;)과 초기화(a=10;)
//		int c;
//		c=15;

		int a = 10, b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		
	}

}
