<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 스타일 적용 하려면 boardWrite.css 만들어서 작성 --%>
<form method="post" action="boardSave.jsp" enctype="multipart/form-data">
	<!-- enctype은 각 파일을 인코딩해주기 위해 사용 없으면 업로드 불가  -->
	<div id="writeBox">
		<div class="writeInput">
			<label>제목</label>
			<input type="text" name="title" id="title">
		</div>
		<div class="writeInput">
			<label>이미지</label>
			<input type="file" name="boardImg" id="boardImg" accept=".jpg, .png, .jpeg, .gif">
			<!-- accept 지정한 확장자를 갖는 파일만 보여줌 accept="image/* , video/*"  -->
			<!-- 다른 확장자의 파일도 선택됨 -> 원하는 확장자만 등록하려면 자바스크립트 사용 -->
		</div>
		<div class="writeInput">
			<label>내용</label>
			<textarea name="content" id="content"></textarea>
		</div>
		<button>작성</button>
	
	</div>
</form>