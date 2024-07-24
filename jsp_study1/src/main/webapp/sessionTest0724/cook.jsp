<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%

	request.setCharacterEncoding("utf-8");	

	// form으로 전송해준 데이터 받기(파라미터)
	// 데이버 받아서 food, price, rest라는 name으로 쿠키에 저장하기
	// 만료시간은 1시간 10분으로 설정

	String food = request.getParameter("food");
	String price = request.getParameter("price");
	String rest = request.getParameter("rest");
	
	// 기존 쿠키가 존재한다면 가져와서 새로 입력한 값과 합치기
	Cookie[] cooks = request.getCookies();
	for( Cookie cook : cooks ){
		if( cook.getName().equals("food") ) food = cook.getValue() + "-" + food;
		if( cook.getName().equals("price") ) price = cook.getValue() + "-" + price;
		if( cook.getName().equals( "rest") ) rest = cook.getValue() + "-" + rest;
		// ( name , value ) -> name일때의 value를 가져옴
		// food에 새로운 value - food가 저장됨
	}

	Cookie foodInfo = new Cookie( "food" , food );
	Cookie priceInfo = new Cookie( "price" , price );
	Cookie restInfo = new Cookie( "rest" , rest );
	
	foodInfo.setMaxAge( 4200 );
	priceInfo.setMaxAge( 4200 );
	restInfo.setMaxAge( 4200 );
	
	response.addCookie( foodInfo );
	response.addCookie( priceInfo );
	response.addCookie( restInfo );

	response.sendRedirect( "cook_read.jsp" );
	
%>


<%

	// 쿠키의 종류
	//	- 세션 쿠키 : 세션처럼 정해진 기간없이 클라이언트가 연결을 끊으면 삭제된다.
	//	- 영구 쿠기 : 기간이 정해져있는 쿠키
	//	- 인증 쿠기 : 사용자 정보를 저장하고 있는 쿠키, 로그인유지 
	//	- 추적 쿠키 : 사용자가 브라우저에서하는 활동을 기록하는 쿠키
	//	- 좀비 쿠키 : 쿠키가 삭제된후에 다시 생성되는 쿠기



	// 웹 서버에서 쿠키 생성 
	//Cookie ck = new Cookie( "name" , "이순신" );
	// 생성된 쿠키는 세션 쿠키
	// 쿠키생성 -> 서버에 저장된 상태 -> 만들어진 쿠키를 클라이언트에게 보내야함
	
	//ck.setMaxAge( 3600 ); // 초단위 설정
	// 쿠키에 기간을 정해줌 입력한 시간이 지나면 쿠키가 삭제됨
	
	

	// 생성된 쿠키를 클라이언트에게 전송
	// 클라이언트의 요청이 있어야 클라이언트에게 전송 가능
	//response.addCookie( ck );
	// responese.addCookie( Cookie ck );를 통해 쿠키를 전송
	
	// 웹 서버에서 쿠키제거
	// 클라이언트 쿠키 가져오기
// 	Cookie[] cooks = request.getCookies(); // 쿠키를 request를 통해 받을때는 배열로 받아야한다
	
// 	for( Cookie c : cooks ){
// 		if( c.getName().equals("name") ){
// 			c.setMaxAge(0); 
// 			// 만료시간을 0초로 만들어 쿠키가 사라지게 만듬 
// 			response.addCookie(c); // 클라이언트에 전송
// 			break;
// 		}
// 	}
	
%>