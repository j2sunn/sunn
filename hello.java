package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test1")
public class hello extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;
	   
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws IOException{
	      
	      response.setContentType("text/html");
	      
	      response.setCharacterEncoding("utf-8");
	      PrintWriter out = response.getWriter();
	      out.write("HelloWorld");
	      
	   }
}
