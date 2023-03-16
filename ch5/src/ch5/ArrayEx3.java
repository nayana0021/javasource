package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {

		
		//[]:1차원 배열
		//[][]:2차원 배열(행,열)
		//대괄호의 위치는 타입 뒤에 와도 되고 배열명 다음에 와도 상관없다 ==> int[] score;
		int score[]= {100,88,100,100,90};	//대괄호가 없으면 에러남
		
		//배열의 총합과 평균
		int sum=0;		//합계를 구하고 싶으면 합을 저장한 변수를 하나 써~
		float average=0f;
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		
		//	478/5=95	float로 형변환을 안하면 결과는 int임 95.0으로 나온다
		//	478/5.0으로 해야 결과가 95.6이 나온다
		average = sum/(float)score.length;		//나누기5하면 되는데 5를 가지고 있는게 length니까
		//코드가 바뀔수있으니까 배열의 크기가 바뀌더라도 수정할 필요가 없으니 length를 사용해서 써라
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+average);
		
	}

}
