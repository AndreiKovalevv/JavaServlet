

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;        
	        
	        protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	                throws ServletException, IOException {
	              
	        	response.setContentType("text/html;charset=windows-1251");
	    		
	            PrintWriter writer = response.getWriter();
	     
	            String name = request.getParameter("username");
	            String age = request.getParameter("userage");  
	                writer.println("<p>Name: " + name + "</p>");
	                writer.println("<p>Age: " + age + "</p>");	              
	         
	}

}
