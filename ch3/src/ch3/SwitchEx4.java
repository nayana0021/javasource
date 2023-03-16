package ch3;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		// +,-,*,/,%
		
		//사용자로부터 두개의 피연산자와 연산자를 입력받기
		//연산을 수행한 후 출력
		//연산자 입력 op로 사용 (operator)
		
		Scanner sc = new Scanner(System.in);
		//첫번째 수 입력
		System.out.print("숫자1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		//연산자 op 입력
		System.out.print("연산자 : ");	//==>String
		String op = sc.nextLine();
		//두번째 수 입력
		System.out.print("숫자2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		int result = 0;
		
		switch (op) {
		case "+":
			result= num1+num2;
			break;
		case "-":
			result= num1-num2;
			break;
		case "*":
			result= num1*num2;
			break;
		case "/":
			result= num1/num2;
			break;
		default:
			result= num1%num2;
			break;
		}
		System.out.printf("%d %s %d = %d\n",num1,op,num2,result);
		System.out.println(num1 + op + num2 + "="+result);
	
	}

}
