package primerPrevioJSTL.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.clienteDao;
import primerPrevioJPA.entities.Cliente;
import primerPrevioJPA.entities.Tienda;

/**
 * Servlet implementation class loginUser
 */
@WebServlet("/loginUser")
public class loginUserControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginUserControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
        String record = request.getParameter("record");
        
        Cliente c = new Cliente();
        clienteDao cdao = new clienteDao();
        
        
        Cliente aux = cdao.findByFieldObject(Cliente.class, "email", email);
        
        if(aux==null) {
        	PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");

            out.println("<html>");

            out.println("<head>");

            out.println("<title>Servlet ListNews</title>");

            out.println("</head>");

            out.println("<body>");
            
            out.println("<h4>   Cliente no existe  </h4>");
            
            out.println("</body>");
    	
        }else {
        	
        	 request.getRequestDispatcher("/servicios.jsp").forward(request, response);
        	
        }
	}

}
