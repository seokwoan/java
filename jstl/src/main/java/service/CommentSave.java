package service;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import DAO.CommentDAO;

public class CommentSave implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {

		int bid = Integer.parseInt( request.getParameter( "boardId" ) );
		String comment = request.getParameter( "comment" );
		String writer = (String)request.getSession().getAttribute( "user" );
		
		CommentDAO dao = new CommentDAO();
		dao.save( bid , comment , writer );
		
		
		
		

		try {
			response.sendRedirect( "/boardView.do?id=" + bid );
		}
		catch( Exception e ) {
			e.printStackTrace();
			System.out.println( "댓글 저장 실패" );
		}
		
		return null;
	}

}
