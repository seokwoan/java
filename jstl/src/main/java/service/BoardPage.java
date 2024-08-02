package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardPage implements MainActive{

	@Override
	public String action ( HttpServletRequest request , HttpServletResponse response ) {
	
		
		BoardDAO dao = new BoardDAO();
		
		String keyWord = request.getParameter( "word" );
		if( keyWord == null ) keyWord="";
		
		// ����¡
		int pageNum = 1;
		if( request.getParameter("page") != null ) {
			pageNum = Integer.parseInt( request.getParameter("page") );
		}
		
		int total = dao.totalCount( keyWord );
		
		int skip = 5; // ȭ�鿡 ��µǴ� ������ ��ȣ ����
		
		int pagePost = 10; // ���������� �Խñ� �
		
		int pageTotalNum = total / pagePost ; // �� �������� ( �� �Խñۼ� / �������� �Խñۼ� )
		
		if( total % pagePost != 0 ) pageTotalNum++;
		
		int startPage = 1; // ���� ȭ�� ����¡ ���� ��ȣ
		
		int endPage = pageTotalNum > skip ? skip : pageTotalNum; //
		
		if( pageTotalNum > 5 && pageNum >= (skip/2+1) ) { //������ ��ȣ�� ��ġ�� �̵���Ű�鼭 ���� ��������ȣ ��� ǥ�� 
			startPage = pageNum - 2;
			endPage = pageTotalNum > pageNum + 2 ? pageNum + 2 : pageTotalNum;
			
		}
		
				
		
						
		// �Խñ� ��� ��������		
		
		int start = (pageNum - 1) * 10 ;
		List<BoardDTO> list = dao.findAll( start , keyWord ); // ��ü �Խñ� ��������
		
		
		request.setAttribute( "startPage" , startPage );
		request.setAttribute( "endPage" , endPage );
		request.setAttribute( "pageNum" , pageNum );
		request.setAttribute( "skip" , skip );
		request.setAttribute( "pageTotalNum", pageTotalNum );
		
		request.setAttribute( "list" , list );
		
		return "board/board.jsp";
	}
	
}