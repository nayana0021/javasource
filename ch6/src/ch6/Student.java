package ch6;

public class Student {
	String name;	//학생이름 name ex)홍길동
	int ban;		//반 ban ex)1
	int no;			//번호 no ex)1
	int kor;		//국어점수 kor ex)78
	int eng;		//영어점수 eng ex)65
	int math;		//수학점수 math ex)65
	
	
	//this(자기 자신)는 객체 안에 있는걸 부를 때 사용
	
	public Student(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
//		super();
		this(name,ban,no);
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//toString 세팅된 값을 출력할수있다(주소값이 아니고) -> StudentEx 값
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

	//void는리턴값이 없고 String msg를 할거니까(StudentEx) String을 앞에 입력
	String info(){
		
		//국어+영어+수학
		int sum = this.kor+this.eng+this.math;	//this가 없어도 상관은 없는데 명확하게 하려고 필요하다
		double avg = (double)sum/3;
		
		return this.name+","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+sum+","+avg;
	}
	
	 
}
