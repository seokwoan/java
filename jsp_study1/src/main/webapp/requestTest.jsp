<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Arrays" %>
    
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

	<%
		String name = request.getParameter( "myName" );
		String today = request.getParameter( "today" ); 
		// input tag의 값은 문자열로 전달됨 
		
		String[] 관심 = request.getParameterValues( "interest" );
		// 체크박스는 배열이므로 받아줄때 배열로 받는다
		String city = request.getParameter( "city" );
		
	%>
	
	<div> 이름 : <%=name %></div>
	<div> 날짜 : <%=today %></div>
	<div> 관심분야 : <%=Arrays.toString( 관심 ) %></div>
	<div> 지역 : <%=city %></div>

</body>

</html>