package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DAO.BoardDAO;
import DAO.CommentDAO;
import DTO.BoardDTO;
import DTO.CommentDTO;


public class BoardView implements MainActive{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		// �Խñ� �� ���� �������� �ڵ�
		int bid = Integer.parseInt( request.getParameter( "id" ) );
		BoardDAO dao = new BoardDAO();
		
		BoardDTO dto = dao.findById( bid );
		// �Խñ� �ڵ� and
		
		// �ش� �Խñ��� ��� ���� ��������
		CommentDAO cdao = new CommentDAO();
		
		List<CommentDTO> cList = cdao.findByBoardId( bid );
		
		
		request.setAttribute( "board" , dto );
		request.setAttribute( "comments" , cList );
		
		return "/board/view.jsp";
	}

	
}
