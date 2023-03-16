package ch6;

public class GoodsStockEx {
	public static void main(String[] args) {
		//티셔츠 상품관리
		//객체 생성 ==> 생성자가 자동 호출
		//The constructor GoodsStock() is undefined -> 내용 있는 생성자를 만들었을때 기본 생성자 호출하면 에러가 난다
		GoodsStock goods = new GoodsStock("p123456",150);//매개 변수를 가진 생성자호출 하면서 초기화도 함
		//초기화?
		
		
		System.out.println("현재 재고 수량 "+goods.stockNum);
		
		//상품 판매 10
		goods.subtractStock();
		
		
		
		
	}

}
