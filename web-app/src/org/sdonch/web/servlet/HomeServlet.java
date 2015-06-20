package org.sdonch.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HomeServlet extends HttpServlet {
 
	// TODO BTW why is this needed? Can we get by without it?
	private static final long serialVersionUID = 4234153507302952345L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException{
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hey, what are you up to?</h1>");
		out.println("</body>");
		out.println("</html>");	
	}
}