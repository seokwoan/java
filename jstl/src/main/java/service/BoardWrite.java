package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardWrite implements MainActive{

	@Override
	public String action ( HttpServletRequest request , HttpServletResponse response ) {
		String method = request.getParameter( "method" );
		
		if( method != null ) {
			String title = request.getParameter( "title" );
			String writer = (String)request.getSession().getAttribute( "user" );
			String content = request.getParameter( "content" );
			
			BoardDTO dto = new BoardDTO( title, writer, content );
			
			BoardDAO dao = new BoardDAO();
			
			dao.save(dto);
			
			return "/board.do";
		}
		else {
			return "board/boardWrite.jsp";
		}
	}
}
