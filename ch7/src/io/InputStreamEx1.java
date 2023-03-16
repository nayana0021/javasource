package io;

import java.io.IOException;
import java.io.InputStream;

/*
 *  I/O(Input/Output)
 *  Input : 키보드
 *  Output : 화면 출력
 *  
 *  스트림(Stream) : 한쪽에서 다른 쪽으로 데이터를 전달하기 위해, 두 대상을 연결하고 
 *  					데이터를 전송할 수 있는 것
 *  1) 바이트 기반 스트림 : 바이트 단위로 데이터 전송
 *  					FileInputStream, FileOutputStream...
 *  2) 문자 기반 스트림 : 문자 단위로 데이터 전송
 *  					FileReader, FileWriter...
 */
public class InputStreamEx1 {
	public static void main(String[] args) {
		//input : 키보드
//		InputStream in = System.in;		//키보드에서 입력이 들어올거야 	//임포트 해야 사용 가능
//		
//		//입력이 들어오면 읽어오기
//		try {
//			// read() : 한 바이트만 읽어옴(읽어올 바이트가 없으면 -1리턴)
//			//			한글(3byte)은 깨짐
//			int input = 0;
//			while((input = in.read())!=-1) {	//read가 읽어올 byte가 없으면 마이너스를 리턴함//int로 받았으니까 int로 나옴 byte는 1개 읽어오면 끝 - 제일 앞 한개 
//			
//			System.out.println((char)input);	//char으로 하면 입력한 한 글자 반환(알파벳,숫자)
//		  }
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		// try-with-resource : Closable 을 구현한 클래스여야함
		// ()안에 생성된 객체는 알아서 닫아주게 됨
		try (InputStream in = System.in){
			int input = 0;
			while((input = in.read())!=-1) {	 
			
			System.out.println((char)input);	
		  }

		} catch (Exception e) {
			e.printStackTrace();
		}
		//finally 써서 안 닫아줘도 알아서 닫아준다
		
	}

}
