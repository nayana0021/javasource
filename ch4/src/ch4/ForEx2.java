package ch4;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		//주사위 5번 던지기
		
//		int dice1 = (int)(Math.random()*6)+1;
//		int dice2 = (int)(Math.random()*6)+1;
//		int dice3 = (int)(Math.random()*6)+1;
//		int dice4 = (int)(Math.random()*6)+1;
//		int dice5 = (int)(Math.random()*6)+1;	이렇게 반복하느니 for를 이용하여 반복문을 만들겠다
		
		for (int i = 1; i <=6; i++) {
			int dice = (int)(Math.random()*6)+1;
			System.out.println(dice);
		}
		
		//구구단출력
		//5*1=5
		//5*2=10
		//5*3=15
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("5 * %d = %d\n",i,(5*i));
		}
		
		System.out.println();
		
		//입력받아서 구구단 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("출력을 원하는 단을 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n ",num,i,(num*i));
		}
		
		//3의 배수와 5의 배수 합 구하기(단 1~100사이의 숫자)
		
		int sum = 0;
//		//3의 배수
//		i%3==0
//		//5의 배수
//		i%5==0
		for (int i = 1; i <= 100; i++) {
			if (i%3==0 || i%5==0) {
				sum+=i;
			}
		}
		System.out.println("3과 5의 배수의 합 : "+sum);
		
		//3의 배수 합(단, 9의 배수는 빼기)
		//sum 변수는 그대로 사용
		sum = 0;
		
		for (int i = 1; i <= 100; i++) {
			if(i%3==0 && i%9!=0) {
				sum+=i;
			}
		}
		System.out.println("3의 배수의 합(단9의 배수 아님) : "+sum);
		
		
		
	}

}
