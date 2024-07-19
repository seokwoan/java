<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 
	form태그 안의 button태그를 누르면 서버에 아이디와 비밀번호를 보내 요청함
	요청에의해 받은 데이터는 request.getParameter("input_name") form태그안의 input태그의 name
	 
	
--%>

<%
	String myId = request.getParameter("id");
	String myPw = request.getParameter("pw");
	
	out.println( myId );
	
	if( myId.equals("bc") && myPw.equals("123")){
		
%>

<%-- 중간에 꺽세를 넣어서 html영역을 만들어줄수있다
 	반복문의 중간에 꺽세를 넣어 태그를 만들면 반복문의 동작중에 태그를 계속 생성 
 --%>

	<script>
		alert( "로그인 성공" );
		location.href="login.jsp";
	</script>
 
<%		
		
	}

%>

<%=myPw %>
