package ch1;

import java.util.Scanner;

public class VariableEx6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//사용자로부터 두개의 피연산자를 입력받기
		System.out.println("첫번째 수 입력 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 수 입력 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		
		//사칙연산 결과 출력
		System.out.println("num1+num2= "+(num1+num2));	//+ :연결의 의미이므로 계산하는게 아님
		System.out.println("num1-num2= "+(num1-num2));	//괄호를 해줘야함
		//The operator - is undefined for the argument type(s) String, int
		System.out.println("num1*num2= "+(num1*num2));
		System.out.println("num1/num2= "+(num1/num2));
		
		System.out.printf("num1+num2= %d\n", (num1+num2));
		System.out.printf("num1-num2= %d\n", (num1-num2));
		System.out.printf("num1*num2= %d\n", (num1*num2));
		System.out.printf("num1/num2= %d\n", (num1/num2));
		
		
	}

}
