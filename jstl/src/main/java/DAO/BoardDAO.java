package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.BoardDTO;

public class BoardDAO extends DBConnect{
	
	public void save( BoardDTO board ) {
		
		String sql ="insert into board(title, writer, content) values(?,?,?)";
		
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		
		try{
			
			pt = conn.prepareStatement(sql);
			pt.setString(1, title);
			pt.setString(2, writer);
			pt.setString(3, content);
			pt.executeUpdate();
		}
		catch(SQLException e){
			e.printStackTrace();
			System.out.println( "게시글 저장 실패" );
		}
		
	}
	
	public List<BoardDTO> findAll( int row , String keyWord ){
		
		keyWord = "%" + keyWord + "%";
		String sql = "select * from board where title like ? or content like ? order by board_id desc limit ? , 10";
		List<BoardDTO> list = new ArrayList<>();
		
		try {
			pt = conn.prepareStatement( sql );
			pt.setInt( 3 , row);
			pt.setString( 1 , keyWord );
			pt.setString( 2 , keyWord );
			rs = pt.executeQuery();
			
			while( rs.next() ) {
				list.add( new BoardDTO( rs.getInt( "board_id" ), rs.getString( "title" ), rs.getString( "writer" ),
							rs.getString( "content" ), rs.getInt( "hit" ) ) );
			}
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "게시글 불러오기 실패" );
		}
		
		
		return list;
	}	
	

	public int totalCount( String keyWord ) {
		
		keyWord = "%" + keyWord + "%";
		
		String sql = "select COUNT('board_Id') as cnt from board where title like ? or content like ?";
		int a = 0;
		
		try{
			pt = conn.prepareStatement(sql);
			pt.setString( 1 , keyWord );
			pt.setString( 2 , keyWord );
			rs = pt.executeQuery();
			if( rs.next() ) {
				a = rs.getInt("cnt");
			}
		}	
		catch( SQLException e ) {
			e.printStackTrace();
			
		}
		
		return a;
	}	
	
	
	public BoardDTO findById( int bid ) { // 게시글 상세 페이지
		
		
		String sql = "select * from board where board_id=?";
		
		try {
			pt =conn.prepareStatement(sql);
			pt.setInt( 1 , bid ); // board_id 컬럼의 타입이 int
			rs = pt.executeQuery();
			if( rs.next() ) {
				return new BoardDTO( rs.getInt(1) , rs.getString(2) , rs.getString(3) , rs.getString(4) , rs.getInt(5) );
			}		
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "게시글 상세 데이터 조회 실패" );
		}
		return null;
	}

	public void delete(int bid) {
		
		String sql = "delete from board where board_id=?";
		
		try {
			pt = conn.prepareStatement( sql );
			pt.setInt( 1 , bid );
			pt.executeUpdate();
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "게시물 삭제 실패" );
		}
		
	}
	
}	














