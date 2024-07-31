package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class Signin implements MainActive{

	@Override
	public String action ( HttpServletRequest request , HttpServletResponse response ) {
		
		String id = request.getParameter( "userId" );
		String pw = request.getParameter( "userPassword" );
		
		// ������ ���̽����� ���̵� ��� ��ȸ �ϱ�
		MemberDAO dao = new MemberDAO();
		
		boolean isSuccess = dao.login( id, pw );
		
		if( isSuccess ) {
			request.getSession().setAttribute( "user" , id );
		}
		
		try {
			response.sendRedirect( "/" );
		}
		catch( Exception e ) {
			e.printStackTrace();
			System.out.println(  );
		}
		
		return null;
	}
}