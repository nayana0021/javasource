package ch6;

public class PysicalInfo {
	//생성자 /메소드 오버로딩
	//오버로딩 : 한 클래스에 동일한 이름의 메소드, 생성자가 존재
	
	
	String name;
	int age;
	float height;
	float weight;
	//생성자 오버로딩
	//생성자 이름은 같아야 함
	//매개변수의 개수 또는 타입이 달라야 함(이름이 아니고 타입!!-이름은 중요하지 않다)
	public PysicalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
		public PysicalInfo(String name, int age, float height, float weight) {
//		super();
//		this.name = name;
//		this.age = age;
//		밑에와 같이 대체 가능
		this(name,age);	//생성자에서 다른 생성자 호출
		this.height = height;
		this.weight = weight;
//		this.(height,weight);	//오류 Constructor call must be the first statement in a constructor
		//위에줄에서만 사용가능하다는 뜻
		
		
	}
	
	//매개변수 타입 순서가 바뀌면 서로 다르게 인식을 한다 ()가 중복만 안되면 상관없다
	public PysicalInfo( int age, String name, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	public PysicalInfo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	
	
	
	
	
}
