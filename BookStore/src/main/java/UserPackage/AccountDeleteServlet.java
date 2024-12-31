package UserPackage;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AccountDeleteServlet")
public class AccountDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		boolean isTrue;
		
		isTrue = UserController.deletedata(id);
		if(isTrue == true) {
			String alertMessage = "Account Delete Successfully";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='login.jsp'</script>");
			
		}
		else {
			List<UserModel> userdetails =UserController.getByID(id);
			request.setAttribute("userdetails", userdetails);
			
			RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			dis2.forward(request, response);
		}
	}

}