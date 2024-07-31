<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

	<div id="signinBox">
		<form id="signFm" method="post" action="signinCheck.do">
			<div class="loginInput">
				<b>아이디</b>
				<input type="text" name="userId" id="userId">
				<p class="error"></p>
			</div>
			<div class="loginInput">
				<b>비밀번호</b>
				<input type="password" name="userPassword" id="userPassword">
				<p class="error"></p>
			</div>
			<button id="loginBt">로그인</button>
		
		</form>
		
		<p><a href="">아이디/비밀번호찾기</a></p>
		<p><a href="signup.do">회원가입</a></p>
	
	</div>

</body>

</html>