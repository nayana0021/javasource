package thread;


public class CalcThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
			for(int x=0; x < 10000000; x++);	//for문 안에 블럭 수행할 작업이 업고 1000만번 돌리면 됨
		}
	}
}
