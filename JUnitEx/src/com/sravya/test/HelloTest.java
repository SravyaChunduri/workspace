package com.sravya.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sravya.Hello;

public class HelloTest {
	Hello h;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Classs!!");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		
		h=new Hello();
		System.out.println("In set up method");
		
	}

	@After
	public void tearDown() throws Exception {
		h=null;
		System.out.println("Tear Down !! memory deallocated");
	}

	@Test
	public void testAdd() {
		//Hello h=new Hello();
		
		assertEquals(5,h.sub(8,3));
		
	}
	//@Test
	//@Test(timeout=1000)//gives error if output is not displayed in 1000ms
	@Test(expected=ArithmeticException.class)//like exceptions,write if u are expecting that error
	public void testDiv()
	{
		assertEquals(5,h.div(10,2));
	}
	@Test
	public void testMul()
	{
		//Hello h=new Hello();
		
		assertEquals(15,h.mul(5, 3));
	}
	
	
	

}
