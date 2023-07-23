package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//resp.getWriter().print("<h1>servelet 2 called</h1>");
		
		HttpSession httpsession= req.getSession(false);
		
		if(httpsession!=null) {
			httpsession.invalidate();
			resp.getWriter().print("<h1>logout successfull</h1>");
		}else {
			resp.getWriter().print("<h1>invalid session</h1");
		}
	}
		
}
