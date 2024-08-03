<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    


<%
	String path="http://localhost:8080/jsp_study1/study/";

%>

<!-- <div id="signinBox"> -->
	
<!-- 	<form method="post" action="signCheck.jsp"> -->
<!-- 		<span>아이디</span><input type="text" name="userId"> -->
<!-- 		<span>비밀번호</span><input type="password" name="userPassword"> -->
<!-- 		<button>로그인</button> -->
<!-- 	</form> -->
<%-- 	<div><a href="<%=path + "?part=findUser"%>">아이디/비밀번호 찾기</a></div> --%>
<%-- 	<div><a href="<%=path + "?part=signup"%>">회원가입</a></div> --%>

<!-- </div> -->


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
	
	<p><a href="index.jsp?part=findUser">아이디/비밀번호찾기</a></p>
	<p><a href="index.jsp?part=signup">회원가입</a></p>

</div>

<style>
	.error{
		color : red;
		font-size : 14px;
	}

</style>



<script>

	let bt = document.getElementById( "loginBt" );
	bt.addEventListener( "click" , function(){ //로그인 버튼의 클릭 이벤트 등록및 실행 함수정의
		let id = document.getElementById( "userId");
		let pw = document.getElementById( "userPassword" );
		
		if( id.value == '' ){ // 아이디 입력하지 않은 경우 
			document.getElementsByClassName( "error" )[0].innerText="아이디를 입력하세요";
		}
		else if( pw.value == '' ){ // 비밀번호 입력하지 않은 경우
			document.getElementsByClassName( "error" )[1].innerText="비밀번호를 입력하세요";
		}
		else{ // 아이디, 비밀번호 입력하였다면 로그인 처리페이지로 전송 및 이동
			document.getElementById( "signFm" ).submit();
			// 버튼의 타입을 바꿔서 submit을 직접 실행해줘야함
			
		}
	});


</script>



<%--
	아래 내용으로 로그인 페이지를 만드세요 스타일은 알아서 
	
	전송방식 : post
	전송 url : signCheck.jsp
	아이디 파라미터 : userId
	비밀번호 파라미터 : userPassword
	아이디/비밀번호찾기 url : findUser.jsp
	회원가입 url : signup.jsp 
	
	
--%>