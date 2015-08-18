package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public void getDBConnection()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","TIGER");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void closeDBConnection()
	{
		try
		{
			conn.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void addEmployee(Employee employee)
	{
		getDBConnection();
		String query="insert into employee values(?,?,?)";
		try
		{
			pst=conn.prepareStatement(query);
			pst.setInt(1,employee.getEmpcode());
			pst.setString(2,employee.getEmpname());
			pst.setDouble(3, employee.getSalary());
			pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
	}
	
	public List<Employee> getEmployees()
	{
		getDBConnection();
		Employee emp;
		List<Employee> empls=new ArrayList<Employee>();
		try
		{
			pst=conn.prepareStatement("Select * from employee");
			rs=pst.executeQuery();
			while(rs.next())
			{
				emp=new Employee();
				emp.setEmpcode(rs.getInt("empcode"));
				emp.setEmpname(rs.getString("enpname"));
				emp.setSalary(rs.getInt("salary"));
				empls.add(emp);
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			closeDBConnection();
		}
		
		
		return empls;
	}
	/*public void updateEmployee(int code,double salary)
	{
			getDBConnection();
			
			String query="update employee set salary="+salary+"where empcode="+code;
			Employee emp=new Employee();
			try
			{
				pst=conn.prepareStatement(query);
				pst.executeUpdate();
				
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
	}*/
	

}
