
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    	    throws ServletException, IOException {
    	        doPost(request, response);
    	    }
    	 
    	    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    	    throws ServletException, IOException {
    	    	
    	        String cpf = request.getParameter("cpf");
    	        String senha = request.getParameter("senha");
    	         

    			Main teste = new Main();
    			String a;
				try {
					a = teste.conectar2(cpf, senha);
					String message = a;
	    	        if(!(a.equals("Senha errada!")) && !(a.equals("Usuário não encontrado!"))){
	    	        	response.sendRedirect("home.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
	    	        }
	    	        else{
	    	        	response.sendRedirect("login.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
	    	            //response.sendRedirect("login.jsp");
	    	        }
					
	    	    }
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    	        
    	        
    	    }
}
