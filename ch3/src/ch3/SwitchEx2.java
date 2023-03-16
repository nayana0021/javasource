package ch3;

public class SwitchEx2 {
	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A':	case 'a':	//grade=='a' or grade=='A'
			System.out.println("우수회원");
			break;
		case 'B':	case 'b':	
			System.out.println("일반회원");
			break;
		default:
			System.out.println("손님");
			break;
		}
		
		
		String position = "과장";
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}
		
		//Switch문에 (key)에 들어올수있는 타입은 정수,상수,문자 정도가 있다-제한이 있음. 비교구문으로 바로 인식이 된다
		
	}

}
