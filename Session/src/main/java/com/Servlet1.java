package com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession hs=req.getSession(false);
		
		if(hs!=null) {
			resp.getWriter().print("<h1>Servlet 1 called</h1>");
		}else {
			resp.getWriter().print("<h1>invalid session</h1>");
		}
	}
		
}
