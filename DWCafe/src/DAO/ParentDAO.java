package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ParentDAO {

	protected Connection conn;
	protected PreparedStatement pt;
	protected ResultSet rs;
	
	public ParentDAO() {
		driverLoad();
		connect();
	}
	
	private void driverLoad() { // �����ͺ��̽� ����̹� �ε�
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch( Exception e ) {
			System.out.println( "����̹� �ε� ����" );
		}
	}
	
	private void connect() { // �����ͺ��̽� ����
		String user = "swgg";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/swgg";
		try {
			conn = DriverManager.getConnection( url , user , password );
		
		}
		catch( Exception e) {
			System.out.println( "������ ���̽� ���� ����" );
		}
	}
}











