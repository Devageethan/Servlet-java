package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Save extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		
		PrintWriter out =res.getWriter();
		
		String html="<html>"+"<body>"+"<h1>"+"my name is "+name+"</h1>"
		+"<h1>"+"my password is "+password+"</body>"+"</html>";
		
		out.print(html);
		
	}

}
