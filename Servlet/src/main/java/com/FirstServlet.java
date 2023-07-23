package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		Date d=new Date();
		String s=d.toString();
		
	PrintWriter p=res.getWriter();
		
	
	String html="<html>"+"<body>"+"<h2>"+s+"</h2>"+"</body>"+"</html>";
	
	p.print(html);

	}

}
