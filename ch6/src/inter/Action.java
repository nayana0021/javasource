package inter;

public interface Action {	//클래스와 인터페이스는 객체이기 때문애 무조건 첫글자 대문자
	void work();
}
//Action action = new Action() -> X 안됨
//구현 클래스를 만들어야 함 ==> 익명 클래스 사용 : 한번 사용하고 말거야..
