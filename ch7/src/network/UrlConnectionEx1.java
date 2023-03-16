package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/*
 *  URLConnection 클래스 : 어플리케이션과 URL간의 통신 연결을 나타내는 클래스
 */


public class UrlConnectionEx1 {
	public static void main(String[] args) {
		
		BufferedReader input = null;
		String line = "";
		
		
		
		try {
			
			URL url = new URL("https://www.naver.com");
			
			// url.openStream() : 연결된 url 에서 데이터를 읽어 InputStream 형태로 리턴
			// InputStreamReader() : InputStream => Reader 변환
			
			// BufferedReader(FileReader)	리더가 오면 리더가 와야함
			// BufferedInputStream(FileInputStream) 버퍼인풋스트림이 오면 파일인풋스트림이 와야하는데
			
			
			// url.openStream() 대신에 URLConnection 사용하기
//			URLConnection con = url.openConnection();
//			con.getInputStream();
			
			
			input = new BufferedReader(new InputStreamReader(url.openStream()));	//인풋스트림리더를 중간에 하나 쓰면 버퍼드리더로 바꿔줌
			//강의 3.15 오후 4시 40분 확인
			
			while ((line=input.readLine())!=null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
//네트워크 기반 ==> 소켓 프로그래밍으로 많이 함
	// TCP/UDP 등
}
