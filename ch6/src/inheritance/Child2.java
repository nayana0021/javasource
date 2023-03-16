package inheritance;

public class Child2 extends Parent2 {
	String field2;
	
	@Override
	public void method1() {
		super.method1();
	}
	
	public void method3() {
		System.out.println("Child-method3()");
	}

}
