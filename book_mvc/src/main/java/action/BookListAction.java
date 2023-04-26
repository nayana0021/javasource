package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import service.BookListService;

public class BookListAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		
		//get or post 넘어오는 내용 가져오기 => X 넘어오는게 없어서 안함~
		
		// service를 통해 데이터베이스 작업
		BookListService service = new BookListService();
		List<BookDTO> list = service.list();
		
		request.setAttribute("list", list); // ==> 무조건 forward 이게 아니면 sendRedirect
		
		return new BookActionForward(false, "list.jsp");
	}

}
