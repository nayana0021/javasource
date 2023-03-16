package inheritance;

public class SmartTvEx2 {
	public static void main(String[] args) {
		//SmartTv2, Tv2, Object 인스턴스가 생성
		SmartTv2 stv = new SmartTv2(false,10);	//이렇게 해도 기본적으로 super 가 있어서 문제없이 실행이 된다..
	//SmartTv2의 기본생성자를 주석처리했더니 에러가 났지만 이렇게 수정한다
		
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
