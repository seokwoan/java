package DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.CommentDTO;

public class CommentDAO extends DBConnect{

	public void save(int bid, String comment, String writer) {
		
		String sql = "insert into comment(board_id, writer, comment, write_date) values(?, ?, ?, now())";
		
		try {
			pt = conn.prepareStatement( sql );
			pt.setInt( 1 , bid );
			pt.setString( 2 , comment );
			pt.setString( 3 , writer );
			pt.executeUpdate();
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "댓글 저장 실패" );
		}
	}

	public List<CommentDTO> findByBoardId(int bid) {
		
		String sql = "select * from comment where board_id=? order by write_date desc";
		List<CommentDTO> list = new ArrayList<>();
		
		try {
			pt = conn.prepareStatement( sql );
			pt.setInt( 1 , bid );
			rs = pt.executeQuery();
			
			while( rs.next() ) {
				list.add( CommentDTO.of( rs.getInt( "comment_id" ), rs.getInt( "board_id" ), rs.getString( "writer" ), rs.getString( "comment" ), rs.getDate( "write_date" ).toLocalDate() ) );
			}
		
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "댓글 조회 실패" );
		}
		
		
		return list;
	}

	public void delete(int bid) {
		
		String sql = "update comment set title=? , content=? where board_id=?";
		
		try {
			pt = conn.prepareStatement( sql );
			pt.setString( 1 , dto.getTitle() );
			pt.setString( 2 , dto.getContent() );
			pt.setInt( 3 , dto.getBoard_id() );
			pt.executeUpdate();			
		}
		catch( SQLException e ) {
			e.printStackTrace();
			System.out.println( "게시글 수정 오류" );
		}
		
	}


}


















