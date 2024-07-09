package java0709_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BoardDAO { //database를 사용하기 위한 class
	
	private Connection conn; // database 접속 정보
	private Statement st; // SQL명령어 전달과 결과 받기 -> 직렬전달, 변수명이 그대로 전달 보안 취약
	private PreparedStatement pt; // SQL명령어 전달과 결과 받기 -> 병렬전달, 데이터 나눠서 전달 
	private ResultSet rs; // 데이터 조회 결과 저장

	public BoardDAO() { // 객체들 만들때 접속하고 접속이 되면 다시 접속할 필요가 없음
		DriverLoad(); // database 드라이버 로드
		Connect(); // database접속 
	}
	
	private void DriverLoad() { // database 드라이버 로드
		
		try { // 외부프로그램과의 연결이라 실패 가능성이 있어 try로 예외처리
			Class.forName( "com.mysql.cj.jdbc.Driver" );
		}
		catch( Exception e ) {
			System.out.println( "드라이버 로드 실패" );
		}
		
	}
	
	private void Connect() { // database접속
		String userName = "swgg";
		String password = "123456";
		String url = "jdbc:mysql://localhost:3306/swgg";
		
		try {
			conn = DriverManager.getConnection( url , userName , password );
		}
		catch( Exception e ) {
			System.out.println( "접속 실패" );
		}
		
	}
	
	
	// test_board 테이블의 데이터 가져와서 board class객체로 저장하기
	public Board[] findAll() {
		Board[] list = new Board[7]; // Board class 객체 7개를 저장하기 위한 배열
		
		String sql = "select * from test_board"; // sql 쿼리문
		// select 사용시 - executeQuery method 사용
		// insert, update, delete 사용시 - executeUpdate method 사용
		
		try {
			st = conn.createStatement(); // statement 생성
			rs = st.executeQuery(sql); // database의 데이터를 가져와 저장
			int i = 0; // 배열의 index 표현
			while( rs.next() ) {
				list[i] = new Board( rs.getInt( "board_id" ) ,
						rs.getString( "title" ) , rs.getString( "writer" ) ,
						rs.getString( "content" ) , rs.getInt( "hit" ) );
				i++;
			}
			
		}
		catch( Exception e ) {
			System.out.println( "데이터 가져오기 실패" );
		}
		
		return list;
	}
	
}


/*
 	Connection, statement or PreparedStatement , ResultSet 참조변수 필요
 
 	1. database와 연결하기위한 드라이버로드
	 	( mysql 5버젼 이후 - com.mysql.cj.jdbc.Driver
	 			5버젼 이하 - com.mysql.jdbc.Driver)
	 			
		Class.forName("com.mysql.jc.jdbc.Driver"); 프로그램이 실행중일때 메모리에 값을 로드하려면 Class.forName을 사용해야 한다.
	
	2. database 접속하기
		database 계정명, 비밀번호, 주소
		conn = DriverManager.getConnection ( 주소, 계정명, 비밀번호 );
		접속을 시도한 결과를 Connection의 참조변숭에 저장 
	
	3. conn을 통해서 Statement or PreparedStatement의 객체를 생성하여 SQL명령문 보내기
 
 */



























