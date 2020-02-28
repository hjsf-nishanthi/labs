package session_project;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession httpSession1 = request.getSession();
		System.out.println("session2 : " + httpSession1);
		long createTime = httpSession1.getCreationTime();
		System.out.println("session2 time created : " + createTime );
		httpSession1.removeAttribute("usernamekey");
		String username = (String) httpSession1.getAttribute("usernamekey");
		String language = (String) httpSession1.getAttribute("languagekey");
		response.getWriter().println(username + " prefers " + language);
	}
}
