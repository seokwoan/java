package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DAO.CommentDAO;

public class CommentDelete implements MainActive {

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		int bid = Integer.parseInt( request.getParameter( "id" ) );
		int cid = Integer.parseInt( request.getParameter( "bid" ) );
				
		CommentDAO dao = new CommentDAO();
		dao.delete( cid );
		
		try {
			response.sendRedirect( "/board.do=" + bid );
		}
		catch( Exception e ) {
			
		}
		
		return null;
	}

}
