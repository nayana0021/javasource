package shop2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//클래스 관계 : 1) 상속(is a) 2) 포함(has a)

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class OrderDTO { //강의 0329 오후 3시 30 40~
	private int orderId;
	private int userId;
	private int productId;
	private Date orderDate; // 기본 타입의 변수(int, float, double, byte ==> 소문자 ): int 기본값 0

	// 포함관계 - 중요 !! 복습하기
	private UserDTO userDTO;	//이건 선언만하고 생성은 안한 단계// 참조 타입의 변수 => 대문자(클래스,인터페이스,추상클래스로 선언된 것들), 배열 : 참조형 기본값 null -> 초기화 단계 필요
	private ProductDTO productDTO;
	
	
	//클래스 내에 멤버 변수(프로퍼티) 선언 시 기본타입/참조타입으로 선언할수있다
	//OrderDTO 를 쓰고 싶으면 어디서든 객체를 생성해야 함 : OrderDAT orderDTO = new OrderDTO();
	//선언을 하면 기본 값으로 초기화된다(int = 0 // 참조형 = null)
	// 인스턴스 생성  => 힙 메모리에 자리를 잡고 사용할 수 있는 상태가 됨
	//			   => OrderDTO 가 가지고 있는 프로퍼티(멤버변수), 메소드 호출이 가능하다
	//			   => 원하는 값을 세팅해야 의미가 있음
	// 				인스턴스 생성 된 후 값을 세팅하기 위해서는 setter 메소드를 사용해야 함
	//프로퍼티(멤버변수) 초기화
	// 참조타입의 변수 1) new 2) setter 
	// 기본타입은 대입연산자를 통해 작업 -> orderDTO.orderId=1001; /setter 바로 쓰면 됨 => orderDTO.setUserId(원하는 값); -> orderDTO.setOrderId(1001);
	// 만들어놓은 객체 주소(UserDTO)를 연결해주는걸 해야한다 ex) dto.setUserDTO(userDTO);
	
	
	
}
