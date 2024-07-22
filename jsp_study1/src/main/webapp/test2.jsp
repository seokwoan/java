<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Scanner" %>
    
    
<%--
	JSP 스크립트
		- JSP 스크립틀릿 : <% %>
			자바 로직 코드를 작성 ( 일반적인 코드 작성)
			 
		- 선언문 : <%! %>
			자바 변수나 method, class 정의할때
			 
		- 표현식 : <%= %>
			결과값 출력

 --%>    
    
<%! 
	int age = 20; // 변수 선언
	String name = "이순신"; // 변수 선언
	
	int sum( int a , int b ){ // method 정의
		return a+b;
	}
	
	class Mem{ // class 정의
		String userName;
	}
	
	
	// if( age > 15 ){} if, for문 같은 제어문 사용불가
	// sum( 10 , 20 ); method 호출 불가
	
	// Scanner sc = new Scanner(System.in);
	// Scanner는 console에서 입력받기위한 방법
	// 웹페이지에서 입력받기 위한 방법이 아님
	
%>    

<%
	//스크립틀릿
	
	// int age1 = sc.nextInt();
	
	sum(10,20); // method 호출 가능
	if( age > 15 ){
		// 제어문 사용 가능 
	}
	
	String job = "군인"; // 변수 선언 가능
	
	//void print(){ // method 정의 불가
	//	out.println( 출력출력 );
	//}

%>    

<%=100 %>
<%="<br> 이순신" %>
<%=10>5 ? "크다" : "작다" %> <%-- 조건식사용가능 --%>
<%=sum(10,20) %> <%-- method호출 가능 --%>
    
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

</body>

</html>