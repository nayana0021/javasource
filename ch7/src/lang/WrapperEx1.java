package lang;
/* 타입
 * 1) 기본형 : byte, short, int, long, float, double, boolean, char -> 다 소문자 있는거라고 생각하면 됨
 * 2) 참조형 : 배열, 클래스, 인터페이스 -> 대부분 대문자,배열표시 있는거라고 생각하면 됨
 * 
 *  Wrapper 클래스
 * 		-8개의 기본형을 객체로 다룰 때 사용
 */
public class WrapperEx1 {
	public static void main(String[] args) {
		// 정수형을 다룰 때
		// 1) 기본형
		int a = 3;
		char ch = 'a';
		byte b = 4;
		float f = 4.15f;
		double d =4.5;
		boolean b3 = true;
		long l = 123L;
		
		// 2) 참조형 : 클래스(인터페이스) 만들어져 있다. 제공된다. 객체로 구성되어있다. (메소드를 사용할 수 있다)
//		Integer i = new Integer(3);	//The constructor Integer(int) is deprecated since version 9 - 9버전부터없어짐
		Integer i2 = 3;
		Integer i3 = 3;
//		Character  ch2 = new Character('a');
		Character ch2 = 'a';
		Byte b2 = 4;
		Float f2 = 4.15f;
		Double d2 = 4.5;
		Boolean b4 = false;
		Long l2 = 123L;
		
//		int를 객체 타입을 바꾸고 싶을 때 사용하는 클래스(wrapper class) : Integer
//		ch를 객체 타입을 바꾸고 싶을 때 사용하는 클래스(wrapper class) : Character
//		byte를 객체 타입을 바꾸고 싶을 때 사용하는 클래스(wrapper class) : Byte
//		float를 객체 타입을 바꾸고 싶을 때 사용하는 클래스(wrapper class) : Float
//		double를 객체 타입을 바꾸고 싶을 때 사용하는 클래스(wrapper class) : Double
//		boolean를 객체 타입을 바꾸고 싶을 때 사용하는 클래스(wrapper class) : Boolean
//		long를 객체 타입을 바꾸고 싶을 때 사용하는 클래스(wrapper class) : Long
		
		
		System.out.println(i2.equals(i3));
		System.out.println(i2 == i3);
		
		System.out.println("문자 형태의 숫자를 정수로 Integer.parseInt()"+Integer.parseInt("10"));	//static임
		System.out.println("문자 형태의 숫자를 실수로 Double.parseDouble()"+Double.parseDouble("10"));	//static임
		Float.parseFloat(""); 
		Boolean.parseBoolean("true"); 
		Long.parseLong("10");
		
		//기본형으로 선언된 변수를 참조형에 바로 대입 가능
		Integer i4 = a;
		
		
		
	}

}
