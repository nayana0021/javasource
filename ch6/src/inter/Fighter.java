package inter;

// implements : 구현(인터페이스를 구현할 때 사용)
public class Fighter extends Unit implements Fightable { //Fight라는 클래스가 Fightable을 구현했다

	@Override
	public void attack() {

	}

	@Override
	public void move(int x, int y) {

	}

	//extends (뒤에) 클래스 : 상속(확장)
	//implements (뒤에) 인터페이스 : 구현
	
}
