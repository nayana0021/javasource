package ch7;
/* 컴파일에러 : 컴파일 시에 발행하는 에러 - 코드 작성시 빨간줄
 * 런타임에러 : 실행 시에 발생하는 에러 - 콘솔 창에 에러
 * 논리적에러 : 실행은 되지만, 의도와 다르게 동작하는 것
 * 
 * 에러(error) :코드에 의해서 수습될 수 없는 심각한 오류 ex)메모리부족, 스택오버플로우
 * 예외(exception) : 코드에 의해서 수습될 수 있는 미약한 오류
 * 
 * Exception
 * 1) Exception : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
 * 2) RuntimeException : 프로그래머의 실수로 발행하는 예외
 * 		- 배열 범위 벗어나기, NullPointerException, ClassCastException...
 * 
 * Exception 처리
 * try ~ catch
 * 예외 던지기 : main 메소드를 호출하는 곳(JVM)에서 처리
 */
public class ExceptionEx1 {
	public static void main(String[] args) throws ClassNotFoundException {
//		//컴파일러 체크 exception
//		try {
//			//예외가 발생할 수 있는 구문
//			Class.forName("");
//		} catch (ClassNotFoundException e) {
//			//예외가 발생했을 때 처리하기 위한 구문
//			e.printStackTrace();
//		}
//		//예외가 발생하지 않으면 catch구문은 처리되지 않는다
		
		Class.forName("");
		
		
		
	}

}