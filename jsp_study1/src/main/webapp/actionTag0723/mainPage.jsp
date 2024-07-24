<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	String part = request.getParameter( "part" ); 
	if( part != null ){ // null일때는 method사용불가 part가 null이라 .equals 사용하면 NullPointerException
		if( part.equals("notify") && session.getAttribute("user") == null ){ // 신고메뉴를 클릭했는데 로그인하지 않은상태
%>
			<jsp:forward page="login.jsp" />
			<!-- forward는 주소는 변하지않고 내용만 바뀜 -->
<%			
		}
	}
%>  
    
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

<link rel="stylesheet" href="main.css">

</head>

<body>
	<div id="loginBox">
		<a href="login.jsp">로그인</a>
	</div>

	<h2>내가 main이야!!!</h2>
	<!-- 메뉴 표시 header.jsp-->
	
	<!-- 파라미터 값을 전달하지 않을때는 />로 종료태그를 작성한다 </jsp 종료태그로 종료될때 
	 파라미터 값이 없다면 오류 -->
	<jsp:include page="header.jsp" >
	 	<jsp:param value="<%=part %>" name="select" />
	 </jsp:include>	
	<!-- 파라미터 이름이 select 값이 part 넘겨줌 -->
	<!-- 액션태그 안에는 주석들어가면 안됨 -->
	
	
	<div id="main">
		<%
			if( part == null){
		%>
		첫페이지 내용
		<%
			}else{ 
				part += ".jsp";	
		%>
				<jsp:include page="<%=part %>" />
		<%		
			}
		%>
	
	</div>
	
	
	<!-- footer.jsp 표시 -->
	<jsp:include page="footer.jsp" />
	
</body>

</html>






