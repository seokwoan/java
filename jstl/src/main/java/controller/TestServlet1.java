package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet1
 */
@WebServlet("/test1") 
// 요청하는 주소를 바꿀수 있음 -> 컨테이너에서 처리해서 Servlet에 넘긴다
// 
public class TestServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 기본 response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().append("MY servlet doGet method").append(request.getContextPath());
		// response.sendRedirect( "/" ); 사용자 요청 주소를 변경하여 페이지처리
		
		RequestDispatcher rd = request.getRequestDispatcher( "index.jsp" );
		rd.forward( request, response );
		// pagecontext없이 forward를 해주기 위한 방법
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
