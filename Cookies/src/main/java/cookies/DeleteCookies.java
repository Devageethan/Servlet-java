package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/delete")
public class DeleteCookies extends HttpServlet{
	
	
		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Cookie[] cookies= req.getCookies();
		
		for(Cookie cookie:cookies) {
			String name=cookie.getName();
			if(name.equals("name2")) {
				cookie.setMaxAge(0);
				resp.addCookie(cookie);
			}
		}
		}
}
