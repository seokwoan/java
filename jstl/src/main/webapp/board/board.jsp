<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>

	<div id="boardWrap">
		<h2>게시판</h2>
		<div id="boardBox">
			<div id="boardListBox">
				<table id="boardList">
					<tr>
						<th class="num">번호</th>
						<th class="title">제목</th>
						<th class="writer">작성자</th>
						<th class="hit">조회수</th>
					</tr>
					<c:forEach var="row" items="${list }">
						<tr>
							<td class="num">${row.board_id }</td>
							<!-- el표기에서 .변수이름 - 변수이름을 가진 getmethod실행 -->
							<td class="title">
								<a href="/boardView.do?id=${row.board_id }">${row.title }</a>
							</td>
							<td class="writer">${row.writer }</td>
							<td class="hit">${row.hit }</td>
						</tr>
					</c:forEach>	
				</table>
				
				<style>
					#pageNumList{
						list-style : none;
						padding : 30px 0;
						margin : 0;
						display : flex;
						justify-content : center;
					}
					
					#pageNumList li{
						width : 50px;
						text-align : center;
					}
					
					#pageNumList .nowPage{
						background : #ccc;
						font-weight : 800;
					}
					
				
				</style>
				
				<!-- 페이징 -->
				<div id="pageNumbers">
					<ul id="pageNumList">
						<a href="/board.do?page=${(pageNum - 1 ) == 0 ? 1 : pageNum - 1 }${param.word == null ? '' : '&word='}${param.word}"><i class="bi bi-caret-left-fill"></i></a>
						<!-- <a href="/board.do?page=${pageNum - skip < 1 ? 1 : pageNum - skip }"> 
								5개의 숫자만 나와 5개씩 넘겨주는 방식 -->
						<c:forEach var="i" begin="${startPage }" end="${endPage }" step="1">
						 	<c:if test="${pageNum == i }">
						 		<li class="nowPage">${i }</li>
						 	</c:if>
						 	<c:if test="${pageNum != i }">
							<li><a href="/board.do?page=${i}${param.word == null ? '' : '&word='}${param.word}">${i }</a></li>
							</c:if>
						</c:forEach>
						<c:if test="${pageNum < endPage }">
							<a href="/board.do?page=${pageNum+1 }${param.word == null ? '' : '&word='}${param.word}">
						</c:if>
						<i class="bi bi-caret-right-fill"></i>	
						<c:if test="${pageNum < endPage }">
							</a>
						</c:if>	
					</ul>
				</div>
				
			</div>
			<div id="boardSearchBox">
				<form method="get" action="/board.do">
					<div class="boardSearch">
						<input type="search" name="word" id="word">
						<button>검색</button>
						<!-- 검색을 만들때 페이징도 같이 만들어줘야 한다 -->
					</div>
				</form>
			</div>
			<div id="boardWriteBox">
				<a  id="wrBt">글작성</a>
			</div>
		</div>
	</div>

	<script>
		
		$("#wrBt").on("click",function(){ 
			if( '${ sessionScope.user }' != '' ){  
				location.href="write.do"; 
			}else{
				var isOk = confirm( "글 작성 권한이 없습니다. 로그인 하시겠습니까?" );
				if( isOk ){ // 로그인 페이지로 넘겨줌 
					location.href="signin.do";
				}
			}
		});
		
	</script>

</body>
</html>