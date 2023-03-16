package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateEx1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println(today.getYear());
		System.out.println(today.getMonthValue()); //3월로 나옴 : 월 1~12로 출력해줌
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour());	//24시간
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		
		
		
	}

}
