package board.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardSearchService;

public class BoardSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// 검색기준과 검색어 가져오기
		String criteria = request.getParameter("criteria");
		String keyword = request. getParameter("keyword");
		
		//
		BoardSearchService service = new BoardSearchService();
		List<BoardDTO> list = service.search(criteria, keyword);
		
		request.setAttribute("list", list);
		
		//
		return new ActionForward(false, "listForm.jsp");
	}

}
