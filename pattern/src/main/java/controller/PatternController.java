package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionFactory;
import action.ActionForward;
import action.DeleteAction;
import action.InsertAction;

/**
 * Servlet implementation class PatternController
 */
@WebServlet("*.do") // Url mapping : 이름은 상관없으나 끝날때는 .do 로 끝나야 함
public class PatternController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String requestURI = request.getRequestURI(); // 	/pattern/list.do
		// 프로젝트 == context
		String contextPath = request.getContextPath(); //프로젝트명을 가져옴 :	/pattern
		String cmd = requestURI.substring(contextPath.length()); //		list.do
		
		System.out.println("requestURI "+ requestURI);
		System.out.println("contextPath "+ contextPath);
		System.out.println("cmd "+ cmd);
		
		// 객체는 하나만 생성할거야(싱글톤 패턴)
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.action(cmd); //action 리턴 메소드
		
		// 생성된 액션에 일 시키기(메소드호출)
		ActionForward af = null;
		try {
			af = action.execute(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//
		if(af.isRedirect()) {
			response.sendRedirect(af.getPath());
		}else {
			RequestDispatcher rd = request.getRequestDispatcher(af.getPath());
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
