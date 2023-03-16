package ch6;

import java.util.Arrays;

public class TvEx2 {
	public static void main(String[] args) {
		//객체 배열 : 많은 수의 객체를 다뤄야 할 때 배열로 처리
		
		//타입[] 배열명 = new 타입[개수];		-> 주소만 생기는 단계
		int[] arr = new int[3];
		System.out.println(Arrays.toString(arr));
		
		//초기화 -> 초기화를 해줘야 값을 사용할수있음
		arr[0] =15;
		arr[1] =25;
		arr[2] =35;
		System.out.println(Arrays.toString(arr));
		
		int arr2[] = {25,35,45};
		System.out.println(Arrays.toString(arr2));

		//객체배열
		//참조타입[] 배열명 = new 타입[개수];
		Tv[] tvArr = new Tv[3];	//객체(tv)를 다루기 위한 배열 선언 공간만 생성됨
		System.out.println(tvArr[0]);	//null
		System.out.println(tvArr[1]);	//null
		System.out.println(tvArr[2]);	//null 참조타입은 다 null로 세팅
		
		//초기화(타입에 맞춰서)
		tvArr[0] = new Tv();
		tvArr[1] = new Tv();
		tvArr[2] = new Tv();
		System.out.println(tvArr[0].channel);	//
		System.out.println(tvArr[1].channel);	//
		System.out.println(tvArr[2].channel);	//
		
		//내가 int를 담을거냐 객체를 담을거냐 
		
		
		//객체 생성하고 초기화 한꺼번에 처리
		//int arr2[]={25,35,45}; 를 객체로 하면 이렇게 표현
		Tv tvArr2[]= {new Tv(), new Tv(), new Tv()};
		
		//기본생성자 있는 상태
	}
}