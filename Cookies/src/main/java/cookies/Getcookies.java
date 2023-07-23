package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/get")
public class Getcookies extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie [] cookies=req.getCookies();
		
		for(Cookie cookie:cookies) {
			resp.getWriter().print("<h1>"+"name-->"+cookie.getName()+":value-->"+cookie.getValue()+"</h1>");
		}
	}
		
}
