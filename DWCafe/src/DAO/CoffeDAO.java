package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffe;

public class CoffeDAO extends ParentDAO{

	public HashMap< Integer , Coffe > findAll(){
		
		HashMap< Integer , Coffe > data = new HashMap<>();
		
		String sql = "select * from coffe";
		// 데이터 베이스에서 정렬해서 가져오면 자바에서 정렬할 필요가 없음
		// coffe order by price desc - 내림차순 , asc - 오름차순
		// table명 order by column명 asc - > column명의 데이터로 table을 정렬
		
		try {
			pt = conn.prepareStatement( sql );
			rs = pt.executeQuery(); // select - executeQuery
									// insert, update, delete - executeUpdate
			while( rs.next() ) {
				// rs.get데이터타입("컬럼명");
				data.put( rs.getInt( "coffe_id" ) , new Coffe( rs.getInt("price") , rs.getString("item_name") , rs.getBoolean("decaffein") ) );
				// data는 HashMap -> put( key , value ) -> value에는 Coffe의 객체가 들어감
			}
		}
		catch( SQLException e ) {
			System.out.println( "coffe 테이블 조회 실패" );
		}
	
		return data;		
	}
}
