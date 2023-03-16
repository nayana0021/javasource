package ch2;

/*연산자
 * 1)단항연산자
 * 		+(양수), -(음수), ++, --, ~, !
 * 2)이항연산자
 * 		산술 : +, -, *, /, %, <<, >>, >>>
 *		비교 : >, <, >=, <=, ==(값이 같다면), !=(값이 같이 않다면)
 * 		논리 : &&(and), ||(or), ^(xor), &(and), |(or)
 * 3)삼항연산자 : ? :
 * 4)대입연산자 : = 	ex) a=4;
 * 
 * 연산자 우선순위
 * 5+(3*4)
 */

public class OperatorEx2 {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		//	비교연산자 : 결과값은 boolean 의 형태로 나옴
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		
		boolean result = num1==num2;	//변수로 담을수도 있음
		System.out.println(result);
		
		//A:65, a:97 		+알파벳26자(~Z) 판단하기
		char ch1='A';
		char ch2='B';
		System.out.println("ch1==ch2= "+(ch1==ch2));
		System.out.println("ch1!=ch2= "+(ch1!=ch2));
		System.out.println("ch1>=ch2= "+(ch1>=ch2));
		System.out.println("ch1<=ch2= "+(ch1<=ch2));
		
		
		//정밀도 부분에서 차이가 있다 크기 비교를 하게되면 같은 값이 아니다 더블이 값 표현 범위가 더 커서 그렇다
		double d1=0.4;
		float f1=0.4f;
		System.out.println("d1==f1="+(d1==f1));
		System.out.println("d1!=f1="+(d1!=f1));
		System.out.println("d1>=f1="+(d1>=f1));
		System.out.println("d1<=f1="+(d1<=f1));
		
		
		
		
		
	}

}
