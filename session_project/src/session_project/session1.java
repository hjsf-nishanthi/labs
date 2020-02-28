package session_project;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/session1")

public class session1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String language = request.getParameter("language");
		HttpSession httpSession = request.getSession();
		httpSession.setMaxInactiveInterval(10);
		System.out.println("session1 : " + httpSession);
	    long createTime = httpSession.getCreationTime();
		System.out.println("session1 time created : " + createTime );
		httpSession.setAttribute("usernamekey", username);
		httpSession.setAttribute("languagekey", language);

}
}