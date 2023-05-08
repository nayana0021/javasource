package board.service;

import java.util.List;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.persistence.BoardDAO;

public class BoardListService {
	public List<BoardDTO> getList(PageDTO pageDTO){
		
		// 전체 게시물 가져오기
		BoardDAO dao = new BoardDAO();

		List<BoardDTO> list = dao.getRows(pageDTO);
		
		return list;
	}
}
