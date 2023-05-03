package board.service;

import board.persistence.BoardDAO;

public class BoardDeleteService {
	public boolean remove(int bno, String passowrd) {
		return new BoardDAO().deleteArticle(bno, passowrd);
	}
}
