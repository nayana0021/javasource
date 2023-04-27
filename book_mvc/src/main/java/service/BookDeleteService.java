package service;

import persistence.BookDAO;

public class BookDeleteService {
	
	public boolean remove(int code){
		//return new BookDAO().delete(code); // 한 번에 해도 됨
		
		BookDAO dao = new BookDAO();
		return dao.delete(code);
	}
}
