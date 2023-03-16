package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* 컬렉션 프레임웍
 * 컬렉션 : 여러 데이터들을 모아 놓은 것
 * framework :  표준화, 정형화된 프로그래밍 방식
 * 
 * 라이브러리 :공통으로 사용될만한 유용한 기능을 모듈화
 * 
 *	 Collection
 * 
 *  List	set
 * 
 *  Map
 *  
 *  List 인터페이스 : 순서가 존재함, 데이터 중복 허용 - 배열과비슷한개념
 *  	구현클래스 : ArrayList, linkedList, Stack, Queue, Vector...
 *  
 *  Set 인터페이스 : 순서를 유지하지 않음, 데이터 중복 허용하지 않음
 *  	구현클래스 : HashSet, TreeSet...
 *  
 *  Map 인터페이스 : key, value 의 쌍으로 이루어진 데이터 집합
 *  				순서를 유지하지 않음. key는 중복 안되고 value는 중복 허용
 *  	구현클래스 : HashMap, TreeMap, Hashtable, Properties...
 *  !!외워야함!!
 *  
 *  <E> or <T>, <K,V> : 지네릭스 개념 ==> 타입 지정
 *  E : element 타입 지정
 *  
 *  타입 : 참조 타입만 지정 가능
 */


public class ListEx1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();	//랩퍼타입으로 담는다
		ArrayList<String> list2 = new ArrayList<>();
		
		System.out.println("size() "+list.size());	//배열의 length와 같은 개념
		System.out.println("isEmpty() "+list.isEmpty());
		
		// add() : 요소 추가 index순
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list2.add("자바");
		list2.add("html");
		list2.add("script");
		list2.add("서블릿");
		
		//toString이 오버라이딩이 되어있어서 주소값이 아닌 값으로 확인할수있다
		System.out.println(list);
		System.out.println(list2);
		
		String fruits[] = {"사과", "포도", "메론","딸기","바나나"};		
		//배열 => 리스트로 변환(추가할 내용이 없다면)
		List<String> list3 = Arrays.asList(fruits);
//		list3.add("참외");	 java.lang.UnsupportedOperationException
		System.out.println(list3);
		
		//배열 => 리스트로 변환(추가할 내용이 있다면)
		List<String> list4 = new ArrayList<>(Arrays.asList(fruits));
		list4.add("참외");
		
		System.out.println(list4);
		
		// add(int index, 요소) : 추가의 개념 - index지정
		list.add(3,6);
		System.out.println("특정 위치에 추가 후 "+list);
		
		//set(int index, 변경할 요소) : 변경의 개념
		list.set(3, 7);
		System.out.println("특정 위치에 요소 변경 "+list);
		
		//remove(int index) : 제거의 개념
		list2.remove(2);
		System.out.println("특정 위치 요소 제거 후 "+list2);
		
		//remove(Object o) : 제거의 개념 - Object가 부모이기 떄문에 아무거나 다 들어감 String도 된다구
		list4.remove("바나나");
		System.out.println("특정 요소 제거 후 "+list4);
		
		//get(int index)
		System.out.println("특정 위치 요소 가져오기 "+list2.get(0));
		
		//indexOf(Object o) : 위치를 반환
		System.out.println("특정 위치 요소의 위치 가져오기 "+list2.indexOf("서블릿"));
		
		
		// Collections.sort() : 오름차순 기본, 내림차순을 원할 때는 기준 제공
		Collections.sort(list4);	//오름차순 //리턴타입이 void면 호출만한다//클래스명.메소드명 이니까 스태틱이겠구나
		System.out.println("정렬 후 "+list4);
		
		//Comparator.naturalOrder() : 오름차순, Comparator.reverseOrder() : 내림차순
		list.sort(Comparator.reverseOrder());	//내림차순 가능
		System.out.println("정렬 후 "+list);
		
	}

}
