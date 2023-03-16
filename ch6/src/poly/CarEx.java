package poly;

public class CarEx {
	public static void main(String[] args) {
//		Car car1 = new FireEngine();
//		Car car2 = new Ambulance();
		
		Car car = null;
		
		FireEngine fireEngine = new FireEngine();
		FireEngine fireEngine2 = null;
		
		fireEngine.water();
		car = fireEngine; // Car car = new FireEngine(); -> 이 상황은 .water()가 안보임
		
		fireEngine2 = (FireEngine) car; //강제 형변환 -> 자식의 데이터 불러올수있음
		fireEngine2.water();
		
		
		//java.lang.ClassCastException	
//		FireEngine fe = (FireEngine) new Car();
//		fe.drive();
		//자식이 왼쪽에 오고 부모가 오른쪽에 왔지만 아무리 캐스팅해도 에러남 - 런타임오류
		
//		FireEngine fe = new Ambulance();//자식끼리는 아무 관계가 없다 아무 성립이 되지 않음
		
		
	}

}
