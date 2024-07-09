package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO { //database�� ����ϱ� ���� class
	
	private Connection conn; // database ���� ����
	private Statement st; // SQL��ɾ� ���ް� ��� �ޱ� -> ��������, �������� �״�� ���� ���� ���
	private PreparedStatement pt; // SQL��ɾ� ���ް� ��� �ޱ� -> ��������, ������ ������ ���� 
	private ResultSet rs; // ������ ��ȸ ��� ����

	public BoardDAO() { // ��ü�� ���鶧 �����ϰ� ������ �Ǹ� �ٽ� ������ �ʿ䰡 ����
		DriverLoad(); // database ����̹� �ε�
		Connect(); // database���� 
	}
	
	private void DriverLoad() { // database ����̹� �ε�
		
		try { // �ܺ����α׷����� �����̶� ���� ���ɼ��� �־� try�� ����ó��
			Class.forName( "com.mysql.cj.jdbc.Driver" );
		}
		catch( Exception e ) {
			System.out.println( "����̹� �ε� ����" );
		}
		
	}
	
	private void Connect() { // database����
		String userName = "swgg";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/swgg";
		
		try {
			conn = DriverManager.getConnection( url , userName , password );
		}
		catch( Exception e ) {
			System.out.println( "���� ����" );
		}
		
	}
	
	
	// test_board ���̺��� ������ �����ͼ� board class��ü�� �����ϱ�
	public Board[] findAll() {
		Board[] list = new Board[7]; // Board class ��ü 7���� �����ϱ� ���� �迭
		
		String sql = "select * from test_board"; // sql ������
		// select ���� - executeQuery method ���
		// insert, update, delete ���� - executeUpdate method ���
		
		try {
			st = conn.createStatement(); // statement ����
			rs = st.executeQuery(sql); // database�� �����͸� ������ ����
			int i = 0; // �迭�� index ǥ��
			while( rs.next() ) {
				list[i] = new Board( rs.getInt( "board_id" ) ,
						rs.getString( "title" ) , rs.getString( "writer" ) ,
						rs.getString( "content" ) , rs.getInt( "hit" ) );
				i++;
			}
			
		}
		catch( Exception e ) {
			System.out.println( "������ �������� ����" );
		}
		
		return list;
	}
	
}


/*
 	Connection, statement or PreparedStatement , ResultSet �������� �ʿ�
 
 	1. database�� �����ϱ����� ����̹��ε�
	 	( mysql 5���� ���� - com.mysql.cj.jdbc.Driver
	 			5���� ���� - com.mysql.jdbc.Driver)
	 			
		Class.forName("com.mysql.jc.jdbc.Driver"); ���α׷��� �������϶� �޸𸮿� ���� �ε��Ϸ��� Class.forName�� ����ؾ� �Ѵ�.
	
	2. database �����ϱ�
		database ������, ��й�ȣ, �ּ�
		conn = DriverManager.getConnection ( �ּ�, ������, ��й�ȣ );
		������ �õ��� ����� Connection�� ���������� ���� 
	
	3. conn�� ���ؼ� Statement or PreparedStatement�� ��ü�� �����Ͽ� SQL��ɹ� ������
 
 */



























