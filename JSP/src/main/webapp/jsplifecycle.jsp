<%@page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! public void jspInit(){
	System.out.println("hi i am init method" );
	}%>
	
	<%
	Date date=new Date();
	System.out.println("current time-"+date.toString());
	%>
	
	<%! public void jspDestory(){
		
		System.out.println("hi i am destroy method");
		}%>
	

</body>
</html>