<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>

<html>

<head>

<meta charset="UTF-8">

<title>Insert title here</title>

</head>

<body>

	<form method="post" action="cook.jsp">
		<input type="text" name="food" placeholder="점심메뉴"><br>
		<input type="text" name="price" placeholder="가격"><br>
		<input type="text" name="rest" placeholder="식당명"><br>
		<button>등록</button>	
	</form>
	
	<hr>
	
	<h3>점심메뉴 선택</h3>
	<ol>
	<%
		Cookie[] cooks = request.getCookies();
		String food="" , price="" , rest="";
		for( Cookie cook : cooks ){
			if( cook.getName().equals( "food" ) ) food = cook.getValue();
			if( cook.getName().equals( "price" ) ) price = cook.getValue();
			if( cook.getName().equals( "rest" ) ) rest = cook.getValue();
		}
		
		String[] foodList = food.split( "-" );
		String[] priceList = price.split( "-" );
		String[] restList = rest.split( "-" );
		
		for( int i = 0 ; i < priceList.length ; i++ ){		

	%>
		<li> <b><%=foodList[i] %>, <%=priceList[i] %>, <%=restList[i] %></b> <button class="selBt">선택</button></li>
	<%
		}	
	%>	
	
	</ol>



</body>

</html>


<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>

<style>
	.select{ color : red; }

</style>


<script>
	// 선택버튼 클릭한 메뉴의 텍스트 색상을 빨간색으로 표시
	// 다른 메뉴는 텍스트 색상이 검정색
	$(".selBt").on( "click" , function(){	
// 		$("b").removeClass( "select" );
// 		$(this).prev().addClass( "select" );
		
		$(".selBt").each( function(i){
			$(this).prev().removeClass( "select" );
		});
		$(this).prev().addClass( "select" );
		
	});

</script>