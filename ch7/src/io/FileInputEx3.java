package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class FileInputEx3 {
	public static void main(String[] args) {
		// FileInputEx1.java 를 읽어서 화면 출력
		// 행 번호와 같이 출력 (FileReader, Writer)
		
		
//		try (FileReader fis = new FileReader(".//src//io//FileEx4.java");
//				OutputStream out = System.out;){
//			 
//			 int data = 0;
//			 int row = 1;	//행번호
//			 
//			 System.out.print(row+"  ");	//1행 출력
//			 
//			 while((data=fis.read())!=-1) {
//				 System.out.print((char)data);//하나씩 읽어와서 찍어주는거
//				 
//				 if(data == '\n') {	//줄마다 엔터가 들어가 있으니까 이용하는것
//					 row++;	//엔터가 있으면 row 하나씩 늘려서
//					 System.out.print(row+"  ");	//row찍어줘
//				 }
//				 
//				 
//				 
//			 }	
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		
//		try (FileReader fis = new FileReader(".//src//io//FileEx4.java");
//				PrintStream out = System.out;){
//		 
//			 int data = 0;
//			 int row = 1;	//행번호
//			 
//			 out.print(row+"  ");	
//			 
//			 while((data=fis.read())!=-1) {
//				 out.print((char)data);
//				 
//				 if(data == '\n') {	
//					 row++;	
//					 out.print(row+"  ");	
//				 }
//				 
//				 
//				 
//			 }	
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
		
		// FileReader / BufferedReader 사용하는 형태로 변경
		
		try (FileReader fis = new FileReader(".//src//io//FileEx4.java");
				BufferedReader br = new BufferedReader(fis)	){	//bufferedreader가 들어왔기 때문에 스트링으로 들어온다 - 스트링선언
				
			String str = null;
			 int i = 1;
			 while((str = br.readLine())!=null) {
				 System.out.println(i+" "+str);
				 i++;		//BufferedReader가 들어왔으니 ReadLine을 써먹을수있다. 코드가 더 간결해진다
				 
			 }	
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		
		
		
	}

}
