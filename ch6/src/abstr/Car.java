package abstr;

//추상 메소드를 가지는 경우 무조건 추상클래스가 되어야 함
public abstract class Car {	
		//추상 메소드는 구현부{}가 없음	중괄호가 들어가면 abstract 못씀
		public abstract void drive();	//자식들한테 너네가 완성해라 라는 뜻
		public abstract void stop();	//자식들한테 너네가 완성해라 라는 뜻
		
		
		public void startCar() {
			System.out.println("시동을 켭니다.");
		}
		
		public void stopCar() {
			System.out.println("시동을 끕니다.");
		}

		final public void run() {
			startCar();
			drive();
			stop();
			stopCar();
		}

}
