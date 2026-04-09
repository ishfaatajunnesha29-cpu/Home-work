import java.io.*;
import jakarta.servlet.*;       
import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>User Details</title></head><body>");
        out.println("<h2>Basic Information</h2>");
        out.println("<hr>");
        out.println("<p><b>Name:</b> Tajunnesha</p>");
        out.println("<p><b>Contact:</b> 9345404469</p>");
        out.println("<p><b>Email:</b> taju@gmail.com</p>");
        out.println("</body></html>");
	}
}