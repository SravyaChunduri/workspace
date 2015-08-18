package assign.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import assign.test.AssignTest;

public class AssignFinal {

	public static void main(String[] args) {
		
		
		System.out.println("Hiii");
		Result res=JUnitCore.runClasses(AssignTest.class);
		
		for(Failure f:res.getFailures())
		{
			System.out.println("Errors "+f.toString());
		}
		System.out.println(""+res.wasSuccessful());

	}

}
