package shop;

public class ShopMain {
	public static void main(String[] args) {
		IShop shop = new MyShop();	//구현한 관계. 왼쪽 부모, 오른쪽 자식
		
		//shop 이름 지정
		shop.setTitle("MyShop");
		//user 생성
		shop.genUser();
		//product 생성
		shop.genProduct();
		//shop 시작
		shop.start();
		
		
	}

}
