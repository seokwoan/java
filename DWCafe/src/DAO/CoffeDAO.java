package DAO;

import java.sql.SQLException;
import java.util.HashMap;

import DTO.Coffe;

public class CoffeDAO extends ParentDAO{

	public HashMap< Integer , Coffe > findAll(){
		
		HashMap< Integer , Coffe > data = new HashMap<>();
		
		String sql = "select * from coffe";
		// ������ ���̽����� �����ؼ� �������� �ڹٿ��� ������ �ʿ䰡 ����
		// coffe order by price desc - �������� , asc - ��������
		// table�� order by column�� asc - > column���� �����ͷ� table�� ����
		
		try {
			pt = conn.prepareStatement( sql );
			rs = pt.executeQuery(); // select - executeQuery
									// insert, update, delete - executeUpdate
			while( rs.next() ) {
				// rs.get������Ÿ��("�÷���");
				data.put( rs.getInt( "coffe_id" ) , new Coffe( rs.getInt("price") , rs.getString("item_name") , rs.getBoolean("decaffein") ) );
				// data�� HashMap -> put( key , value ) -> value���� Coffe�� ��ü�� ��
			}
		}
		catch( SQLException e ) {
			System.out.println( "coffe ���̺� ��ȸ ����" );
		}
	
		return data;		
	}
}
