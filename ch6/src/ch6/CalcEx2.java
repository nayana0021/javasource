package ch6;

public class CalcEx2 {
	public static void main(String[] args) {
		//리턴값이 있으면 1)출력하던지 2)변수로받던지
		
		Calc2 calc = new Calc2();
		
		
		System.out.println(calc.add(5,3));
		
		System.out.println(calc.add(5,3L));
		
		System.out.println(calc.add(5L,3));
		
		System.out.println(calc.add(5,3.0f));
		
		int num[] = {100,200,300,400};
		System.out.println(calc.add(num));
		
		
		
		
	}

}
