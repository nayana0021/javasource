package inheritance;	//패키지명은 소문자

// 클래스 관계
// 상속관계(is-a) : Circle ia s point  원은 점이다.
// 포함관계(has-a) : Circle has a point 원은 점을 가지고 있다.


// Car 
// 엔진 클래스
// 도어 클래스

// 포함관계 : 한 클래스의 멤버 변수로 다른 클래스 타입의 참조변수를 선언
public class Circle {
//	int x;	//x 좌표
//	int y;	//y 좌표
	Point p = new Point();	//포함관계 - 여러개 가능
	
	int r;	//반지름
	
	
	
	
}
