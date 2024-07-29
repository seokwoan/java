<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- prefix는 태그립의 별명, 변수명 같은 느낌 core태그를 사용할때 일반적으로 c로 사용 
	코어태그로 변수, 조건문, 반복문, 이프문 작성 가능
--%>

<%-- core태그 변수만드는법  --%>
<c:set var="num" value="10" />

<%-- el 출력--%>
${num + 20}
<%-- el출력은 표현식을 보고 타입을 바꿔줌? --%>
<c:set var="num" value="300" scope="session"/>
<%-- scope를 통해 범위를 정해줄수 있음 ${num}으로 페이지의 num, sessionScope.num이면 session의 num --%>
${sessionScope.num}

<%--
	core태그 조건문 
	prefix:if test="" 사용 조건은 참의 경우만 가능
	종료 태그를 따로 빼줘애 한다
	조건식은 el로 사용해야 한다
--%>

<c:if test="${30>20 }">
	30 > 20 참이다 
</c:if>

<%-- 
	core의 if문도 참의 경우만 사용가능
	switch처럼 여러개의 조건을 넣어줄 수 있음
	하향식 진행하고 먼저 참이 된 값이 나오면 멈춤
 --%>
 
<c:choose>
	<c:when test="${num>5 }">
		<h1>5보다 크다</h1>
	</c:when>
	<c:when test="${100>10 }">
		10보다 크다
	</c:when>
	
	<c:otherwise>
		나는 위에 모든 when이 거짓일 경우 실행된다
	</c:otherwise>
</c:choose>

<%--
	core태그의 반복문 
--%>

<c:forEach begin="1" end="10" step="1" >
	내가 반복 된다
</c:forEach>

<%
	ArrayList<String> list = new ArrayList<>();
	list.add( "강감찬" );
	list.add( "이순신" );
	list.add( "징보고" );
	
	request.setAttribute( "list" , list );
%>

<%-- 
	var="변수이름(출력에 사용할 변수)" items="${배열 또는 컬렉션 이름}" 
	내장객체에 저장해야 사용가능, 오브젝트 클래스의 배열로 모든 타입 사용가능 
	
--%>
<c:forEach var="name" items="${ list }">
	${name}
</c:forEach>

<%-- 
	fortokens 문자열 데이터만 사용가능( String ) 
	items="${문자}" var="변수명" delims="문자열"
	delims는 split과 비슷한 역할을 한다
--%>
<c:forTokens items="${'포도@딸기@수박@참외@토마토' }" var="fruit" delims="@">
	${fruit}
</c:forTokens>

<%--
	웹모델1 : 사용자 요청 -> 서버 -> 컨테이너 -> 서블릿 -> 페이지처리 -> 컨테이너 -> 서버 -> 사용자
	웹모델1은 서블릿이 하나만 존재 
	
	웹모델2 ( MVC 디자인패턴) 
		: 사용자 요청 -> 서버 -> 컨테이너 -> 요청에 맞는 서블릿 -> 서비스 -> (데이터 베이스가 필요하면 DAO,DTO)
			-> 서블릿 -> 컨테이너 -> 서버 -> 사용자
	웹모델2는 서블릿이 여러개 존재
	
	MVC : Model View Controllor
	Model : service, DAO, DTO
	View : html, jsp 페이지( 사용자 브라우저에 표시되는 부분)
	Controllor : 사용자의 요청을 어떻게 처리할지 결정(서블릿)
	service는 여러개 존재
	
	DAO : Data Access Object 데이터베이스에 접근하기 위한 클래스
	DTO : Data Transfer Object 데이터 저장 클래스 
	
	예) 회원가입을 위해 아이디, 비번, 이름, 주소, 연락처 등을 입력하고 가입 버튼을 클릭
	
	1. 가입요청을 Controller가 받는다
	2. 가입요청을 처리해줄 service 실행
	3. service에서 데이터베이스에 저장하기 위해 DAO를 실행
	4. DAO 실행이 끝나면 가입 완료 페이지를 Controller에게 전달
	5. Controller는 가입 완료페이지를 사용자에게 보낸다
	
	사용자가 로그인을 한다. 아이디 비번입력하고 로그인 버튼 출력
	
	1. 로그인 요청을 Controller가 받는다
	2. 로그인 처리해줄 service 실행 
	3. service에서 데이터베이스 작업을 수행하는 DAO실행
	4. DAO실행 결과 아이디ㅣ 비밀번호 일치하면 service에서 세션생성 일치 하지 않으면 로그인 실패
	5. Controller는 로그인 성공 유무에 따른 service의 결과를 사용자에게 보낸다

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



















