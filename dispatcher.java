package ex1;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test2")
public class dispatcher extends HttpServlet{
   private static final long serialVersionUID = 1L;
   
   public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException{
      
      RequestDispatcher dispatcher = request.getRequestDispatcher("helloworld.jsp");
      
      dispatcher.forward(request, response);
      
   }

}