

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class Contactus
 */
public class Contactus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contactus() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        DatabaseManager db = new DatabaseManager();
		java.sql.Connection  con = db.getConnection();
		String name=request.getParameter("name");
	    String pnumber=request.getParameter("number");
	    String email=request.getParameter("email");
	    String comment=request.getParameter("comment");
	    
	    try {
	    	PreparedStatement preparedStatement = con.prepareStatement("insert into contact(name,pnumber,email,cmnt)values('"+name+"','"+pnumber+"','"+email+"','"+comment+"')");
			preparedStatement.executeUpdate();
			response.sendRedirect("index.jsp");
	    } catch (Exception e) {
			e.printStackTrace();
		}
	}

}
