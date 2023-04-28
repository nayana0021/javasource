package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import action.MemberActionFactory;

/**
 * 주소줄에 넘어오는거 처리
 * Servlet implementation class MemberController
 */
@WebServlet("*.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String cmd = requestURI.substring(contextPath.length());
		
		MemberActionFactory maf = MemberActionFactory.getInstance();
		Action action = maf.action(cmd);
		
		ActionForward af = null; 
		
		try {
			af = action.execute(request); // Action 부모가 request 매개변수를 가지고 있다 각 자식마다 오버라이드한 액션이 들어옴
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(af.isRedirect()) {
			response.sendRedirect(af.getPath()); // ActionForward 리턴되는 boolean 값이 true 이면 sendRedirect 방식으로 이동
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(af.getPath()); // false 이면 forward
			rd.forward(request, response); // 서블릿에서 넘어오는 request를 jsp에 넘겨줘야해서 (내용을 공유해야하는 경우) forward
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
