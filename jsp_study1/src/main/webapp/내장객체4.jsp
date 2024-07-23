<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// config - 서버의 구성정보를 가지고 있는 객체
	//		 서블릿의 구성정보
	//		 Servlet : 웹 어플리케이션( tomcat )의 구성요소중 하나
	//		 			동적인 페이지를 생성하고 관리하는 자바 class 
	out.println( "서블릿 이름 : " + config.getServletName() );
	out.println( "서블릿 파라미터 : " + config.getInitParameter( "id" ) );
	// web.xml파일에 <init-param></init-param>로 id와 value값을 생성하면 가져올 수 있다
	// config.getServletContext().
	// servlet에의해 작동ㅎ되는 모든 페이지의 정보를 담아두고 있다
	// pageContext가 servletCOntext의 하위 항목이라 할 수 있음
	
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