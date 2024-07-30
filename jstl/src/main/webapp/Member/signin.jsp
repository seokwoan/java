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
		<form id="signFm" method="post" action="signCheck.jsp">
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
			<button type="button" id="loginBt">로그인</button>
			<!-- 버튼의 type을 button으로 바꿔주면 form태그의 submit 작동하게 못함
						타입을 바꾸지 않으면 버튼을 누르면 form태그의 submit실행 -->	
		
		</form>
		
		<p><a href="">아이디/비밀번호찾기</a></p>
		<p><a href="signup.do">회원가입</a></p>
	
	</div>


</body>


</html>

