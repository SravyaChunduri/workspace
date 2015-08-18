package assign2.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import assign2.test.Assign2;

public class Assign2Test {

	public static void main(String[] args) {
		System.out.println("Hiii");
		Result res=JUnitCore.runClasses(Assign2.class);
		
		for(Failure f:res.getFailures())
		{
			System.out.println("Errors "+f.toString());
		}
		
		System.out.println("Result after TestCases:");
		System.out.println(""+res.wasSuccessful());

	}

	

}
