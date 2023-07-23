package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getatt")
public class Getattributes extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context= getServletContext();
		
		Object o=context.getAttribute("Mobile");
		Mobile mobile=(Mobile)o;
		resp.getWriter().print("<h1>"+mobile+"</h1>");
	}
			
}
