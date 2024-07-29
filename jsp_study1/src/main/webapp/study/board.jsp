<%@page import="java.util.ArrayList"%>
<%@ page import="study.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="study.*"%>

<%--  board.jsp --%>

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
				<%
				
					DBconnect db = new DBconnect();
					
					String sql = "select * from board order by board_id desc";
				
					ArrayList<Board> boardList = new ArrayList<>();
					
					try{
						db.pt = db.conn.prepareStatement( sql );
						db.rs = db.pt.executeQuery();
						while( db.rs.next() ){
							boardList.add(
								new Board( db.rs.getInt(1) , db.rs.getString(2) , db.rs.getString("Writer") , db.rs.getString(4) , db.rs.getInt(5) )
							);
						}
						
					}
					catch( Exception e ){
						e.printStackTrace();
						System.out.println( "board 테이블 조회 실패" );
					}
				
					for( Board br : boardList ){
				%>
				<tr>
					<td class="num"><%=br.getBoard_id() %></td>
					<td class="title">
						<a href="?part=view&id=<%=br.getBoard_id() %>"><%=br.getTitle() %></a>
					</td>
					<td class="writer"><%=br.getWriter() %></td>
					<td class="hit"><%=br.getHit() %></td>
				</tr>
				<% } %>
				
			</table>
		</div>
		<div id="boardSearchBox">
			<form method="get" action="?part=board">
				<div class="boardSearch">
					<input type="search" name="word" id="word">
					<button>검색</button>
				</div>
			</form>
		</div>
		<div id="boardWriteBox">
			<a  id="wrBt">글작성</a>
		</div>
	</div>
</div>

<%
	int level = 0;
	if( session.getAttribute("user") !=null ){
		level = ( (study.Member)session.getAttribute("user") ).getLevel();
	}

%>

<script>
	// 글작성을 클릭할때 로그인 회원중에 권한이 있는 사람만 작성 가능 
	let lv = '<%=level%>';
	$("#wrBt").on("click",function(){ //글작성을 클릭하면
		if( lv== 3){  
			location.href="?part=boardWrite"; // 권한이 3이면 글작성이동
		}else{
			alert("글 작성 권한이 없습니다.");
		}
	});
	
</script>