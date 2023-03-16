package ch7;

public class BalanceInsufficientException extends RuntimeException{

	public BalanceInsufficientException() {
		super();
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	//사용자 정의 - 내가 원하는 이름 보이고 싶다
	//실행시 예외 만들려면 RuntimeException 을 상속 받아라
	
	//Exception 을 상속 받으면 컴파일 단계에서 오류를 확인할 수 있고 런타임은 실행시 확인할 수 있다
}
