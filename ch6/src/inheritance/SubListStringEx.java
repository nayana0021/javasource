package inheritance;

public class SubListStringEx {
	
	public static void main(String[] args) {
		SubListString subListString = new SubListString();
		
		subListString.list();//오버라이딩을 하고 자기거 메소드 호출하면 부모거는 가려져서 불러지지 않음
		//부모거 부르고싶으면 자식 메소드에서 super.메소드를 부르면 같이 부를수있다 -> SubListString에 정의함
		
		
		
		
		
	}

}
