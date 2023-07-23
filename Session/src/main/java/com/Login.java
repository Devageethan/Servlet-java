package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				String email= req.getParameter("email");
				String password= req.getParameter("password");
				
				if(email.equals("deva@gmail.com")&& password.equals("1234")) {
					HttpSession session=req.getSession();
					
					session.setAttribute("email", email);
					
					String html="<!DOCTYPE html>"
							+"<html>"
							+"<head>"
							+"<meta charset=\"UTF-8\">"
							+"<title>Insert title here</title>"
							+"</head>"
							+"<body>"
							+"  <a href=\"servlet1\">Servlet1</a>"
							+" <a href=\"servlet2\">Servlet2</a>"
							+"</body>"
							+"</html>";
					
					resp.getWriter().print(html);
				}
			}
		
}
