package ch3;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		//근무시간 입력받기
		//8시간 초과 근무시 시간당 9800 일때
		//초과근무시 1.5배를 지급
		
		Scanner sc = new Scanner(System.in);
		System.out.println("근무시간을 입력하세요");
		int hours = Integer.parseInt(sc.nextLine());
		int rate = 9800;	//시간당 pay
		int pay = 0;		//하루일당
		
		// 8*9800 = 하루일당
		// 12시간 근무시
		if(hours>8) {
			pay = (int)((hours-8)*1.5*rate+rate*8);
		}else {	//hours가 8 이하일때
			pay = hours*rate;
		}
		System.out.println("하루 일당 : "+pay);
		
		
		//키 몸무게 입력받기
		System.out.print("키 입력 : ");
		int height = Integer.parseInt(sc.nextLine());
		System.out.print("몸무게 입력 : ");
		int weight = Integer.parseInt(sc.nextLine());
//		double weight = Double.parseDouble(sc.nextLine());	//parseInt 말고 parseDouble도 있음
		
		//저체중,표중,과체중 출력하는 프로그램 작성
		double result = (height-100)*0.9;
		// (키-100)*0.9 < 몸무게 : 과체중
		if(result<weight) {
			System.out.println("과체중");
		}else if(result==weight){
			System.out.println("표준");
		}else {
			System.out.println("저체중");
		}
		
		// (키-100)*0.9 == 몸무게 : 표준
		// (키-100)*0.9 > 몸무게 : 저체중
		//	if~else if, if~else if~else 
		
		
		//윤년 평년 구하기
		int year=2023;
		//윤년 :  연도를 4로 나눈 나머지가 0이고 
		//		 연도를 100으로 나눈 나머지가 0이 아니거나
		//		 연도를 400으로 나눈 나머지가 0이면
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		
		//임의의 숫자3개 입력받기
		//입력받은 3개의 숫자 중 가장 작은 수 출력하기
		System.out.println("첫번째 수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("두번째 수 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("세번째 수 : ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		// num1 < num2 && num1 < num3 ==> num1 작은값이 나옴. else if를 쓰면 조건을 또 써야해서 if 중첩
		
		//가장 작은 수
		int min = num1;
		if(min>num2) {
			min=num2;
		}if(min>num3) {
			min=num3;
		}
		System.out.println("가장 작은 수 : "+min);
		
		//가장 큰 수
		int max = num1;
		if(max<num2) {
			max=num2;
		}if(max<num3) {
			max=num3;
		}
		System.out.println("가장 큰 수 : "+max);
		
		
		
		
	}

}
