package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import service.MemberLeaveService;

public class MemberLeaveAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		
		// service DB 작업
		MemberLeaveService service = new MemberLeaveService();
		boolean leaveFlag = service.leave(userid, password);
				
		// 탈퇴 성공시 세션 해제 index.jsp
		String path ="";
		if(leaveFlag) {
			HttpSession session = request.getSession();
			session.invalidate();
			path = "index.jsp";
		}else {
			path = "leave.jsp";
		}
		return new ActionForward(true, path);
	}

}
