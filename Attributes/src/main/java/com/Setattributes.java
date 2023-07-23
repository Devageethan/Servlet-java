package com;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/setatt")
public class Setattributes extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Mobile mobile = new Mobile("Redmi",30000,"6GB","Yellow");
		
		ServletContext context=getServletContext();
		
		context.setAttribute("Mobile",mobile );
		resp.getWriter().print("<h1>Mobile Object is Transfreed</h1>");
	}
			
}
