package com.Hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	//public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see Servlet#destroy()
	 */
	//public void destroy() {
		// TODO Auto-generated method stub
	//}
	
	ServletContext sc;
	RequestDispatcher rd;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		sc=request.getServletContext();
	 rd=sc.getRequestDispatcher("/second");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("val");
		if(name.equals("verizon"))
		{
			pw.println("successful:");
		rd.forward(request,response);
		}
		else
		{
			pw.println("sorrryyyy!!!!");
		}

		//pw.println(sc.getInitParameter("para1"));
		
		
	}

}
