package collection;

import java.util.LinkedList;

/*
 * 배열과 List 동일한 개념
 * 배열은 크기를 변경할 수 없다(새로운 배열을 생성해서 데이터 복사 작업이 필요함)
 * 비순차적인 데이터의 추가 또는 삭제에 시간이 많이 걸림(중간에 데이터의 추가, 삭제 작업이 불편함)
 * 
 * ==> 배열의 개선 : List(ArrayList 내부적으로는 배열의 동작방식과 똑같이 돌아감)
 * 
 * LinkedList (- 데이터양이 많아야 효율적임 중간에 삽입삭제가 많다면 고려해볼만 함 근데 데이터가 너무 많으면 억세스타임이 길어지는 단점이 있다)
 * -ArrayList 단점 보완
 * 
 * 				  읽기(접근시간)		추가/삭제		비고
 * ArrayList 		빠르다			느리다  		순차적인 추가/삭제는 더 빠름, 비효율적인 메모리 사용
 * LinkedList		느리다			빠르다		데이터가 많을수록 접근성이 떨어짐
 * 
 */
public class ListEx3 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("사과");
		list.add("체리");
		list.add("바나나");
		list.add("아보카도");
		list.add("멜론");
		list.add("딸기");
		list.add("수박");
		list.add("귤");
		
		for (String fruit : list) {
			System.out.println(fruit);
		}
		
		//만드는 방법은 이렇고 ArrayList와 쓰는 방법은 동일하다
		
		
		
		
		
		
	}

}
