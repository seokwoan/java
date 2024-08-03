<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<%-- 데이터베이스와 관련된 클래스는 java.sql에 있다  --%>

<%
	request.setCharacterEncoding( "utf-8" );
%>

<%-- 입력받는 페이지에서는 숫자, 영어 외의 언어를 입력받을 경우 있어야한다 --%>

<%--
	회원가입을 위해 입력 값을 Member class 객체로 저장하고 객체의 데이터를 데이터베이스에 저장한다
 --%>
 
<jsp:useBean id="newMem" class="study.Member" />

<jsp:setProperty property="*" name="newMem" />

<%
	// newMem 객체의 데이터를 데이터베이스에 저장
	// 1. 데이터 베이스 드라이버 로드
	// 2. 데이터 베이스 계정 접속
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	catch( Exception e ){
		System.out.println( "드라이버 로드 실패" );
	}

	// 계정 접속
	String user = "swgg";
	String password = "123456";
	String url = "jdbc:mysql://localhost:3306/swgg";
	
	Connection conn = null;
	PreparedStatement pt = null;
	try{
		conn = DriverManager.getConnection( url ,user , password );
	}
	catch( SQLException e ){
		System.out.println( "접속 실패" );
	}
	
	
	// member테이블에 회원가입 입력한 값 저장하기
	
	// 테이블에 저장하기
	// 1. sql쿼리문 작성
	// 2. PreparedStatement 또는 Statement 객체 생성
	// 3. PreparedStatement 또는 Statement 객체를 사용하여
	// 	  쿼리문 전달하기
	
	String sql = "insert into member( user_id, user_password, user_email, user_name ) values( ? , ? , ? , ? )";
	
	boolean isSuccess = true; // 테이블 저장 성공유무 true면 성공
	
	try{
		pt = conn.prepareStatement(sql); // PreparedStatement 객체 생성
		pt.setString( 1, newMem.getUserId() );
		pt.setString( 2, newMem.getUserPassword() );
		pt.setString( 3, newMem.getUserEmail() );
		pt.setString( 4, newMem.getUserName() );
		pt.executeUpdate(); // insert, Update, delete문을 사용시에는 executeUpdate()
		
	}
	catch( SQLException e ){
		isSuccess = false;
		e.printStackTrace();
		System.out.println( "member 테이블 저장 실패" );
		
		out.println( "<h1>회원가입 오류! 다시 입력!<h1>" + 
						"<a href='javascript:history.back()'>이전</a>" );
		// 테이블 저장 실패시 회원가입 페이지로 이동
		// response.sendRedirect( "/jsp_study1/study/?part=signup" );
	}
	
	// 테이블 저장 성공시 로그인 페이지로 이동
	if( isSuccess ){
		response.sendRedirect( "/jsp_study1/study/?part=signin" );
	}
	
	
%>