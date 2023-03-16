package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputEx5 {
	public static void main(String[] args) {
		
		// 파일에서 문자단위로 읽어오기(버퍼를 사용해서)-보조스트림 사용
		// 읽어온 내용을 문자단위로 파일에 쓰기(퍼러를 사용)
		try(FileReader fr = new FileReader("//Users//youngkyung//Desktop//temp//file1.txt"); 
				BufferedReader br = new BufferedReader(fr);//읽어올 방식이 텍스트라면 윗줄부터 여기줄까지 두 줄까지가 베스트
				FileWriter fw = new FileWriter("//Users//youngkyung//Desktop//temp//output3.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {	//파일을 쓸거면 이줄 위에줄 두개 쓴다
			
			String str = null;
			// readLine() : 줄단위로 읽기
			// 				읽어올 행이 없다면 null
			while((str = br.readLine()) != null) {//줄 단위로 읽었어
				bw.write(str);	//줄 단위로 썼어
				// 엔터
				bw.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
