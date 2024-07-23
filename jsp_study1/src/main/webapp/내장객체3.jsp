<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    

<%
	out.print( "출력" );
	out.newLine();
	out.println( "정수, 실수, 문자, 문자열 출력가능" );
	
	// page == this -> page 자체를 의미하고 method가 적어 많이 사용되지 않는다
	String name = "이순신";
	
	pageContext.getRequest().getParameter( name );
	// pageContext는 모든 내장객체에 접근이 가능 내장객체를 사용하지 못하는 경우 사용 
	pageContext.setAttribute( "age" , 25 );
	// pageContext에 속성을 넣어줌 getAttributr( key )로 value값을 가져옴
	// pageContext.include(""); // <%@ include file="경로" 
	// include기능은 pageContext의 기능, 편하게쓰기위해 <%@로 사용
	// pageContext.include( "requestTest2.jsp" ); // <%@ include file="requestTest2.jsp"
	
	pageContext.forward( "내장객체1.jsp" ); // forward는 forward의 내용만 출력해줌
	// 주소는 변하지 않고 내용만 변함
%>

<%-- 
	jsp의 액션태그를 사용해서 include, forward 동작시킴
	액션태그는 include, forward한 페이지에 데이터를 전달해주는 기능도 있음
 --%>
<%-- 
<jsp:include page=""></jsp:include>
<jsp:forward page=""></jsp:forward>
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















