package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {
	public static void main(String[] args) {
		//ArrayList 에 Member 객체를 추가
		ArrayList<Member1> list = new ArrayList<>();
		list.add(new Member1("홍길동"));
		list.add(new Member1("아이유"));
		list.add(new Member1("박재범"));
		list.add(new Member1("빈지노"));
		list.add(new Member1("송혜교"));
		
//		Member1[]members = new Member1[10];		배열과 똑같이 초기화하는 작업이 필요
//		members[0]= new Member1("");		
		
		System.out.println(list);
		
		// Member2를 담는 ArrayList 생성
		ArrayList<Member2> list2 = new ArrayList<>();
		list2.add(new Member2("홍길동", "hong123", "hong123"));
		list2.add(new Member2("이준기", "long123", "long123"));
		list2.add(new Member2("박재범", "park123", "park123"));
		list2.add(new Member2("타블로", "tabl123", "tabl123"));
		list2.add(new Member2("미쓰라", "mith123", "mith123"));
		
		System.out.println(list2); //오버라이딩 된 toString() 출력 ==> list 확인 용도
		
		System.out.println("size() "+list2.size());
		//구체적인 작업을 해서 내가 원하는 형태로 출력을 한다 - for 사용
		for(int i = 0; i < list2.size(); i++) {
			Member2 member = list2.get(i);
			System.out.println("id : "+member.getId()+", password : "+member.getPassword()+", name : "+member.getName());
		}
		
		// Iterator 인터페이스 : List, Set, Map 구조에서 요소를 접근하는 방법에 대한 통일성 제공(표준화)
		// hasNext() : 다음요소가 존재하는 경우 true
		// next() : 요소 가져오기
		System.out.println();
		System.out.println("id    password    name");
		System.out.println("==========================");
		for (Iterator iterator = list2.iterator(); iterator.hasNext();) { //증감부분은 생략됨-필요가없으면 안써도 됨
			Member2 member2 = (Member2) iterator.next();
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t"+member2.getName());
			
		}
		
		System.out.println();
		for (Member2 member2 : list2) {
			System.out.println(member2.getId()+"\t"+member2.getPassword()+"\t"+member2.getName());
			
		}
		
		
		
	}

}
