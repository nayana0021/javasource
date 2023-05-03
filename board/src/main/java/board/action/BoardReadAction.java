package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.BoardDTO;
import board.service.BoardReadService;

public class BoardReadAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get 으로 넘어오는거 받기
		int bno = Integer.parseInt(request.getParameter("bno"));
		// service 작업
		BoardReadService service = new BoardReadService();
		BoardDTO dto = service.read(bno);
		
		request.setAttribute("dto", dto); // 담아서 가져가
		
		// ActionForward -> readForm.jsp 
		return new ActionForward(false, "readForm.jsp");
	}

}
