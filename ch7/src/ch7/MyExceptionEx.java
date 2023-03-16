package ch7;

public class MyExceptionEx {
	public static void main(String[] args) {
		try {
			test();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	public static void test() throws MyException{
		//강제로 에외를 발생하는 코드 - 자바거 안 쓰고 개발자가 쓰고 싶은대로 사용
		throw new MyException("사용자 정의 예외 발생");
	}
	
	
}
