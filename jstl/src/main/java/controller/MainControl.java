package controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MainActive;
import service.MemberJoin;

/**
 * Servlet implementation class MainControl
 */
@WebServlet("/MainControl")
public class MainControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap< String , MainActive > map = new HashMap<>();
       
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
		// ������ ���۵ɶ�, �� ���� ����Ǵ� method
		ResourceBundle rb = ResourceBundle.getBundle( "class_bundle/mainProp" );
		Enumeration key = rb.getKeys();
		while( key.hasMoreElements() ) {
			String k = (String)key.nextElement(); // signup.do , signin.do �յ�
			String value = rb.getString( k ); // service.Mamberjoin
			
			try {
				Class<?> hcl = Class.forName( value );
				MainActive his = (MainActive)hcl.newInstance(); // ��ü ����
				map.put( k , his );
				
			}
			catch( Exception e ) {
				e.printStackTrace();
				System.out.println( "mainProp ���� Map ��ȯ ����" );
			}
					
		}
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
		
		String uri = request.getRequestURI(); // ����ڰ� ��û�� �ּ�
		// uri = /signup.do
		String cmd = uri.substring( uri.lastIndexOf("/")+1 );
		
		String view = "/"; // ����ڰ� ���� ��������
		
//		if( cmd.equals( "signup.do") ) {
//			if( request.getMethod().equals("POST") ) { // ȸ������ ��� ������ �̵�
//				// request.getMethod() -> ����� ��û����� �� �� �ִ� method
//				MemberJoin save = new MemberJoin();
//				save.join( request , response );
//			}
//			else {
//				view = "Member/signup.html";
//			}	
//		}
//		else if( cmd.equals( "signin.do") ) { // �α��� ��� ������ �̵�
//			view = "Member/signin.jsp";
//		}
		
		MainActive target = map.get( cmd ); // key���� cmd�� value�� class��ü�� ����
		view = target.action( request , response );
		
		if( view != null ) { // view�� null�̸� redirect, �ƴϸ� forward 
			RequestDispatcher rd = request.getRequestDispatcher( view );
			rd.forward( request , response );
		}

	}

}