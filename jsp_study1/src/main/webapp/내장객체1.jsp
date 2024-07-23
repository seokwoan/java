<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- 
	JSP 페이지를 생성하고 서버에의해서 페이지가 동작할떄 서버에서 페이지에게
	객체를 할당해준다
	
	내장객체느느 9가지다
		서버 - application : 처음 서버가 시작할때 생성되는 객체 ( 서버 단위로 동작 하나만 존재 ) 
		연결 - session : 사용자가 서버에 처음 요청할때 생성되고 사용자가 브라우저를 종료하기 
						전까지는 살아있는 객체
		페이지 -	페이지가 생성될때마다 생성되는 객체 -> servlet이 생성
			request : 사용자의 요청내용을 저장하는 객체
			response : 요청에 대란 응답 정보를 저장하는 객체
			out : 출력객체
			page : JSP페이지 자체를 나타낸다
			config : JSP페이지의 설정 정보를 저장하는 객체
			exception : JSP페이지의 예외발생을 처리하는 객체
			pageCotext : JSP페이지의 정보를 저장 session, request, response를 쓰지 못하는 경우 사용

 --%>    
    
    
<!DOCTYPE html>


<html>


<head>



<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		String localAddr = request.getLocalAddr();
		out.println( localAddr );
		
		String serverAddp = request.getRemoteAddr();
		
			//out.printLn ( request.getRequest() );
			
			out.println( request.getLocalAddr());
			
			out.println( request.getMethod() );
			
			out.println( request.getRequestURI() ); 
			
			out.println( request.getRequestURL() );
							
		
	
		
	%>

	<%--
		input태그에 입력한 내용에 대한 처리를 requestTest.jsp 주소로 요청
	
	 --%>
	<form method="get" action="requestTest.jsp">
		<input type="text" name="myName"><br>
		<input type="date" name="today"><br>
		
		<input type="checkbox" name="interest" value="게임">게임
		<input type="checkbox" name="interest" value="영화">영화
		<input type="checkbox" name="interest" value="자동차">자동차
		<input type="checkbox" name="interest" value="웹툰">웹툰
		<%-- 체크박스는 같은 이름에 여러개의 데이터가 저장된 배열 --%>
		
		<br>
		
		<select name="city">
			<option value="대전">대전</option>
			<option value="서울">서울</option>
			<option value="광주">광주</option>
			<option value="부산">부산</option>
		</select>
		<button> 전송 </button>
	</form>

</body>



</html>