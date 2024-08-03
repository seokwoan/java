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
// ��û�ϴ� �ּҸ� �ٲܼ� ���� -> �����̳ʿ��� ó���ؼ� Servlet�� �ѱ��
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
		// �⺻ response.getWriter().append("Served at: ").append(request.getContextPath());
//		response.getWriter().append("MY servlet doGet method").append(request.getContextPath());
		// response.sendRedirect( "/" ); ����� ��û �ּҸ� �����Ͽ� ������ó��
		
		RequestDispatcher rd = request.getRequestDispatcher( "index.jsp" );
		rd.forward( request, response );
		// pagecontext���� forward�� ���ֱ� ���� ���
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
