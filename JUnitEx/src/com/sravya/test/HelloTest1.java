package com.sravya.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sravya.Hello;

public class HelloTest1 {

	
	@Test
	public void test() {
		//fail("Not yet implemented");
		Hello h=new Hello();
		assertEquals(5,h.add(2,3));
	}

}
