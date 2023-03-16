package collection;

import java.util.Arrays;
import java.util.Comparator;

/* 정렬
 * 
 * Comparable 인터페이스 : 기본 정렬 기준을 구현할 떄 사용
 * 	1) compareTo(Object o)
 * 
 * Comparator 인터페이스 : 기본 정렬 기준 외에 다른 기준으로 정렬하고자 할 떄 사용
 * 	1) compare(Object o)
 * 
 */

public class ArraysEx2 {
	public static void main(String[] args) {
		Integer arr[] = {37,21,56,99,88,58,62,15,39,78};
		String strArr[] = {"cat", "Dog", "lion", "tiger", " ", "78"};
		
		//오름차순 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		// 사전 순으로 정렬(공백,숫자,대문자,소문자 순으로 정렬)
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		// 내림차순 정렬
		// sort(T a[], Comparator<? super T> c)	-> T a[] : 기본 타입이 아니어야함 참조타입으로!
//		Arrays.sort(strArr,new DescComp());
		
		// Comparator.reverseOrder() : 내림차순 , naturalOrder() : 오름차순
		Arrays.sort(strArr, Comparator.reverseOrder());
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(arr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
	}
}

// 정렬기준 새롭게 작성시 - 클래스 하나 만들어서 Comparator 구현해야함
class DescComp implements Comparator<String>{	//내림차순 구현

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * -1;
	}
}
