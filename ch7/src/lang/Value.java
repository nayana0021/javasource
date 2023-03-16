package lang;

public class Value {
	int Value;

	public Value(int value) {
		super();
		this.Value = value;
	}

	//Object 가 equals() 주소 비교로 넘겨줬음
	//값 비교로 바꾸고 싶은 상황 ==> 오버라이드
	@Override
	public boolean equals(Object obj) {
		//instanceof : 특정 객체의 인스턴스인지 확인
		//obj가 Value 객체의 인스턴스냐?
		if(obj instanceof Value) {
			Value v = (Value) obj;
			
			if(this.Value == v.Value) {
				return true;
			}
			return false;
		}
		return super.equals(obj);
		
	}
		// toString() : Object 는 패키지명.클래스명@hasCode값
		// 자손toString() : 인스턴스에 대한 정보(멤버변수에 할당된 값)를 문자열로 제공하는 목적으로 사용
		@Override
		public String toString() {	//[Value=10] 값이 출력된다
			return "Value [Value=" + Value + "]";
		
		
	
	}
	
}
