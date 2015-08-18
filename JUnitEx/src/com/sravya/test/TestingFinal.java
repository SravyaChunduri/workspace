package com.sravya.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;



public class TestingFinal {
	public static void main(String [] args)
	{
		System.out.println("Hiii");
		Result res=JUnitCore.runClasses(ComboTest.class);
		//Result res=JUnitCore.runClasses(HelloTest.class);
		for(Failure f:res.getFailures())
		{
			System.out.println("Errors "+f.toString());
		}
		System.out.println(""+res.wasSuccessful());
		
	}

}
