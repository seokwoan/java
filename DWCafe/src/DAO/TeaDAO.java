package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffe;
import DTO.Tea;

public class TeaDAO extends ParentDAO{
	
	public HashMap< Integer , Tea > findAll(){
		
		HashMap< Integer , Tea > data = new HashMap<>();
		
		String sql = "select * from tea";
		
		try {
			pt = conn.prepareStatement( sql );
			rs = pt.executeQuery();
			
			while( rs.next() ) {
				data.put( rs.getInt( 1 ) , new Tea( rs.getInt( 3 ) , rs.getString( 2 ) ) );
				// rs.getInt( column명 ) -> column명이 아니라 column의 순서를 숫자로 넣어도 된다
				// rs.getInt( "tea_id" ) , new tea( rs.getInt("price") , rs.getString("item_name") )
				// tea_id는 첫번째 column이므로 1      price는 3번째 column이므로 3   item_name은 2번째 column이므로 2 
			}
			
		}
		catch( SQLException e ) {
			System.out.println( "tea 테이블 조회 실패" );
		}
		
		
		
		return data;		
	}
}
