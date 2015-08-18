package day15;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployee
 */
@WebServlet("/AddEmployee")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter pw=response.getWriter();
		pw.println("Hello");
		int empcode=Integer.parseInt(request.getParameter("empCode"));
		String empname=request.getParameter("empName");
		double salary=Double.parseDouble(request.getParameter("salary"));
		Employee emp=new Employee();
		emp.setEmpCode(empcode);
		emp.setEmpName(empname);
		emp.setSalary(salary);
		EmployeeDAOImpl dao=new EmployeeDAOImpl();
		dao.addEmployee(emp);
		pw.println("records inserted");
		
	}

}
