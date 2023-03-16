package inheritance;

//Tv클래스를 상속받은 SmartTv
public class SmartTv2 extends Tv2 {


	boolean caption;
	
	public SmartTv2(boolean power, int channel) {
		super(power, channel);
		// TODO Auto-generated constructor stub
	}
	
	
//	public SmartTv2() {
//		//The constructor Tv2() is undefined -> Tv2의 기본생성자를 주석처리하면 에러남
//		super();	//부모(Tv2)의 기본생성자 호출 (괄호 안이 비었을때)
//	}




	void displayCaption(String text) {
		if(caption) {
		System.out.println(text);
		}
	
	}
}
