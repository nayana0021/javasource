package action;

import javax.servlet.http.HttpServletRequest;

import service.BookDeleteService;

public class BookDeleteAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get or post 넘어오는 내용 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		
		// service 를 통해 데이터베이스 작업
		BookDeleteService service = new BookDeleteService();
		boolean deleteFlag = service.remove(code);
		// 성공이나 실패가 뜸(여기서는 사실 실패는 안 뜸 - 값을 가지고 들어왔기 때문에)
		
		String path = "";
		if(deleteFlag) { 
			path="list.do";
		}
		//성공하면 list.do 로 간다
		
		// ActionForward
		return new BookActionForward(true, path); // setAttribute 안 하면 무조건 sendRedirect 로 보내면 됨!!
	}

}
