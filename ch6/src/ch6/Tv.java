package ch6;

public class Tv {
	//속성(property)  ==> 멤버변수		//필수는 아니고 필요한 부분만 멤버변수로 만드는것
	//크기, 길이, 높이, 색상, 볼륨, 채널.....
	String color; //색상
	int channel;  //채널
	boolean power;  //전원상태
	
	//main이 있어야 기능이 실행된다!!! main이 없으면 클래스가 있어봐야 안됨 
	
	//기능(function) ==> 메서드
	//켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경....
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}