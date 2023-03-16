package ch3;

public class SwitchEx1 {
	public static void main(String[] args) {
		//Switch : if~else if~else 대신 사용
		//case문에는 블럭 {} 사용불가
		
//		switch (key) {
//		case value;
//			break;
//		case value;
//			break;
//		case value;
//			break;
//		default:
//			break;
//		}
		
		
//		int jumsu = 70;
//		//지역변수 초기화 후 사용
//		char grade = ' ';	// 지역변수임 char : 문자 한개// 빈 문자를 안주면 에러발생
//		
//		if(jumsu>=90) {
//			grade = 'A';
//		}else if(jumsu>= 80) {
//			grade = 'B';
//		}else if(jumsu>= 70) {
//			grade = 'C';
//		}else if(jumsu>= 60) {
//			grade = 'D';
//		}else if(jumsu>= 50) {
//			grade = 'E';
//		}else {	//0~49
//			grade = 'F';
//		}

		//switch 문으로 변경이 가능한지 확인
		
//		switch (jumsu) {
//		case 90:	// jumsu==90 이라는 의미이다. 크기비교(<,>)는 불가이다 
//		case 91:	//이런식으로 하나씩 다 써줘야 함. 효율성이 엄청 떨어짐
//		case 92:	//그렇기 때문에 if~else문을 더 많이 사용하며 이 예제는 switch문 보다 if else구문이낫다
//			break;
//
//		default:
//			break;
//		}
		
		int month = 2;
		
		switch (month) {
		case 3:	//month==3
		case 4:
		case 5:
			System.out.println("현재 계절은 봄");
			break;
		case 6:	case 7: case 8:
			System.out.println("현재 계절은 여름");
			break;
		case 9:	case 10: case 11:
			System.out.println("현재 계절은 가을");
			break;
		case 12: case 1: case 2:
			System.out.println("현재 계절은 겨울");
			break;
		}
		
		//break; : break가 속해있는 블록을 빠져나가도록 함 
		//switch 문에서 어떤 값을 출력할것인지에 대한 큰 영향을 줌
		
		//if else 문을 switch 문으로 바꿀수 있다고는 하나
		//범위가 작은 경우만 가능한것이다!
		month = 9;
		if(month==3 || month==4 || month==5) {
			System.out.println("현재 계절은 봄");
		}else if(month==6 || month==7 || month==8) {
			System.out.println("현재 계절은 여름");
		}else if(month==9 || month==10 || month==11) {
			System.out.println("현재 계절은 가을");
		}else if(month==12 || month==1 || month==2) {
			System.out.println("현재 계절은 겨울");//마지막줄은 else로도 가능
		}
		
		
		
	}

}
