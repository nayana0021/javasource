package service;

import domain.BookDTO;
import persistence.BookDAO;

public class BookInsertService {
	
	public boolean insertBook(BookDTO insertDto) { // insert 가 boolean을 리턴해주니까 (BookDAO의 insert 메소드에서)
		
		BookDAO dao = new BookDAO();
		return dao.insert(insertDto); // 바로 리턴해주는것임
		
	}
}
