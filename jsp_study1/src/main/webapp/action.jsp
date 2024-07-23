<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- pageEncoding은 서버에서 보내는 데이터를 브라우저에 표시할때 사용 
서버에 데이터를 저장할때 사용되지 않음
사용자가 입력한 데이터를 서버에 저장할때는 
request.setCharacterEncoding("utf-8");을 적용해야 한글이 깨지지 않음 
페이지의 상단에 작성해줘야함 
--%>    

<% 
	request.setCharacterEncoding("utf-8");
%>
    
<%--
	액션태그
	서버나 클라이언트에게 동작을 명령하는 태그
	xml행식의 태드 사용방법
	자자빈의 기능 사용
	
	종류
	<jsp.forward /> 다른페에지로 이동( 주소변경없이 )
	<jsp.inclued /> 외부 페이지의 내용을 포함
	<jsp.plugin /> 웹 브라이저애서 자바 애플릿을 실행
	<jsp.useBean /> jsp페이지에자바빈즈를 설정 ( 자바 클래스 객체)
	<jsp.setPropery /> 자바빈즈의 프로터값이 설정됨( 클래스의 인스턴스 변수값 설정)
	<jps.getPtoperty />. 자바빈즈의 포로퍼티값 가져오기( 클래스의 인턴스 변수값 가져오기)
	<jps.param /> forward, lnclue의 인자추가( 메서드의 매개변수에 값 저장하는 것고 같음) 


 --%>    
 
 <%--
 	useBean
 		id : 클래스객체의 주소를 저장할 참조 변수
 		Music music = new Music();
 		class : 클래시의 경로( 패키지명 포함)
 		scope : 자바빈 객체가 저장될 영역을 설정 ( 내장객체중 하나)
 				page, request, session, application
 
 	setProperty - 자바빈 객체에 인스턴스 변수에 값 저장
 	music.setTitle( "비가 오는 날엔" );
 		name : 객체이름 ( 객체주소가 저장된 참조변수 )
 		property : 인스턴스변수 이름( set변수명 method 호출이 된다 )
 		value : 저장할 데이터
 
  --%>
 
 <jsp:useBean id="music" class="test0719.Music"  />
 <%-- useBean 액션을 사용하면 import, request, 객체생성을 안해도 알아서 다 해준다 --%>
 <jsp:setProperty name="music" property="*" />
 <%-- property는 setProperty의 Property자리에 들어가는 값 
 		property="title" -> setTitle method 실행
 		
 		input태그로 보낸 데이터를 자동으로 받기위해서는 value값을 지우고 
 		class의 변수 이름과 input태그의 name이 같아야 한다.
 		
 		property="*"로 설정하면 모든 input태그의 값을 가져와 변수에 저장한다
 		
 		
<jsp:setProperty name="music" property="title" value="" />
<jsp:setProperty name="music" property="singer" value="" />
<jsp:setProperty name="music" property="year" value="" />
 
--%> 

<jsp:getProperty name="music" property="title" />

 <% 
 	out.println( music.getSinger() );
 %>
 
 <%=music.getYear() %>
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>




