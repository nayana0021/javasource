package modifier;

 public class Account {	//클래스에 퍼블릭을 안붙이려면 같은 패키지 내에서 쓰면 된다
	  //속성(인스턴스변수(멤버변수)) ==> 기본적으로 private 으로 막는다
	  //외부에서는 속성에 직접적으로 접근 불가
	  //인스턴스변수의 값을 얻어내거나 변경하고 싶다면? ==> 메소드로 처리
	 private String ano;

	 //getter/setter 메소드 활용
	public String getAno() {	//외부에서 접근하고싶다면
		return ano;
	}

	public void setAno(String ano) {	//변경하고 싶다면
		this.ano = ano;
	}
	  
	 
	  
}
