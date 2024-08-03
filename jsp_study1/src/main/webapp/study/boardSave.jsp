<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*" %>

<%-- boardSave.jsp --%>

<% 
	request.setCharacterEncoding("UTF-8");
	// 작성자 가져오기
	String writer = ((Member)session.getAttribute("user")).getUserId();
	
	
	// 이미지 업로드해서 저장될 실제 위치
	String path ="C:\\ssw\\gitjava\\java\\jsp_study1\\src\\main\\webapp\\study\\image";
	// 자바에서는 \는 특수문자를 사용하기 위해 씀 -> 문자열로 사용하려면 \\ 2개 붙여서 사용
	// 업로드할 이미지의 최대크기
	int size= 1024 * 1024  * 20;
	
	String title =null;
	String content = null;
	String imgName = null;
	String imgPath = "/jsp_study1/study/image/";
	
	try{
		
		// 파일 업로드를 위한 MultipartRequest 객체 생성 
		// ( request , 업로드위치 , 크기 , "utf-8" , new DefaultFileRenamePolicy() )
		//                                       이미 같은 이름의 파일이 존재한다면 이름을 바꿔줌
		
		MultipartRequest mr = new MultipartRequest( request , path , size , "utf-8" , new DefaultFileRenamePolicy() );
		
		// 업로드이미지 파일 이름 가져오기
		Enumeration em = mr.getFileNames();
		String file = (String) em.nextElement(); // 이미지 한개만 업로드 하기 때문에 nextElement 한번만 하면 된다
		
		imgName = mr.getFilesystemName( file ); // 실제 저장된 파일이름을 가져옴
		// mr.getOriginalFileName( file ) -> 원본의 파일 이름을 가져옴
		
		// 제목과 내용 파라미터 가져오기
		title = mr.getParameter( "title" );
		content = mr.getParameter( "content" );
		
	}
	catch( Exception e ){
		System.out.println( "파일 업로드 실패" );
		e.printStackTrace();
	}
	
	
	
	// getParameter는 문자열을 가져오기 위한 method
	
	
	//데이터베이스 사용
	DBconnect db = new DBconnect();
	// db.pt = db.conn.prepareStatement(sql);
	
	String sql ="insert into board(title, writer, content) values(?,?,?)";
	
	try{
		
		db.pt = db.conn.prepareStatement(sql);
		db.pt.setString(1, title);
		db.pt.setString(2, writer);
		db.pt.setString(3, content);
		db.pt.executeUpdate();
		
	}catch(SQLException e){
		e.printStackTrace();
	}
	
	int boardId = 0 ; // 방금 저장한 게시글 번호를 저장하기 위한 변수
	sql = "select board_id from board order by board_id desc limit 1";
	// desc으로 내림차순 정렬, limit 1 -> 1개만 가져옴 -> 정렬된 board_id에서 하나만 가져옴 가장위의 값을 가져옴
	try{
		db.pt = db.conn.prepareStatement( sql );
		db.rs = db.pt.executeQuery();
		if( db.rs.next() ){ // 하나의 값만 가져와 while문이 아닌 if문 
			boardId = db.rs.getInt( "board_id" );
		}
	}
	catch( SQLException e ){
		e.printStackTrace();
	}
	
	sql = "insert into board_img(board_id , img_name , img_path ) value( ? , ? , ? )";
	
	try{
		db.pt = db.conn.prepareStatement( sql );
		db.pt.setInt( 1 , boardId );
		db.pt.setString( 2, imgName );
		db.pt.setString( 3, imgPath );
		db.pt.executeUpdate();
	}
	catch( SQLException e ){
		e.printStackTrace();
	}

	response.sendRedirect("/jsp_study1/study/?part=board");


%>