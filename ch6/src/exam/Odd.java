package exam;

public class Odd extends OddDetector {

	public Odd(int n) {
		super(n);
	}

	@Override
	public boolean isOdd() {
		//홀수이면 true를 리턴, 짝수면 false를 리턴
		if(getN() % 2 ==1) {
			return true;
		}
		return false;
	}

}
