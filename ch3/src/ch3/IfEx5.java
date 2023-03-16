package ch3;

import java.util.Scanner;

public class IfEx5 {
	public static void main(String[] args) {
		//중첩 If
//		if (condition) {
//			if (condition) {
//			
//			}else {
//				
//			}
//		}else {
//			if (condition) {
//			
//			}else {
//				
//			}
//		}
		
		//점수를 입력받아서 
		//점수가 90점이상이면 A인데, 98이상이라면 A+, 94미만 A-
		//점수가 80이상이면  B인데, 88이상이라면 B+, 84미만 B-
		//점수가 80미만이면  C
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = Integer.parseInt(sc.nextLine());
		
		char grade = ' ', opt='0';
		
		if(score>90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			}else if(score<94) {
				opt = '-';
			}
		}else if(score>80) {
			grade = 'B';
			if(score>=88) {
				opt = '+';
			}else if(score<84) {
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다",grade,opt);
		
		//if중첩의 구조로 가면 코드를 간결하게 표현이 가능
		
	}

}
