<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Enumeration" %>

<%
	// 세션	- 웹서버에서 생성하고 서버에 저장하고 복사하여 클라이언트에게 전달
	//		- 클라이언트와 서버의 연결 유지를 위하여 사용된다
	//		- tomcat에서 클라이언트가 최초 요청할때 session객체 생성

	// 세션 값 생성
	session.setAttribute( "testUser" , "12389" );
	// 이미 내장되어 있어 new연산자를 통해 만들 필요없다
	
	// 현재 접속한 클라이언트의 세션 값 가져오기
	
	// Itorator 컬렉션에서 데이터를 순차적으로 가져오기 위한 인터페이스
	Enumeration attr = session.getAttributeNames();



%>




























