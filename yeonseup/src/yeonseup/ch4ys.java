package yeonseup;


public class ch4ys {
	public static void main(String[] args) {
		//ForEx1
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		for (int i = 10; i >= 1; i--) {
			System.out.println(i+"  ");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i+"  ");
		}
		
		System.out.println();
		
		for (int i = 1; i <=10; i+=2) {
			System.out.println(i+"  ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Hello");
		}
		
		System.out.println();
		
		for (int i = 1; i <=100; i++) {
			System.out.println(i+"  ");
		}
		
		System.out.println();
		
		for (int i = 1; i <=100; i+=2) {
			System.out.println(i+"  ");
		}
		
		System.out.println();
		
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			sum+=i;
		}
		System.out.println("1~10까지 합 = "+sum);
		//whileEx1
		
//		int i = 0;
//		while (i < 10) {
//			System.out.print(i+"  ");
//			i++;
//		}
//		
//		System.out.println();
//		
//		i = 10;
//		while (i >= 1) {
//			System.out.print(i+"  ");
//			i--;
//		}
//		
//		System.out.println();
//		
//		i = 1;
//		while (i <= 10) {
//			System.out.print(i+"  ");
//			i++;
//		}
//		
//		//i+=2;	--> i=i+2;
//		System.out.println();
//		
//		//1 3 5 7 9
//		i = 1;
//		while (i <=10) {
//			System.out.print(i+"  ");
//			i+=2;
//		}
//		
//		System.out.println();
//		i = 0;
//		while (i<3) {
//			System.out.println("Hello");
//			i++;
//		}
//		
//		System.out.println();
//		i = 1;
//		while (i<=100) {
//			System.out.print(i+"  ");
//			i++;
//		}
//		
//		System.out.println();
//		
//		i = 1;
//		while (i<=100) {
//			System.out.print(i+"  ");
//			i+=2;
//		}
//		
//		System.out.println();
//		
//		int sum = 0;
//		i = 1;
//		while (i <=10 ) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("1~10까지의 합 = "+sum);
		
//		//whileEx2
//		
//		//구구단출력
//		//6단 출력
//		
//		int i = 1;
//		while (i<10) {
//			System.out.printf("6 * %d = %d\n",i,(i*6));
//			i++;
//		}
//		
//		System.out.println();
//		
//		int sum = 0, j = 0;
//		
//		while (true) {	//무조건 계속 수행.. : 무한루프 break를 사용하여 반복문에서 벗어날수있다
//			if (sum>100) break; 
//				++j;
//				sum+=j;
//		}
//		System.out.println("j="+j);
//		System.out.println("sum="+sum);
		
		
		
		
	}

}
