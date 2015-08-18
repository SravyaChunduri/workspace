package day15;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewEmployees
 */
@WebServlet("/ViewEmployees")
public class ViewEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewEmployees() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDAO dao=new EmployeeDAOImpl();
		List<Employee> employees=dao.getEmployees();
		request.setAttribute("empls",employees);
		RequestDispatcher rd=request.getRequestDispatcher("ViewEmployees.jsp");
		rd.forward(request,response);
		
		
		
		
		
	}

	
}
