

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		try (PrintWriter out = response.getWriter()) {
		String name = request.getParameter("name");
		String voter_number = request.getParameter("voternumber");
		String address = request.getParameter("address");
		String dob = request.getParameter("dob");
		String contact = request.getParameter("number");
		String email = request.getParameter("email");
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
	
			PreparedStatement preparedStatement = con.prepareStatement("insert into nvoter(vn,name,pno,email,addr,dob)values('"+voter_number+"','"+name+"','"+contact+"','"+email+"','"+address+"','"+dob+"')");
			preparedStatement.executeUpdate();
			out.println("registration success");
		}catch(SQLException ex) {
			System.out.print(ex.getMessage());
		}
				
	}

}

