package board.action;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import board.service.BoardCntService;

public class BoardCntAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get 가져오기 bno
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		// 페이지 나누기 정보
		String criteria = request.getParameter("criteria");
		String keyword = URLEncoder.encode(request.getParameter("keyword"), "utf-8");
		String page = request.getParameter("page");
		String amount = request.getParameter("amount");
		
		
		// 조회수 증가
		BoardCntService service = new BoardCntService();
		service.cntUpdate(bno);
		
		
		String path = "read.do?bno="+bno+"&criteria="+criteria+"&keyword="+keyword+"&page="+page+"&amount="+amount; // 하나 가져와야 하니 read로 path 정하고
		
		return new ActionForward(true, path); // true : sendRedirect 로 가게 됨 => 최종적으로 조회수가 중복되지 않는다
	}

}
