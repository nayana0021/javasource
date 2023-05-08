package board.action;

import javax.servlet.http.HttpServletRequest;

import board.domain.PageDTO;
import board.service.BoardDeleteService;

public class BoardDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// 
		int bno = Integer.parseInt(request.getParameter("bno"));
		String password = request.getParameter("password");
		
		// 페이지 나누기 정보
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		int page = Integer.parseInt(request.getParameter("page"));
		int amount = Integer.parseInt(request.getParameter("amount"));
		PageDTO pageDTO = new PageDTO(criteria, keyword, page, amount);


		//
		BoardDeleteService service = new BoardDeleteService();
		String path = "";
		if(service.remove(bno, password)) {
			path = "list.do?criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}else {
			path = "modify.do?bno="+bno+"&criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount;
		}
		
		return new ActionForward(true, path);
	}

}
