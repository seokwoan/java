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
		// 서버가 시작될때, 한 번만 실행되는 method
		ResourceBundle rb = ResourceBundle.getBundle( "class_bundle/mainProp" );
		Enumeration key = rb.getKeys();
		while( key.hasMoreElements() ) {
			String k = (String)key.nextElement(); // signup.do , signin.do 둥둥
			String value = rb.getString( k ); // service.Mamberjoin
			
			try {
				Class<?> hcl = Class.forName( value );
				MainActive his = (MainActive)hcl.newInstance(); // 객체 생성
				map.put( k , his );
				
			}
			catch( Exception e ) {
				e.printStackTrace();
				System.out.println( "mainProp 파일 Map 변환 실패" );
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
		
		String uri = request.getRequestURI(); // 사용자가 요청한 주소
		// uri = /signup.do
		String cmd = uri.substring( uri.lastIndexOf("/")+1 );
		
		String view = "/"; // 사용자가 보는 뷰페이지
		
//		if( cmd.equals( "signup.do") ) {
//			if( request.getMethod().equals("POST") ) { // 회원강입 양식 페이지 이동
//				// request.getMethod() -> 사용자 요청방식을 알 수 있는 method
//				MemberJoin save = new MemberJoin();
//				save.join( request , response );
//			}
//			else {
//				view = "Member/signup.html";
//			}	
//		}
//		else if( cmd.equals( "signin.do") ) { // 로그인 양식 페이지 이동
//			view = "Member/signin.jsp";
//		}
		
		MainActive target = map.get( cmd ); // key값이 cmd인 value의 class객체를 저장
		view = target.action( request , response );
		
		if( view != null ) { // view가 null이면 redirect, 아니면 forward 
			RequestDispatcher rd = request.getRequestDispatcher( view );
			rd.forward( request , response );
		}

	}

}