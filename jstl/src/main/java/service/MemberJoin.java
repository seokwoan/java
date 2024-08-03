package service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.MemberDAO;
import DTO.MemberDTO;

public class MemberJoin implements MainActive{

	public String action( HttpServletRequest request , HttpServletResponse response ) {
		// ȸ�������� ó�����ִ°� - ����ڰ� �Է��� ���� �����ͺ��̽��� �����ؾ��Ѵ�.
		String id = request.getParameter( "userId");
		String pw = request.getParameter( "userPassword" );
		String email = request.getParameter( "userEmail" );
		String name = request.getParameter( "userName" );
		
		MemberDTO dto = new MemberDTO( id, pw, email, name );
		
		// �����ͺ��̽��� �����ϱ� 
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