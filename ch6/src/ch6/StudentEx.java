package ch6;

public class StudentEx {
	public static void main(String[] args) {
		Student stu = new Student("홍길동",1,1,100,60,76);
		//매개변수가 있는 생성자가 있어야 불러올수있다
		
		String msg = stu.info();
		System.out.println(msg);
		//msg 출력 시
		//홍길동,1,1,100,60,76, 점수합계,평균
		System.out.println(stu);	//ch6.Student@76ccd017
		
		
		
		//Student2 객체 생성
		Student2 stu2 = new Student2("성춘향", 2,3,100,60,90 );
		System.out.println("이름 : "+stu2.name);
		System.out.println("총점 : "+stu2.getTotal());
		System.out.println("평균 : "+stu2.getAverage());
		
		//이름 : 성춘향
		//총점 : 236
		//평균 : 78.1223
		System.out.println(stu2);	//ch6.Student2@26f0a63f
		
	}

}
