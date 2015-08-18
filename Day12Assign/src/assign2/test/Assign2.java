package assign2.test;

import static org.junit.Assert.*;
import assign2.Median;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assign2 {
Median m=new Median();
	
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
	public void testMedian() {
		
		int[] a3={10,20,30};
		int[] a2={0,10,20};
		assertArrayEquals(a2,m.copy(a3));
		System.out.println("Copied the command-line arguments successfully");
		int[] a4=m.copy(a3);
		assertEquals(20,m.medianVal(a4));
		int med=m.medianVal(a4);
		System.out.println("Median is :"+med);
		
		//Median.main(new String[] {"90","10","20","30"});
	}
	
}
