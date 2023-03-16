package abstr;

//상속
//1)클래스	-> 선택사항 : 변경사항은 오버로딩 사용
//2)추상클래스 -> 강제조항 : 동일한내용의 경우 사용
public class Marine extends Unit{
	void stimPack() {}

	@Override
	void move(int x, int y) {
		System.out.println("Marine[x="+x+",y="+y+"]");
	}
}

class Tank extends Unit{
	void changeMode() {}

	@Override
	void move(int x, int y) {
		System.out.println("Tank[x="+x+",y="+y+"]");
	}
}

class DropShip extends Unit{
	void load() {}
	void upload() {}
	@Override
	void move(int x, int y) {
		System.out.println("Dropship[x="+x+",y="+y+"]");
		
	}

}
	