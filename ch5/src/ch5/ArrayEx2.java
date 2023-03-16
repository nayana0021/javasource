package ch5;

import java.util.Arrays;

//기본타입-byte,char,short,int,long,float,double,boolean //stack만 씀
//참조타입-String(클래스),배열	//stack에서 주소가 저장된다 -> 주소가 가리키고있는 heap을 가줘야 원하는 값이 있다
//배열은 참조타입
//참조타입은 메모리를 두 군데 쓴다 -> stack, heap

public class ArrayEx2 {
	public static void main(String[] args) {
			int score[]=new int[5];
			
			for (int i = 0; i < score.length; i++) {
				score[i]=i*10;
			}
		System.out.println(score); 	//이렇게만 하면 의미는 없음 heap의 주소가 뜨는것임. 이 값을 알고 싶다면 밑에
		System.err.println(Arrays.toString(score));	//주소에 가서 값을 출력해줘 뜻 출력된 값 형식을 바꿀수는없다
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		System.out.println();
		
		//향상된 for문
		for (int i :score) {
			System.out.println(i);
		}
		
		int iArr2[] = new int[10];
		//1~10의 임의의 숫자를 생성해서 배열에 저장
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[i]=(int)(Math.random()*10)+1;
		}
		
		//출력
		System.out.println(Arrays.toString(iArr2));	//간단하게 값 출력하기 위해
		
		
		char chArr[]= {'a','b','c','가','나'};
		System.out.println(chArr);
		//배열은 주소 출력해준다했는데 문자는 값을 그냥 출력해준다 ==> 예외상황임
		
		String strArr[]= {"abc","efg"};
		System.out.println(strArr);	//String은 또 안 출력해줌.. => 안나오면 arrays로해서 출력하면 됨
		System.out.println(Arrays.toString(strArr));
	}

}
