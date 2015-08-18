package assign.test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import assign.LargestNumber;

public class AssignTest {

	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLargest() {
		int arr[]={-10,-20,-30,-40};
		
		assertEquals(-10, LargestNumber.find_large(arr));
		System.out.println("The largest Number is:"+LargestNumber.find_large(arr));
		
	}

}
