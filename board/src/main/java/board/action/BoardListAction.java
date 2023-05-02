package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardListService;

public class BoardListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get or post로 넘어오는게 없음!
		// service 작업만
		BoardListService service = new BoardListService();
		List<BoardDTO> list = service.getList();
		
		
		request.setAttribute("list", list); // 담아가야함 "list"라는 이름으로 담았다
		
		//ActionForward : listForm.jsp
		return new ActionForward(false, "listForm.jsp"); // 무조건 false
	}

}
