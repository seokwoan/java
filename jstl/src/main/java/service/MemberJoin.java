package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;

public class MemberJoin {

	public void join( HttpServletRequest request , HttpServletResponse response ) {
		// ȸ�������� ó�����ִ°� - ����ڰ� �Է��� ���� �����ͺ��̽��� �����ؾ��Ѵ�.
		String id = request.getParameter( "userId");
		String pw = request.getParameter( "UserPassword" );
		String email = request.getParameter( "UserEmail" );
		String name = request.getParameter( "UserName" );
		
		// �����ͺ��̽��� �����ϱ� 
		MemberDAO dao = new MemberDAO();
		
		
	}
	
}




