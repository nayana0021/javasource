package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx2 {
	public static void main(String[] args) {
		// copy ( //Users/youngkyung/eclipse-workspace/ch7//temp//file1.txt => //Users/youngkyung/eclipse-workspace/ch7//temp//file2.txt
		
//		FileInputStream fis = null;
//		FileOutputStream fos = null;
//		try {
//			//원본 파일 읽기
//			//읽어온 내용을 새로운 파일에 쓰기
//			
//			//텍스트
////			fis = new FileInputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//file1.txt");
////			fos = new FileOutputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//file2.txt");
//			
//			//이미지
////			fis = new FileInputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//picture.jpeg");	//이미지 복사도 가능
////			fos = new FileOutputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//copy.jpeg");
//			
//			//동영상
//			fis = new FileInputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//iu.mp4");	//동영상 복사도 가능
//			fos = new FileOutputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//iucopy.mp4");
//			//자바로 카피 프로그램 만들수있다(경로 입력 받던가..)
//			
//			int data = 0;
//			while((data=fis.read())!=-1) { //한 바이트씩 읽어오는 것은 시간이 조금 걸린다..
//				fos.write(data);
//			}
//			
//			// FileNotFoundException 은 IOException이 처리 가능
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		
		//// try-with-resource구문으로 바꿈
		try (FileInputStream fis = new FileInputStream("//Users//youngkyung//Desktop//temp//iu.mp4");
				FileOutputStream fos = new FileOutputStream("//Users//youngkyung//Desktop//temp//iucopy.mp4")){
			//원본 파일 읽기
			//읽어온 내용을 새로운 파일에 쓰기
			
			//텍스트
//			fis = new FileInputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//file1.txt");
//			fos = new FileOutputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//file2.txt");
			
			//이미지
//			fis = new FileInputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//picture.jpeg");	//이미지 복사도 가능
//			fos = new FileOutputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//copy.jpeg");
			
			//동영상
			
			int data = 0;
			while((data=fis.read())!=-1) { //한 바이트씩 읽어오는 것은 시간이 조금 걸린다..
				fos.write(data);
			}
			
			// FileNotFoundException 은 IOException이 처리 가능
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
