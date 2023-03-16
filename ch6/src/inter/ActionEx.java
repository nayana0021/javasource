package inter;

public class ActionEx {
	public static void main(String[] args) {
		Action action = new Action() {	//한번 사용하고 말것은 익명클래스로 작성한다
			
			@Override
			public void work() {
				System.out.println("work");
			}
		};	//세미콜론 있어야 함
		action.work();
		
		
		
	}

}
