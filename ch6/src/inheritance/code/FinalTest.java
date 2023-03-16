package inheritance.code;

//상속금지-클래스이 파이널이 붙으면
public final class FinalTest {
	
	final int MAX_SIZE=10;	//상수-초기화 이후 값을 변경할수없음
	
	static final int MIN_SIZE=0; //공유(공통) 사용하는 상수  //fianl 과 static 위치 바뀌어도 상관없음
	
	
	//오버라이딩 금지 - 메소드에 파이널이 붙으면 .파이널은 무조건 못바꾸니까
	final void getMaxSize() {
		final int LV = MAX_SIZE;	//상수
		
	}
	
	
}
