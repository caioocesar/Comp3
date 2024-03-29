

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFinalizarRegistroUsuario
 */
@WebServlet("/RegistrarUsuario")
public class ServletrRegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletrRegistrarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    	    throws ServletException, IOException {
    	        doPost(request, response);
    	    }
    	 
    	    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    	    throws ServletException, IOException {
    	    
    	    String nome = request.getParameter("usuario");
    	    String senha = request.getParameter("senha");
    	    String cpf = request.getParameter("cpf");
    	    ControlRegistrarUsuario ctrl = new ControlRegistrarUsuario();
    	    
    	    try {
				boolean result = ctrl.registrar(nome, cpf, senha);
				
				if(result == true)
				{
					response.sendRedirect("home.jsp?message=" + URLEncoder.encode(nome, "UTF-8"));
				}
				else
				{
					String message = "Cadastro j� existe!";
    	        	response.sendRedirect("RegistrarUsuarioPag.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				String message = "Falha no cadastro!";
	        	response.sendRedirect("RegistrarUsuarioPag.jsp?message=" + URLEncoder.encode(message, "UTF-8"));
				e.printStackTrace();
			}
    	    	

        	
    	    	
    	        
    	    }

}
