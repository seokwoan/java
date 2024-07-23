<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h2>객체 적용 범위 확인</h2>
request객체 -> name : <%=request.getAttribute( "name" ) %><br>
<%-- 새로운 페이지로 이동하면 request는 다른 객체가 만들어진다 --%>
session객체 -> age : <%=session.getAttribute( "age" ) %><br>
<%-- 브라우저를 시작하면 session객체가 만들어지고 브라우저를 완전히 닫으면 session객체가 사라짐 
	브라우저를 켠 클라이언트의 수 만큼 생성 
--%>
application객체 -> job : <%=application.getAttribute( "job" ) %>
<%-- 서버가 처음 시작할때 만들어지고 서버를 끄면 사라짐 객체가 서버에 하나만 존재, 모든 클라이언트--%>

