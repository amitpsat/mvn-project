/**
 * 
 */
package org.istrac.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author root
 *
 */
public class CalculatorTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.istrac.app.Calculator#add(int, int)}.
	 */
	@Test
	public void testAdd() {
		
		Calculator calc=new Calculator();
		int result =calc.add(5, 4);
		
		assertEquals(9, result);
		
		
	}
	
	
	@Test
	public void testMultiply() {
		
		Calculator calc=new Calculator();
		int result =calc.multiply(5, 4);
		
		assertEquals(20, result);
		
		
	}
	
		

}
