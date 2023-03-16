package ch3;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 >>");
		int input = Integer.parseInt(sc.nextLine());
//		String result = input%2==0 ? "짝수" : "홀수";
//		System.out.println(result);
//		삼항연산자 부분 if else 구문으로 바꿀수있다
		
		//if else	==> 삼항연산자로 바꿀수있다
		String result="";	//초기화 "" String이여서 허용됨
		if (input%2==0) {
			 result = "짝수";
		}else {
			 result = "홀수";
		}
		//result cannot be resolved to a variable -> 변수 선언 안했어요 result 몰겠음
	//	System.out.println(result);		=> 지역변수 result가 블럭안에 있어서 못 불러옴
		System.out.println(result);
		
		
	}

}
