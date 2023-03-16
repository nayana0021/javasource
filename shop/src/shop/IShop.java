package shop;

//상수만 가질수있고, 모든 메서드는 추상
public interface IShop {
	//public static abstract 자동으로 들어가있음 붙여도되고 안 붙여도 됨
	void setTitle(String title);
	void genUser();
	void genProduct();
	void start();
	
	
	
	
}
