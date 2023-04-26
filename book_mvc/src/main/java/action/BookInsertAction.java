package action;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookInsertService;

public class BookInsertAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		// get or post 넘어오는 내용 가져오기
		int code = Integer.parseInt(request.getParameter("code"));
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		int price = Integer.parseInt(request.getParameter("price"));
		String description = request.getParameter("description");
		
		BookDTO insertDto = new BookDTO(code,title,writer,price,description);
		
		// service 를 통해 데이터베이스 작업
		BookInsertService service = new BookInsertService();
		boolean insertFlag = service.insertBook(insertDto);
		
		String path = "";
		if(insertFlag) {
			path="list.do"; // or /book_mvc/list.do 슬래시를 빼버리면 현재 경로에서 뒤에만 바꿔줘 의미 jsp 에서는 c:url을 사용하고 action에서는 /를 빼라
		}else {
			path="insert.jsp";
		}
		
		// ActionForward
		
		return new BookActionForward(true, path); // true - sendRedirect (request.안했으니까)
	}

}
