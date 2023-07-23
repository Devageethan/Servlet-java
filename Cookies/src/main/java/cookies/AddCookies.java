package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cookies")
public class AddCookies extends HttpServlet{
	
		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie cookie1=new Cookie("name1","deva");
		cookie1.setMaxAge(60*60);
		Cookie cookie2=new Cookie("name2","naveen");
		cookie2.setMaxAge(60*60*24);
		Cookie cookie3=new Cookie("name3","sathish");
		Cookie cookie4=new Cookie("name4","hendry");
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie4);
		resp.addCookie(cookie3);
		resp.addCookie(cookie2);
		
		resp.getWriter().print("<h1>cookies added</h1>");
		}
}
