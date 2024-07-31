package DAO;

import java.sql.SQLException;

import DTO.BoardDTO;

public class BoardDAO extends DBConnect{
	
	public void save( BoardDTO board ) {
		DBConnect db = new DBConnect();
		// db.pt = db.conn.prepareStatement(sql);
		
		String sql ="insert into board(title, writer, content) values(?,?,?)";
		
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		
		try{
			
			db.pt = db.conn.prepareStatement(sql);
			db.pt.setString(1, title);
			db.pt.setString(2, writer);
			db.pt.setString(3, content);
			db.pt.executeUpdate();	
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
		int boardId = 0 ;
		sql = "select board_id from board order by board_id desc limit 1";
		
		try{
			db.pt = db.conn.prepareStatement( sql );
			db.rs = db.pt.executeQuery();
			if( db.rs.next() ){ 
				boardId = db.rs.getInt( "board_id" );
			}
		}
		catch( SQLException e ){
			e.printStackTrace();
		}
	}
	
}
