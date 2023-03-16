package poly;

public class EmployeeEx2 {
	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.setName("홍길동");
//		employee.setPosition("사원");
//		workPrint(employee);
		
		
		//메소드가 오버라이딩 되었다면 오버라이딩 된 메소드가 실행
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
		workPrint(employee2);
		
		AdminStrator employee3 = new AdminStrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
		workPrint(employee3);
		
		PartTime employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
		workPrint(employee4);
		
	}

		//매개변수의 다양성
		//자식들간의 관계는 아무런 영향이 없기때문에
		//위와 같이 코드를 짜면 매개변수는 부모로 담는다
		//Employee employee = new Ceo()
		//Employee employee = new PrtTime()
		//Employee employee = employee2()
		//Employee employee = employee3() 불러올 때 이렇다는 얘기
	static void workPrint(Employee employee) {
		employee.work();
	}
	
	
}
