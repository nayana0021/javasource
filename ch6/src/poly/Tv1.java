package poly;

public class Tv1 extends Product {
	public Tv1() {
		super(100);	//부모의 매개변수를 받는 생성자를 호출
	}
	
	@Override
	public String toString() { //원하는 값 출력시 주소 안나오게 하려고 씀
		return "Tv";
	}
}


