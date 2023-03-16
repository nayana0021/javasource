package abstr;

//추상클래스를 상속받는 자손 클래스는 무조건 추상 메소드를 반드시 구현해야 함
//미완성 메소드가 자동으로 오버라이딩 됨 -> 강제성이 있다
//강제 조항(강제성)이 필요한 경우 추상클래스로 작성
public class AiCar extends Car {

	@Override
	public void drive() {
		System.out.println("자율주행 중입니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다.");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 스스로 멈춥니다.");
	}

}
