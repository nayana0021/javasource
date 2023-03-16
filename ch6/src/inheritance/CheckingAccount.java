package inheritance;

public class CheckingAccount extends Account {
	
	private String cardNo; 	//체크카드 번호를 저장할 변수
	
	
	//은행계좌 + 체크카드
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance);	//부모 생성자를 부르는 것임
		this.cardNo = cardNo;
	}

	//체크카드 사용액을 지불한다
	//카드번호, 사용액을 매개변수로 받아서 은행잔고보다 작은 경우 사용액을 지불
	//카드번호 일치한지 확인
	
	//은행잔고보다 크거나 카드번호가 일치하지 않으면 지불불가 메세지 출력
	
	//pay(cardNo,amount)	: 잔액 리턴
	
	int pay(String cardNo, int amount) {
		if(!this.cardNo.equals(cardNo) || getBalance() < amount) {
			System.out.println("카드번호나 잔액을 확인해 주세요");
			return 0;	//이 리턴 구문이 없으면 밑에 있는 문장들을 수행하게된다.. 밑에 문장을 수행하지 않게 하기 위해서
		}
		//잔액 = 잔액 - 사용액
//		setBalance(getBalance()-amount);
//		return getBalance();
		
		//부모의 메소드 호출(부모가 가지고 있다면)
		return withdraw(amount);	//메소드 실행해서 부모한테 있는 withdraw 실행. 잔액을 리턴해주면 잔액을 리턴해주는 메서드
		//return super.withdraw(amount) 로 해도됨 -> 어떤걸 쓰는지 명확하게 하기위함
		
		
	}
	
	
	
	
}
