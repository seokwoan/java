package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.MemberDAO;
import DTO.MemberDTO;

public class MemberJoin implements MainActive{

	public String action( HttpServletRequest request , HttpServletResponse response ) {
		// 회원가입을 처리해주는곳 - 사용자가 입력한 값을 데이터베이스에 저장해야한다.
		String id = request.getParameter( "userId");
		String pw = request.getParameter( "userPassword" );
		String email = request.getParameter( "userEmail" );
		String name = request.getParameter( "userName" );
		
		MemberDTO dto = new MemberDTO( id, pw, email, name );
		
		// 데이터베이스에 저장하기 
		MemberDAO dao = new MemberDAO();
		dao.save( dto );
		
		try {
			response.sendRedirect("/");
		}
		catch( IOException e ) {		
			return null;
		}

		return null;
		
	}
	
}
