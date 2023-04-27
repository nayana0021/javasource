package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import domain.BookDTO;
import domain.SearchDTO;
import persistence.BookDAO;
import service.BookSearchService;
import service.BookUpdateService;

public class BookSearchAction implements BookAction {

	@Override
	public BookActionForward execute(HttpServletRequest request) throws Exception {
		
		// get 넘어오는 내용 가져오기 (이름으로 그 안에 value를 받는거임)
		String criteria = request.getParameter("criteria");
		String keyword = request.getParameter("keyword");
		
		// service 를 통해 데이터베이스 작업
		BookSearchService service = new BookSearchService();
		List<BookDTO> list = service.list(criteria, keyword);
		
		
		SearchDTO searchDTO = new SearchDTO(criteria, keyword);
		
//		request.setAttribute("criteria", criteria); // jsp 까지 공유하고싶은 경우 (개별로) 근데 이제 여러 개로 담고 싶어 ~ -> 객체로 만든다
//		request.setAttribute("keyword", keyword);
		// 두개의 값을 하나에 담으려면 객체에 담는다
		
		request.setAttribute("searchDTO", searchDTO); 
		request.setAttribute("list", list); // 공유해야하는건 setAttribute에 담는다
		
		// ActionForward
	
		return new BookActionForward(false, "list.jsp");
	}
}
