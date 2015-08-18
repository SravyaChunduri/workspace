package day17;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface EmployeeDAO {

	
public void getDBConnection();
public void closeDBConnection();
public void addEmployee(Employee employee);
List<Employee> getEmployees();

}
