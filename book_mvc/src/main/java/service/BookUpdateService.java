package service;

import persistence.BookDAO;

public class BookUpdateService {
	
	public boolean updateBook(int code, int price){
//		BookDAO dao = new BookDAO();
//		return dao.update(code,price);
		
		return new BookDAO().update(code, price); // 같은 코드임.. 변수를 한번만 쓰면 그만이니까 변수에 안 담는 방법임
	}
}
