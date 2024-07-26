<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.Member" %>

<%
	String path="http://localhost:8080/jsp_study1/study/";

%>


<div id="header">
	
	<div id="top">
		<% 
			Member user = (Member)session.getAttribute( "user" ); // user가 없으면 null
			if( user == null ){		
		%>
				<span class="topMenu"><a href="<%=path + "?part=signin"%>">로그인</a></span>
		<%
			}
			else{
		%>
				<span class="topMenu">
					<%=user.getUserName() %><a href="logout.jsp">로그아웃</a>
				</span>
		<% 
			}
		%>
		
		<span class="topMenu">고객센터</span>
		<span class="topMenu">사이트맵</span>
	</div>

	<div id="nav">
	
		<div class="logo">
		</div>
		
		<ul class="menuList">
			<li><a href="<%=path%>">HOME</a></li>
			<li><a href="<%=path+"?part=board"%>">게시판</a></li>
			<li><a href="<%=path%>">자료실</a></li>
			<li><a href="<%=path%>">공부방</a></li>
			<li><a href="<%=path + "?part=inquiry"%>">문의</a></li>		
		</ul>
		
	</div>

</div>