<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%! // JSP스크립트 - 선언문

	class Worker{
	
		String name;
		
		String job;
		
		Worker( String name , String job ){
			this.name = name;
			this.job = job;
		}
	
		@Override
		public String toString(){
			return name + " , " + job;
		}
	}

%>    
    
<%
	Worker[] worker = new Worker[]{
			new Worker( "이순신" , "군인" ) , new Worker( "김춘추" , "정치인" ) , 
			new Worker( "최무선" , "연구원" ) , new Worker( "정약용" , "발명가" )
	};

%>    
    
    
    
<!DOCTYPE html>


<html>



<head>



<meta charset="UTF-8">



<title>Insert title here</title>



</head>


<body>

	<h1>명단</h1>
	<%
		for( int i = 0 ; i < worker.length ; i++ ){
	%>		
		<div><%=worker[i] %></div>	
	<% 		
		}
	
	%>

<%-- 반복문을 사용하여 1부터 10까지 출력하세요 --%>

	<%
		
		for( int a = 1 ; a <= 10 ; a++ ){
			// out.println( "<div>" + i + "</div>" ); 
	%>
			<div><%=a %></div>	
	<%		
		}
	
	%>





</body>




</html>



















