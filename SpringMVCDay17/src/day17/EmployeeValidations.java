package day17;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class EmployeeValidations implements Validator{

	public boolean supports(Class<?> arg0) {
		
		return  Employee.class.isAssignableFrom(arg0);
	}

	public void validate(Object arg0, Errors errs) {
		Employee emp=(Employee) arg0;
		if(emp.getEmpcode()<=0)
		{
		  errs.rejectValue("empcode","empcode.err");
		}
		
		ValidationUtils.rejectIfEmpty(errs,"empname","name.empty");
		if(emp.getSalary()<=0)
			errs.rejectValue("salary","salary.err");
		
	}
	

	

}
