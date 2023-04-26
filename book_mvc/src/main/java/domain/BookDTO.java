package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class BookDTO {
	private int code;
	private String title;
	private String writer;
	private int price;
	private String description;
	
//	public BookDTO(int code, String title, String writer, int price) {
//		super();
//		this.code = code;
//		this.title = title;
//		this.writer = writer;
//		this.price = price;
//	} 1) 이렇게 하던지:생성자 description 제외하고 생성 (getList 오류), 2) 바로 담는 방법 : BookDAO getList 코드 안에 수정  
	
	
}
