<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int firstnum=Integer.parseInt(request.getParameter("firstname"));
	int secondnum=Integer.parseInt(request.getParameter("secondname"));
	
	int result=firstnum+secondnum;
	
%>
<%= "result->"+result %>
</body>
</html>