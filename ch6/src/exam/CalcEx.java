package exam;
//자식클래스들이 하는 일이 다 다르면 추상클래스를 쓴다

import java.util.Scanner;

public class CalcEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Num1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Input Num2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Input operator : ");
		String op = sc.nextLine();
		
		Calc calc = null;	//다형성 : 왼쪽 부모 오른쪽 자식 - 코드를간결하게..
		switch (op) {
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;
		}
		//결과는 한번에
		calc.setValue(num1, num2); //부모한테있음
		System.out.println("결과 "+calc.calculate());	//자식한테 오버라이딩 되어서 다 있음
		
	}
}
