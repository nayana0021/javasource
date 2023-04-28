package action;

import javax.servlet.http.HttpServletRequest;

import domain.MemberDTO;
import service.MemberRegisterService;

public class MemberRegisterAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request) throws Exception {
		// post 가져오기
		MemberDTO dto = new MemberDTO();
		dto.setUserid(request.getParameter("userid"));
		dto.setPassword(request.getParameter("password"));
		dto.setName(request.getParameter("name"));
		dto.setGender(request.getParameter("gender"));
		dto.setEmail(request.getParameter("email"));

		
		
		// service 를 통해 DB 작업하기
		MemberRegisterService service = new MemberRegisterService();
		boolean insertFlag = service.memberInsert(dto);
		
		// 회원 가입 성공시 로그인 페이지
		String path = "";
		if(insertFlag) {
			path="login.jsp";
		}else {
			path="register.jsp";
		}
		
		// ActionForward
		return new ActionForward(true, path);
		//return 페이지이동방식(true, false), 페이지(String);
		//sendRedirect 방식일 때, true, forward 방식일 때 false
	}

}
