<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	request.setCharacterEncoding("utf-8");
%>


<jsp:useBean id="lunch" class="test0719.Lunch" />
<%-- <jsp:setProperty name="lunch" property="*" /> --%>


<jsp:setProperty name="lunch" property="restaurant" />
<jsp:setProperty name="lunch" property="menu" />
<jsp:setProperty name="lunch" property="price" />


<%=lunch.getRestaurant() %><br>

<jsp:getProperty name="lunch" property="menu" /><br>

<%
	out.println( lunch.getPrice() );
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>