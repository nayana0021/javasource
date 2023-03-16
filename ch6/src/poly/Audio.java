package poly;

public class Audio extends Product {
	public Audio() {
		super(50);
	}
	
	@Override	//오버라이딩 : 부모거 변형해서 쓸거니까, 부모가 가지고 있다는 뜻 근데 Product에 없다 -> object가 가지고있다
	public String toString() {
		return "Audio";
	}
}

