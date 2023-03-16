package poly;

public class SmartTvEx {
	public static void main(String[] args) {
		
		//참조변수와 인스턴스 타입이 일치
		SmartTv smartTv = new SmartTv();
		
		//조상타입 참조변수로 자손 타입 인스턴스 참조 - 부모 참조변수에 자식을 담는다. 왼쪽과 오른쪽이 다름
		//부모 = 자식 : 왼쪽은 무조건 부모 
		Tv tv = new SmartTv();
		
		// 참조변수의 타입에 따라 사용할 수 있는 멤버의 개수는 달라짐
		//tv와 smartTv로 접근할 수 있는 범위의 차이가 생김 - smartTv가 범위가 더 크다 tv 범위가 더 작음
		
	//	SmartTv smartTv2 = new Tv();  -> 에러남 : 부모가 무조건 왼쪽에 와야함
		
		

	}

}
