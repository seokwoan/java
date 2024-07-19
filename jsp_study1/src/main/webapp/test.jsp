<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    import="test0719.Test1"
    %>
    
 <%	// 스크립틀릿 -> jsp파일에서 자바 언어 입력가능 '<%'는 method생성 불가
 	int num = 10;
 	String name = "이순신";
 	for( int i = 0 ; i < 5 ; i++ ){
 		System.out.println( num );
 	}
 	
 	Test1 test = new Test1( "김춘추" , 45 );
 	// Test1은 외부 class이므로 import해야한다
 	// import 위치는 <%@ 안에 작성해야 한다
 	
 	out.println( test.getName() );
 	out.println( test.getAge() );
 	// out은 jsp생성할때 만들어지는 9개의 내장객체중 하나이다 
 	// 브라우저에 출력하기 위한 객체
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1> <%=num %> <%=name %> </h1>

	

</body>
</html>