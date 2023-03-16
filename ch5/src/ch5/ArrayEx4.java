package ch5;


public class ArrayEx4 {
	public static void main(String[] args) {
		//배열을 이용한 최대값과 최솟값 구하기
		int score[]= {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];	//최대값과 최솟값을 0번방에 있는 수로 넣었으니 비교할 수는 두번째부터
		
		for (int i = 1; i < score.length; i++) {	//0번을 담고 들어왔으니까 1부터 본다
			if(score[i]>max) {
				max=score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
		
		
		
	}

}
