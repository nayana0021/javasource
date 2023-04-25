package lang;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringEx2 {
	public static void main(String[] args) {
		// String 생성자
		
		
		// new String(char Value[])
		char c[] = {'H','e','l','l','o'};
		String str1 = new String(c);
		System.out.println(str1);
		
		String str2 = "Hello";
		
		//length() : 문자열 길이
		System.out.println("length() : 문자열 길이 "+str1.length());
		
		// charAt(int index) : char => charAt 호출 시 int 매개변수를 넣어서 호출하고 결과(return)값은 char 받는다
		System.out.println(str1.charAt(0));
		System.out.println(str1.charAt(str1.length()-1));
		
		String str3 = "자바 프로그래밍";
		//str3 문자열에 '프' 문자가 들어있는지 확인 : length(), for, charAt()
		for (int i = 0; i < str3.length(); i++) {
			//System.out.println(str3.charAt(i));
			if(str3.charAt(i)=='프') {
				System.out.println("프가 들어있음");
				break;
			}
		}
		int cnt = 0 ;	 //프 문자 갯수를 세는 변수
		for (int i = 0; i < str3.length(); i++) {
			//System.out.println(str3.charAt(i));
			if(str3.charAt(i)=='프') {
				cnt++;
			}
		}
		System.out.println(cnt>0?"프가 들어있음":"");

		
		//indexOf(int ch) : 주어진 문자 ch가 문자열에 들어있는지 확인하고 위치(int값)를 리턴(못 찾으면 -1 리턴)
		//String str2 = "Hello";
		System.out.println("indexOf(int ch) : "+str2.indexOf('o'));
		System.out.println("indexOf(String str) : "+str2.indexOf("o"));
		System.out.println("indexOf(String str) : "+str2.indexOf("llo"));	//문자열 시작하는 위치가 돌아옴
		System.out.println("indexOf(int ch, int fromIndex) : "+str2.indexOf('e',0));	//1
		System.out.println("indexOf(int ch, int fromIndex) : "+str2.indexOf('e',2));	//-1
		
		//lastIndexOf() : 위치를 찾을 때 오른쪽 끝 부터 찾음
		System.out.println("lastindexOf(int ch) : "+str2.lastIndexOf('o'));
		
		//str3 문자열에 '프' 문자가 들어있는지 확인 : indexOf()
		//String str3 = "자바 프로그래밍";
		System.out.println(str3.indexOf('프') > -1 ? "프가 들어있음" : "");
		
		//subString() : 범위에 해당하는 문자열 얻기
		String ssn = "880515-1222012";
		//subString(int beginIndex)
		String result = ssn.substring(3);	//3부터 끝까지
		System.out.println(result);
		//subString(int beginIndex, int endIndex) : endIndex 는 미포함
		System.out.println("subString(int beginIndex, int endIndex) "+ssn.substring(3, 8)); //515-1
		
		
		// concat() : + 와 같은 역할 (문자 연결)
		String result2 = str2.concat(" 안녕하세요");
		System.out.println(result2); //Hello 안녕하세요
		
		
		// startWith(String prefix) : prefix로 시작하느냐? 해당문자열로 시작하느냐? 이뜻임
		// startWith(String prefix, int toOffset) : 
		String str4 = "java.lang.Object";
		System.out.println("startWith(String prefix) "+str4.startsWith("java"));
		System.out.println("startWith(String prefix) "+str4.startsWith("python"));
		System.out.println("startWith(String prefix,int toOffset) "+str4.startsWith("java",3));
		
		//endWith(String suffix) : suffix로 끝나느냐?
		System.out.println("endWith(String prefix) "+str4.endsWith("java"));
		
		// contains(CharSequence s) : s 문자열이 포함되었는지 검사 true,false를 리턴
		System.out.println("contains(CharSequence s) "+str2.contains("Hello"));
		
		//replace(원본문자열, 변경문자열) : 
		String str5 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";
		System.out.println(str5.replace("자바", "java")); //replace() 결과를 새로운 문자열로 리턴 - 값이 변경되는것이 아님
		//원본 문자열 변경하길 원한다면 새로운 문자열로 리턴되는 값을 다시 담아줘야 한다
		str5 = str5.replace("자바", "java"); //
		System.out.println(str5);
		
		System.out.println(str2.replace('H', 'h'));
		
		//replaceFirst(String regex, String replacement) : 첫번째 것만 변경
		System.out.println(str5.replaceFirst("java", "자바"));
		//replaceAll(String regex, String replacement) : 전체 다 바꾸어줌
		System.out.println(str5.replaceAll("java", "자바"));
		
		//공백도 문자다 - 공백 한개 : 한 칸 차지함
		//trim() : 양쪽 (앞 뒤) 공백을 제거해준다 -> 중간 공백은 제거 못함
		String str6 = "     Hello World      ";
		System.out.println(str6);
		System.out.println(str6.length());
		System.out.println(str6.equals("Hello World")); //공백을 가진 문자와 비교했기 때문에 결과값은 false
		System.out.println("trim() "+str6.trim()); //값이 바뀐게 아님
		
		// static => 클래스이름.메소드명, 클래스이름.상수 로 부른다
		// static String valueOf () : 지정된 값을 문자열로 변환하여 반환
		System.out.println(String.valueOf(true)); 	//	==> "true" 문자열로 돌려줌
		System.out.println(String.valueOf('c'));	//	 ==> "c"
		System.out.println(String.valueOf(100));	//	 ==> "100" ==> Integer.parseInt("100 ") 정수로 바꾸고 싶을때
		//메소드로 문자열로 바꿀려면 valueOf 사용
		
		// a 를 문자열로 변경
		int a =100;
		//a = a + "100"; int 값에 담으려고 해서 에러남
		String str7 = a + ""; //문자열로 바뀐다
//		String str7 = true + ""; //문자열로 바뀐다
		
		
		
		// toLowerCase() : 모든 문자열을 소문자로 변경 / toUpperCase() : 모든 문자열을 대문자로 변경
		System.out.println("toLowerCase() "+str2.toLowerCase()); //hello
		System.out.println("toUpperCase() "+str2.toUpperCase()); //Hello
		
		
		//	split() : 문자열 분리
		String animals = "dog,cat,bear";
		//regex : Regular expression(정규표현식) - 특정한 규칙을 가진 문자열의 집합
		String[] arr = animals.split(","); //콤마를 기준으로 나눠줘
		System.out.println(arr); //toString이 오버라이딩이 안되어있음! - 주소 값이 나온다
		
		System.out.println(Arrays.toString(arr)); //[dog, cat, bear]
		
		//for 문으로 값 확인 : 원하는 형태로 출력가능
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// split(String regex, int limit) : regex 로 나누되, limit 갯수로 나눠줘
		arr = animals.split(",", 2);
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// compareTo (String Str) : str과 문자열 비교(사전순서) 첫글자 기준
		// 같으면 0, 사전 순으로 이전이면 음수, 이후면 양수
		System.out.println("compareTo() "+"aaa".compareTo("aaa")); //0
		System.out.println("compareTo() "+"aaa".compareTo("bbb")); //-1
		System.out.println("compareTo() "+"bbb".compareTo("aaa")); //1
		System.out.println("compareTo() "+"aaa".compareTo("abc")); //-1 => 두번째 문자 비교

		
		//split() <==> join()
		// join() : 특정 문자열(구분자)로 결합
		arr = animals.split(",");
		System.out.println(Arrays.toString(arr));
		String str8 = String.join("-", arr);
		System.out.println("join() "+str8);
		
		
		
		
	}

}
