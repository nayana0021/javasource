package poly;

public class ProductEx {
	public static void main(String[] args) {
		//구매자 인스턴스 생성
		Buyer buyer = new Buyer();
			
		//Tv 구매하다
//		Tv1 tv1 = new Tv1();
//		buyer.buy(tv1); // -> buyer 클래스 확인
		//왼쪽과 오른쪽이 같을 때 /tv. 이런식으로 접근을 안 한다면(참조변수 사용X) 위 두 줄을 한줄로 줄여서 입력하기도 함
		buyer.buy(new Tv1());
		
		//Computer 구매하다
//		Computer computer = new Computer();
		buyer.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+buyer.money+" 만원입니다.");
		System.out.println("현재 보너스 점수는 "+buyer.bonusPoint+" 점 입니다.");
		
		
	}

}
