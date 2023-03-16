package io;

import java.io.File;
import java.io.IOException;

public class FileEx1 {
	public static void main(String[] args) throws IOException {
		// 자바에서 파일 다루기
		
		// \ => escape문자(\t,\n,\b...)
		
		//File(String pathname)
		
		File file1 = new File("c://temp//test1.txt");	//객체로만 만들어내서 오류가 나지 않음
//		File file1 = new File("//Users//youngkyung//eclipse-workspace//ch7//test1.txt");	//이건 실제 경로를 쓴건데 필요없음
//		File file1 = new File("c:\\temp\\test1.txt");	//원본 - 윈도우 적용
		
//		//File(String parent, String child)
//		File file2 = new File("c:\\temp","test1.txt");
//		
//		//File(File parent, String child)
//		File dir = new File("c:\\temp");
//		File file3 = new File(dir, "test1.txt");
				
		//File(URI uri)
		
		
		// 주요메소드
		String fileName = file1.getName();
		// .위치 찾기, substring 써서 test1 추출
		int pos = fileName.lastIndexOf(".");
		
		
		
		System.out.println("파일명 "+fileName);
		System.out.println("확장자를 제외한 파일명 "+fileName.substring(0,pos));
		System.out.println("확장자 "+fileName.substring(pos+1));
		
		// getPath()
		System.out.println("파일명을 포함한 파일의 경로 "+ file1.getPath());
		//getAbsolutePath():파일의 절대경로 , getCanonicalPath() : 파일의 정규경로
		System.out.println(file1.getAbsolutePath());//절대경로
		System.out.println(file1.getCanonicalPath());//정규경로
		//getParent()
		System.out.println("파일이 속해 있는 디렉토리 "+file1.getParent());
		
		// File.pathSeparator : 운영체제에서 사용하는 경로 구분자(윈도우 : ;, 유닉스 : :(콜론))
		System.out.println("File.pathSeparator "+File.pathSeparator); // :
		System.out.println("File.pathSeparatorChar "+File.pathSeparatorChar); // :
		// File.separator : 운영체제에서 사용하는 이름 구분자(윈도우 : \, 유닉스 : /)
		System.out.println("File.separator "+File.separator); // /
		System.out.println("File.separatorChar "+File.separatorChar); // /
	}

}



