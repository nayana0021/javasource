package shop;

import java.util.ArrayList;
import java.util.Scanner;

//배열로 선언된 부분 => ArraysList로 변경(프로그램 수정) => ch7 collection 내용 MyShop에서 코드만 변경

public class MyShop implements IShop{
	
	//쇼핑몰 이름
	private String title;
	//user 정보 저장 ArrayList
	ArrayList<User> users = new ArrayList<>();	//공간 안 잡으면 10개가 기본
	//product 정보를 저장ArrayList
	ArrayList<Product> products = new ArrayList<>();
	//구매한 제품을 저장 ArrayList
	ArrayList<Product> carts = new ArrayList<>();
	
	//선택된 user 저장 변수
	private int selUser;
	
	 Scanner sc = new Scanner(System.in);
	
	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		//User 2명 생성 후 배열에 저장
		users.add(new User("아이유", PayType.CARD));	//append 개념이 있어서 뒤로 붙기때문에 순서 지정은 굳이 안해도됨
		users.add(new User("아이유", PayType.CARD));
//		users[0] = new User("아이유", PayType.CARD);
//		users[1] = new User("이준기", PayType.CASH);
		
	}

	@Override
	public void genProduct() {
		//Product 4 개 (CellPhone 2개, SmartTv 2개)생성 후 배열에 저장
//		products[0] = new Product();	//Cannot instantiate the type Product
		products.add(new CellPhone("아이폰14", 1500000, "SKT"));
		products.add(new CellPhone("갤럭시S23", 1500000, "KT"));
		products.add(new SmartTv("samsumg smartTv", 3500000, "8K"));
		products.add(new SmartTv("LG OLED Tv", 2500000, "4k"));
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정 선택");
		System.out.println("==================================");
		
//		for (int i = 0; i < users.size(); i++) {
//			User user = users.get(i);
//			System.out.printf("[%d] %s(%s)\n", i,user.getName(),user.getPayType());
//		}
		//user size로 해도된다
		
		int i = 0;
		for (User user : users) {
			System.out.printf("[%d] %s(%s)\n", i++,user.getName(),user.getPayType());
		}
		System.out.println("[x] 종   료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();
		
		// 0,1 => productList() 호출
		// 다른걸 입력 시 => 메뉴를 확인해 주세요
		switch (sel) {
		case "X": case "x":
			System.exit(0); //프로그램 종료
			break;
		case "0": case "1": 
			selUser = Integer.parseInt(sel);
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요\n");
			start();
			break;
		}
		
		
		
		
	}

	public void productList() {
		System.out.println();
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("==================================");
		
		//products 배열 출력
		int i = 0;
		for (Product product : products) {
			System.out.printf("[%d]",i++);
			product.printDetail();
			product.printExtra();
		}
		
//		for (int i = 0; i < products.length; i++) {
//			System.out.printf("[%d]",i);
//			products[i].printDetail();
//			products[i].printExtra();
//		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		//상품선택 시 0~3 => cart 제품 추가, products() 호출
		//h => start 메소드 호출 ,c => checkOut() 호출
		switch (sel) {
		case "0": case "1": case "2": case "3":
//			for (Product cart : carts) {
//				if(cart == null) {
					//Integer.parseInt("0") ==> 0
					carts.add(products.get(Integer.parseInt(sel)));
//					break;
					//for문은 확인할 필요없다. for문 삭제
					//append개념이 있기 때문에 추가만 하면 된다.
					
//				}
//				
//			}
//			for (int i = 0; i < carts.length; i++) {
//				if(carts[i] == null) {
//					//Integer.parseInt("0") ==> 0
//					carts[i] = products[Integer.parseInt(sel)];
//					break;
//				}
//			}
			productList();
			break;
		case"h": case "H" :
			start();
			break;
		case"c": case "C" :
			checkOut();
			break;
		default:
			System.out.println("입력값을 확인해 주세요");
			productList();
			break;
		}
	}
	
	public void checkOut() {
		System.out.println();
		System.out.println(title + " : 체크아웃");
		System.out.println("==================================");
		//carts 출력
		int total = 0; //	제품 가격 합계
		int i = 0;
		for (Product cart : carts) {
			if(cart!=null) {
				System.out.printf("[%d] %s(%d)\n" ,i++,cart.getName(),cart.getPrice());
				total += cart.getPrice();
		}
			
	}
		
//		for (int i = 0; i < carts.length; i++) {
//			if(carts[i]!=null) {
//				System.out.printf("[%d] %s(%d)\n" ,i,carts[i].getName(),carts[i].getPrice());
//				total += carts[i].getPrice();
//		}
//	}
		//가격 합계 구하기
		//결제방법 :CARD
		//결제금액 : 5000000
		System.out.println("==============================");
		System.out.println("결제 방법 : "+users.get(selUser).getPayType());
		System.out.println("결제 금액 : "+total);
		System.out.println("[p] 이전, [q]결제완료 ");
		System.out.println("선택 : ");
		String sel = sc.nextLine();
		
		// [p]일 때 productList() 호출
		// [q]일 때 결제완료되었습니다. 프로그램 종료
		// 잘못입력 시 checkOut() 호출
		switch (sel) {
		case "p": case "P":
			productList();
			break;
		case "q": case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
			break;
		default:
			checkOut();
			break;
		}
	}
	
	
}
