<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%--
	response - 	사용자 요청에 대한 응답을 위한 객체 
				사용자의 요청은 대부분 새 페이지이다
				response로 사용자가 원하는 페이지를 제공한다
				페이지 이동을 위한 method sendRedirect
				
				DB에 저장하고 다음 페이지로 이동해야 하는 경우

--%>

<%

	int num = 20;

	if( num > 20 ){

		response.sendRedirect( "requestTest2.jsp" );
		// response.sendRedirect( "주소" ); 주소로 강제이동 시킴
	}
	else{
		out.println( "20보다 작거나 같다" );
	}


%>

<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

</body>

</html>


<!-- 

project	DWCafe
class	table 매장내 테이블
	member 예약고객( 이름, 연락처)
	reservation 예약( 예약일시간,테이블번호, 음료선택, 고객번호(연락처), 결제)
	drink 음료(음료명, 금액)
	robot ( 음료를 담았다. 메서드, 음료를 배달완료했다 메서드)

과제 
인터넷을 통해 예약하며 음료 주문
예약시간에 반문시 입구에서 고객의 핸드폰을통해 자동 입장체크를하고
음료 제작이 시작된다. 음료가 다 만들어지면 로봇이 고객의 좌석위치로 배달해준다

 -->















