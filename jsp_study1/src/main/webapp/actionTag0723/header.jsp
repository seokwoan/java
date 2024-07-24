<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String select = request.getParameter( "select" );
%>
<%=select %>

<div id="header">
	<ul id="menuList">
		<li class="menu"><a href="mainPage.jsp">HOME</a></li>
		<li class="menu">소개</li>
		<li class="menu">자유게시판</li>
		<li class="menu <%=select.equals("imageBoard") ? "active" : "" %>"><a href="mainPage.jsp?part=imageBoard">이미지게시판</a></li>
		<!-- mainPage.jsp?part=img 라고 파라미터를 직접 만들어줌 
			mainpPage를 유지하고 파라미터를 직접 만들고 파라미터의 값에 따라 
			include를 해주는 제어문을 만들어줌
		-->
		<li class="menu"><a href="mainPage.jsp?part=notify">신고</a></li>
	</ul>

</div>    