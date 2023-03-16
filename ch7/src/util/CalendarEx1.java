package util;

/* 날짜와 시간
 * 1) java.util.Calendar 클래스
 * 2) java.util.Date 클래스
 * 3) java.time.LocalDate, java.time.LocalTime, java.time.LocalDateTime 클래스 => 8 버전에서 추가
 */
import java.util.Calendar;	//다른 패키지에 있는걸 불러왔다 임포트 구문 필요

public class CalendarEx1 {

	public static void main(String[] args) {
//		Calendar c = new Calendar();	추상 클래스이기 때문에 new 못함
		//추상 클래스, interface 는 new 를 못하기 때문에 자식 클래스 만들어서 사용
		
		// 현재 시스템의 날짜와 시간 정보 리턴
		Calendar today = Calendar.getInstance();	// static이여서 이렇게 부름
		System.out.println(today);
		System.out.println(today.toString()); //문자열 형태로 표현
		
		//get(int field) : 
		System.out.println("년도 : "+today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월) : "+today.get(Calendar.MONTH)); //2가 나온다.. 인덱스 개념임!!
		System.out.println("올 해의 몇 째 주 : "+today.get(Calendar.WEEK_OF_YEAR));  // 얘는 인덱스 개념아님
		System.out.println("이 달의 몇 째 주 : "+today.get(Calendar.WEEK_OF_MONTH)); // 얘는 인덱스 개념아님
		System.out.println("이 달의 몇 일 : "+today.get(Calendar.DATE)); 			  // 얘는 인덱스 개념아님
		System.out.println("이 달의 몇 일 : "+today.get(Calendar.DAY_OF_MONTH)); 	  // 얘는 인덱스 개념아님
		System.out.println("올 해의 몇 일 : "+today.get(Calendar.DAY_OF_YEAR)); 	  // 얘는 인덱스 개념아님
		System.out.println("요일(1~7, 1:일요일) : "+today.get(Calendar.DAY_OF_WEEK)); 	  // 5나옴 1:일요일
		System.out.println("오전_오후(0:오전, 1:오후) : "+today.get(Calendar.AM_PM)); 	  
		System.out.println("시간(0~11) : "+today.get(Calendar.HOUR)); 	  
		System.out.println("시간(0~23) : "+today.get(Calendar.HOUR_OF_DAY)); 	  
		System.out.println("분(0~59) : "+today.get(Calendar.MINUTE)); 	  
		System.out.println("초(0~59) : "+today.get(Calendar.SECOND)); 	//시스템상 시간  
		System.out.println("1000분의 1초(0~999) : "+today.get(Calendar.MILLISECOND));
		
		
		
		
		
		
		
		
		
		
	}

}
