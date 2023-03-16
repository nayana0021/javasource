class FlowEx19 {
	public static void main(String[] args) { 
		for(int i=1;i<=3;i++)  
			for(int j=1;j<=3;j++) 
				for(int k=1;k<=3;k++) 
					System.out.println(""+i+j+k);	
		
		int arr[] = {10,20,30,40,50};
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		for (int tmp : arr) {
			System.out.println(tmp);
		}
		
	} // main의 끝
}
