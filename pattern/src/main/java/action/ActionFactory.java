package action;

/*
 * 디자인 패턴 : 개발 방식 정의 (어떤 언어를 사용하던지 간에 정의해놓은 것)
 * 
 * 싱글톤(Singleton) 패턴
 * 객체 생성하는 메소드가 여러번 호출되어도 단 하나의 생성자가 
 * 생성하는 객체가 리턴 ==> 객체는 하나만 생성
 * */

public class ActionFactory {
	
	private static ActionFactory actionFactory; // 멤버 변수
	
	// 생성자 private으로 막아놔서 디폴트.. 밖에서 new(객체생성) 못함
	private ActionFactory() {}
	
	// 하나는 만들어내야 하니 하나 만들 메서드 제시
	public static ActionFactory getInstance() {
		if(actionFactory == null) {
			actionFactory = new ActionFactory();
		}
		return actionFactory; // 기존에 있는거 리턴시키는 구문
	}
	
	// Action 리턴 메소드(action)
	Action action;
	public Action action(String cmd) {
		// get 이나 post 로 넘어오는 것을 execute로 쓸거임 작업
		// 어디서 요청이 왔는지에 따라 액션 생성
		if(cmd.equals("/insert.do")) {
			action = new InsertAction();
		}else if(cmd.equals("/list.do")) {
			
		}else if(cmd.equals("update.do")) {
			
		}else if(cmd.equals("/delete.do")) {
			action = new DeleteAction();
		}
		return action;
	}
	
	
	

	
	
}
