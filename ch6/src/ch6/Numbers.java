package ch6;

public class Numbers {
	int num[];
	
		
//[source]-[Generate Constructor using fields] 사용하여 생성자
	public Numbers(int[] num) {
		super();
		this.num = num;
	}
	
	
	//배열 총합
	int getTotal() {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum+=num[i];
		}
		return sum;
	}
	//배열 평균
//	int getAverage() {
////		총합/길이
//		int sum = 0;
//		for (int i = 0; i < num.length; i++) {
//			sum+=num[i];
//		}
//		return sum/num.length;
//	}
	//위에 코드와 같기 때문에 똑같이 할 필요 없이 간략하게 한다
	
	
	int getAverage() {
		//getTototl을 총합 길이로 나눈다
		return getTotal()/num.length;
	}
	
}
