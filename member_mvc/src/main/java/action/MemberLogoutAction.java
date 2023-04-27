package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class MemberLogoutAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// get/post => X
		// service 필요없음(DB 작업 없음)
		
		// session 해제
		HttpSession session = request.getSession();
		session.removeAttribute("loginDto"); // or session.invalidate(); 모든 세션 날리기 removeAttibute 하면 세션아이디 남아있는데 그것은 브라우저를 안 닫아서 그럼
		
		// ActionForward : index.jsp
		return new ActionForward(true, "index.jsp");
	}

}
