package study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnect {

	public Connection conn;
	public PreparedStatement pt;
	public ResultSet rs;
	public DBconnect() {
		dblink();
	}
	private void dblink() {
		try{   // ����̹� �ε�
	 		Class.forName("com.mysql.cj.jdbc.Driver");
	 	}catch(Exception e){
	 		System.out.println(" ����̹� �ε� ���� ");
	 	}
	 	// ���� ����
	 	String user= "swgg";
	 	String password="123456";
	 	String url = "jdbc:mysql://localhost:3306/swgg";
	
	 	try{
	 		conn = DriverManager.getConnection(url, user, password);
	 	}catch(SQLException e){
	 		System.out.println("���� ���� ");
	 	}
	}
}
	
