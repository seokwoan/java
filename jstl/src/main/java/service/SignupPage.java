package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;


public class SignupPage implements MainActive{

	@Override
	public String action ( HttpServletRequest request , HttpServletResponse response ) {
		
		// ���̵� �ߺ� ������ �����ϱ� ���� ���� ȸ�����Ե� ���̵� ȸ������ �������� ������
		
		MemberDAO dao = new MemberDAO();
		
		List<String> ids = dao.findAllUserId();
		
		request.setAttribute( "idList" , ids );
	
		return "Member/signup.jsp";
	}
}
