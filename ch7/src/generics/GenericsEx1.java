package generics;
/*
 *  Generics
 *  컴파일 시 타입을 체크 해 주는 기능
 *  
 *  장점
 *  1) 타입 안정성 제공
 *  2) 타입 체크와 형 변환을 생략 할 수 있으므로 코드의 간결성 유지
 *  
 *  <E>, <T>, <K,V>, <? extends T>, <? super T>, <?>
 */

import java.util.ArrayList;

public class GenericsEx1 {
	public static void main(String[] args) {
		// ArrayList 안에는 String 타입만 추가 가능
		ArrayList<String> list = new ArrayList<>();
		
	//	list.add(1);	//String이 아닌게 들어오면 에러났다고 알려줌-타입안정성 위에 String만 들어오게 해서
		
		Box1 box1 = new Box1();
		box1.setItem("홍길동");
		
		String item = (String) box1.getItem();	//String으로 담았으니까 형변환을 해서 가져와야함 //Obeject로 했으니까-> Box1클래스
		System.out.println(item);	//할때 마다 바꿔야 하니까 번잡스러워서 지네릭스가 나왔다!!	
		
		box1.setItem(1);
		Integer i = (Integer) box1.getItem(); //Integer로 담았으니까 형변환을 해서 가져와야함
		System.out.println(i);
		
		Box2<String> box2 = new Box2<>();
		box2.setItem("성춘향");
		item = box2.getItem(); 	//형변환 필요없다
		System.out.println("generics 적용 후 "+item);
		
		Box2<Integer> box3 = new Box2<>();
		box3.setItem(23);
		i = box3.getItem();
		System.out.println("generics 적용 후 "+i);
				
		//타입에 대한 정의를 하고 들어왔기때문에 형변환이 필요없다
		
		
	}

}
