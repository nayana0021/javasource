package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

public class ReaderEx1 {
	public static void main(String[] args) {
		// Reader, Writer : 문자기반
		
		Reader reader = null;
		Writer writer = null;
		try {
			// 인코딩 : utf-8
			reader = new FileReader("//Users//youngkyung//Desktop//temp//file1.txt");
			
			// append : true => 기존 파일에 덧붙이기  //덧붙이기가 아닌 새로만들거면 뒤에 true를 뺀다
			writer = new FileWriter("//Users//youngkyung//Desktop//temp//output1.txt",true);
//			writer = new FileWriter("//Users/youngkyung/eclipse-workspace/ch7//temp//output2.txt");
			
			// ms949 : 윈도우즈용
			//reader = new FileReader("//Users/youngkyung/eclipse-workspace/ch7//temp//file1.txt",Charset.forName("ms949"));
			
			// 파일 출력
			int data = 0;
			while((data = reader.read())!=-1) {
				writer.write(data);
			}
			
			
			// 화면 출력
//			int data = 0;
//			while((data = reader.read())!=-1) {
//				System.out.print((char)data);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
