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
}	