package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class MemberJoin {

	public void join( HttpServletRequest request , HttpServletResponse response ) {
		// 회원가입을 처리해주는곳 - 사용자가 입력한 값을 데이터베이스에 저장해야한다.
		String id = request.getParameter( "userId");
		String pw = request.getParameter( "UserPassword" );
		String email = request.getParameter( "UserEmail" );
		String name = request.getParameter( "UserName" );
		
		// 데이터베이스에 저장하기 
		MemberDAO dao = new MemberDAO();
		
		
	}
	
}




