package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.domain.PageDTO;
import board.service.BoardReadService;

public class BoardReplyViewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get 으로 넘어오는거 받기
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		int page = Integer.parseInt(request.getParameter("page"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		PageDTO pageDTO = new PageDTO(criteria, keyword, page, amount);

		
		
		
		
		// service 작업
		BoardReadService service = new BoardReadService();
		BoardDTO dto = service.read(bno);
		
		request.setAttribute("dto", dto); // 담아서 가져가
		request.setAttribute("pageDTO", pageDTO);
		
		// ActionForward -> readForm.jsp 
		return new ActionForward(false, "replyForm.jsp");
	}

}
