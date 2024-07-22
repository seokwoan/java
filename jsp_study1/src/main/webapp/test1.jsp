<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList , java.util.LinkedList" 
    errorPage="error500.jsp" buffer="1kb" autoFlush="false" %>
    
    
<%
	// includ 동작전
	String name = "이순신";
	out.println( name );
	// include가 동작하기 전이라 menu.jsp의 위에서 출력

%> 
 
    
<%@ include file="menu.jsp" %>    
    
<%

	out.println( "테스트" );
	// int num = 10/0; 

%>    
    
<%-- 

	<%@ - JSP 지시어 스크립트 작성부분 
		지시어는 해당 JSP페이지의 설정을 하기 위한 부분
			page	- JSP페이지의 속성을 지정하는 역할
					  language : 페이지 사용할 언어셋 설정 
					  contentType : 페이지의 문서 타입 지정
					  pageEncoding : 현재페이지의 인코딩 타입 지정
					  import : 다른 패캐지의 class나 method를 추가 
						  import="java.util.ArrayList , java.util.LinkedList "
						  ,로 구분해서 사용 or 
						  <%@ page import=""
						  지시어를 사용해 여러개 사용해 각 각의 import를 만들어도 된다
					  session : 세션 사용여부를 지정 기본설정 true 사용하지 않으려면 session="false"
					  	같은 브라우저간에 로그인유지 다른 브라우저는 불가
					  info : 페이지의 설명
					  extends : 현재페이지에 상속받을 class지정
					  buffer : jsp페이지의 출력버퍼값 지정(기본 8kb)
					  autoFlush : 출력버퍼가 초과되면 수행할 기능지정
					  			  true일경우 버퍼가 100%면 내용을 화면에 출력
					  			  false일경우 IOException 발생 -> 서버로그에 기록됨
					  			  예외처리에서 throw를 하는 이유와 같이 기록(log)를 남겨두기 위해
					  			  false로 사용하기도 한다
					  
					  
					  에러가 있을때 서버언어가 노출되지 않게 하는 방법
					  
						1. isError
						  isErrorPage : 기본설정 false -> true일 경우 현재 페이지를 에러페이지로 지정
						  				에러가 있을때 보여줄 페이지에 작성
						  				
						  errorPage : 현재페이지에 에러 발생시 사용될 페이지지정
						  			  클라이언트 브라우저에는 서버언어(JAVA)가 노출되면 안된다
						  			  errorPage="보여줄 페이지" -> 에러가 있으면 isErrorPage가 true인
						  			  페이지를 보여줌
						  <isErrorPage , errorPage는 작업을 완료하고 마지막에 작성>
						  페이지별로 작성해줘야해서 페이지가 많으면 작업량이 늘어남
						 
						
					  			  
					  
			include	- 다른 JSP페이지를 추가하기( 현재페이지에 내용을 포함)
				<%@ include file="menu.jsp"  -> menu.jsp파일을 test1.jsp파일이 가지고 있음
				include되는 파일은 자바로 작성된 코드가 전부 실행되고 
				HTML, CSS, JS 코드가 include가 작성된 위치에 삽입됨
			
			
			
			taglib	- 태그라이브러리 태그를 사용할 경우에 사용 
	



	JSP주석
		- 사용자 브라우저에서는 확인 되지 않는다
		- 서버 컴퓨터에서만 동작하는 부분이기 때문에 사용자에게 노출되지 않는다
		
	웹 흐름
		서버컴퓨터란 - 서비스를 제공하는 컴퓨터이다
		클라이언트가 주소에 의한 요청을 하면 서버컴퓨터는 요청에 대한 응답을 한다
		페이지를 보기위해 해당페이지에 대한 주소를 요청하면 서버는 해당 페이지를 찾아서
		페이지 내부의 서버언어(JAVA)를 실행시키고 클라이언트언어(HTML, CSS, JS) 부분을
		클라이언트에게 전송한다
		클라이언트는 서버로부터 받은 내용을 브라우저가 실행하여 화면에 출력한다
	
		
 --%>
    
    
    
<!DOCTYPE html>


<html>


<head>

<meta charset="UTF-8">


<title>Insert title here</title>


</head>

<body>

</body>

</html>