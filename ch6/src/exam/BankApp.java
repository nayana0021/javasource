package exam;

import java.util.Scanner;


//private : 외부 클래스에서 호출 불가 ==> 내부에서만 사용하겠음
public class BankApp {
	//인스턴스 변수(초기화 완료)
	private static Account[] accountArray = new Account[10];	//Account 객체 배열 10개 선언,생성
	private static Scanner scanner = new Scanner(System.in);	//사용자 입력을 위한 선언
	
	public static void main(String[] args) {
		boolean run = true;
		while(run){
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 ");
			System.out.println("-----------------------------------------------");
			System.out.println("선택 >> ");
			
			//sc.nextLine(); String 타입으로 입력값을 처리
			//scanner.nextLine(); int 타입으로 입력값을 처리
			int selectNo = Integer.parseInt(scanner.nextLine()); 
			//scanner.nextInt();  1 엔터 치면 값을 1만 받고 엔터는 어딘가에 남음 그냥 두면 실행했을 때 계좌번호와 예금주 같이 나옴
			
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				//while문 종료
				run = false;
				break;
			default:
				break;
			}
			
		}//while문 종료
	}//main종료

	private static void createAccount() {
		//계좌생성
		//Account 인스턴스를 생성하기 위한 값을 입력받기
		System.out.print("계좌번호 >> ");
		String ano = scanner.nextLine();
		
		System.out.print("예금주 >> ");
		String owner = scanner.nextLine();

		System.out.print("잔액 >> ");
		int balance = Integer.parseInt(scanner.nextLine());
		
		
		//for문을 돌려 i 에 해당하는 배열 초기값이 null이면 수행하도록 
		//한번만 수행되고 빠져 나오도록 해야 함 -> break;
		for (int j = 0; j < accountArray.length; j++) {
			if(accountArray[j]==null) {
				accountArray[j] = new Account(ano,owner,balance);
				System.out.println("계좌가 생성되었습니다");
				break;
			}
		}
		
		
	}
	private static void accountList() {
		//accountArray 에 있는 내용 출력 ==> 생성된 계좌 정보 출력
		//null이 아닌 경우만 출력
		
		System.out.println();
		System.out.println("계좌목록");
		System.out.println("--------------------");
		
		for (int j = 0; j < accountArray.length; j++) {
			if(accountArray[j]!=null) {
				System.out.printf("%s\t%s\t%d\n",accountArray[j].getAno(),accountArray[j].getOwner(),accountArray[j].getBalance());
				
			}
		}
	}
	private static void deposit() {
		//예금하다 - 계좌번호,예금액 입력받기
		System.out.print("계좌번호 >> ");
		String ano = scanner.nextLine();
		System.out.print("예금액 >> ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		//accountArray 에서 일치하는 계좌(null이 아닌 계좌만)를 찾아 잔액 = 잔액+예금액
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]!=null) {
				if (accountArray[i].getAno().equals(ano)) {
					//accountArray[i].balance= accountArray[i].balance+amount; -> 직접 접근이 안된다 -> Account 에 있는 메소드를 활용
					accountArray[i].setBalance(accountArray[i].getBalance()+amount);
				}
			}
		}
		
	}
	private static void withdraw() {
		//출금하다 - 계좌번호, 출금액 입력받기
		System.out.print("계좌번호 >> ");
		String ano = scanner.nextLine();
		System.out.print("출금액 >> ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		//accountArray 에서 일치하는 계좌(null이 아닌 계좌만)를 찾아 잔액 = 잔액-출금액
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i]!=null) {
				if (accountArray[i].getAno().equals(ano)) {
					//accountArray[i].balance= accountArray[i].balance-amount; -> 직접 접근이 안된다 -> Account 에 있는 메소드를 활용
					accountArray[i].setBalance(accountArray[i].getBalance()-amount);
				}
			}
		}
		

	}

	
}
