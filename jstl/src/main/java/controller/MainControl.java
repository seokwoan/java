package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberJoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doMethod( request , response );
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doMethod( request , response );
	}
	
	protected void doMethod(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		
		String uri = request.getRequestURI(); // 사용자가 요청한 주소
		// uri = /signup.do
		String cmd = uri.substring( uri.lastIndexOf("/")+1 );
		
		String view = "/"; // 사용자가 보는 뷰페이지
		
		if( cmd.equals( "signup.do") ) {
			MemberJoin save = new MemberJoin();
			save.join( request , response );
			
			view = "Member/signup.html";
		
		}
		else if( cmd.equals( "signin.do") ) {
			view = "Member/signin.jsp";
		}
		
		RequestDispatcher rd = request.getRequestDispatcher( view );
		rd.forward( request , response );

	}

}















