package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx6 {
	public static void main(String[] args) {
		// copy ( //Users/youngkyung/eclipse-workspace/ch7//temp//file1.txt => //Users/youngkyung/eclipse-workspace/ch7//temp//file2.txt)
		
		try (FileInputStream fis = new FileInputStream("//Users//youngkyung//Desktop//temp//iu.mp4");
				FileOutputStream fos = new FileOutputStream("//Users//youngkyung//Desktop//temp//iucopy.mp4")){
			
			int data = 0;
			
			long start = System.currentTimeMillis();	//시작시간
			
			while((data=fis.read())!=-1) { 
				
			}
			
			long end = System.currentTimeMillis();	//종료시간
			
			System.out.println("InputStream / OutputStream 걸린 시간 "+(end-start)+"ms");
			
			
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
		
		//문자 같은 경우 FileReader, FileWriter로 한다
		//이 코드는 동영상,이미지,음악에 최적화됨
		//4줄코드를 2줄코드로 쓸수도 있다
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//iu.mp4"))
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("//Users/youngkyung/eclipse-workspace/ch7//temp//iucopy.mp4"))
		try (FileInputStream fis = new FileInputStream("//Users//youngkyung//Desktop//temp//iu.mp4");
				BufferedInputStream bis = new BufferedInputStream(fis); //읽어오는거
				FileOutputStream fos = new FileOutputStream("//Users//youngkyung//Desktop//temp//iucopy.mp4");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){ //쓰는거
			
			int data = 0;
			
			byte b[] = new byte[8192];	//8kb
			
			long start = System.currentTimeMillis();	//시작시간
			
			while((data=fis.read(b))!=-1) { 
				bos.write(b);			}
			
			long end = System.currentTimeMillis();	//종료시간
			
			System.out.println("InputStream+Buffered+byte / OutputStream+Buffered+byte 걸린 시간 "+(end-start)+"ms");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		
	}

}
