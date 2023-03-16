package poly;

public class Product {
	int price;
	int bonusPoint;
	
	public Product() {
		//디폴트 생성자
	}
	
	public Product(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0);	//보너스 점수는 제품가격의 10%
	}
}
