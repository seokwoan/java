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
				// rs.getInt( column�� ) -> column���� �ƴ϶� column�� ������ ���ڷ� �־ �ȴ�
				// rs.getInt( "tea_id" ) , new tea( rs.getInt("price") , rs.getString("item_name") )
				// tea_id�� ù��° column�̹Ƿ� 1      price�� 3��° column�̹Ƿ� 3   item_name�� 2��° column�̹Ƿ� 2 
			}
			
		}
		catch( SQLException e ) {
			System.out.println( "tea ���̺� ��ȸ ����" );
		}
		
		
		
		return data;		
	}
}
