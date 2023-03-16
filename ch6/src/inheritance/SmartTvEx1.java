package inheritance;

public class SmartTvEx1 {
	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		
		//상속여부 확인
		stv.channel = 10;
		stv.channelUp();
		System.out.println("현재 채널 "+stv.channel);
		
		stv.power();
		System.out.println("전원 상태 "+stv.power);
		
		stv.displayCaption("Hello world");	//초기값이 false 니까 처음은 안 나왔다
		stv.caption = true;					//caption 값을 바꿈 (SmartTv 클래스에서 바꿈)
		stv.displayCaption("Hello world");	//출력됨
		
	}

}
