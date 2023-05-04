package board.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @ToString
@Setter @Getter @AllArgsConstructor
public class PageDTO {
	
	// 검색
	private String criteria;
	private String keyword;
	
	// 페이지 나누기 : 페이지 번호 , 한 페이지에 보여줄 목록 개수 변수 추가
	private int page;	// 사용자가 요청한 페이지 번호
	private int amount;	// 페이지당 보여줄 게시물 수
	
	
	public PageDTO(int page, int amount) {
		super();
		this.page = page;
		this.amount = amount;
	}
	
	
}
