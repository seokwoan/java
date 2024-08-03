package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberControl
 */
@WebServlet("/member")
public class MemberControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberControl() {
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
		
		String detail = "신규회원 가입 10명 남았습니다.";
		
		request.setAttribute( "message", detail );
		// servlet에서 만들어진 데이터를 forward를 통해 넘겨줄 수 있다. redirect는 불가
		// servlet class에의해 생성된 데이터를 사용자가 보는 페이지에 출력하려면 forward를 사용해야한다
		// 사용자가 보는 페이지에 html내용만 필요하거나 보여줄 데이터가 없는 경우 sendredirect를 사용한다
		
		RequestDispatcher rds = request.getRequestDispatcher( "/signin.jsp" );
		rds.forward( request, response );
		
//		response.sendRedirect( "/signin.jsp");
		// forward와 Redirect 전부 같은 페이지를 보여준다
		// forward는 주소가변하지 않음, Redirect는 주소가 변함
		// 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 입력한 아이디와 비밀번호 가져오기
		String id = request.getParameter( "id" );
		String pw = request.getParameter( "pw" );
		
		if( id.equals( "gold" ) && pw.equals( "1234" ) ){
			// 아이디 gold, 비밀번호 1234
			response.sendRedirect( "/" );
		}
		else {
			// 로그인 실패한 경우
			request.setAttribute( "fail" , "아이디 또는 비밀번호가 잘못되었습니다" );
			
			RequestDispatcher rsd = request.getRequestDispatcher( "main.jsp" );
			rsd.forward( request, response );
		}
		
		
		
	}

}

















