package ch6;

public class TimeEx {
	public static void main(String[] args) {
		Time time = new Time();	//객체 생성시 인스턴스가 생성된것이다 객체 생성 이후 인스턴스 변수 사용이 가능하다
		
		System.out.println("현재상태");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
		
		//원하는 시분초를 세팅
		time.setHour(16);
		time.setMinute(37);
		time.setSecond(22);
		System.out.println("바꾼 후 상태");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());

	}

}
