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
 */
public class ExceptionEx3 {
	public static void main(String[] args) {
		// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds
		// -> 배열의 인덱스를 잘못 지정했을 때 나는 오류 => if 문으로 확인
		
//		if(args.length == 1) {
//			System.out.println(args[0]);
//		}else {
//			System.out.println("실행방법 확인");
//		}
		
		try {
			//java.lang.ArrayIndexOutOfBoundsException
			System.out.println(args[0]);
			
			//java.lang.ArithmeticException:
			System.out.println(3/0);
			
			//캐치는 여러개 들어올 수 있다
			//catch문이 여러개면 위에서 부터, 자식에서 부모순으로 작성해주면 된다
		} catch (ArrayIndexOutOfBoundsException e) {	//다른 익셉션 못잡고 어레이만 잡음
			System.out.println("실행방법 확인");
		} catch (ArithmeticException e) {	//아리스메틱익셉션만
			System.out.println("0으로 나눌 수 없음");
		} catch (Exception e) {	
			System.out.println("오류발생");
		}
		
		
	}

}
