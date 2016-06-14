package edu.pitt.siying;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CitySim9002Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//----------------------------------
	// VALID INTEGER TEST - 0
	//----------------------------------
	//Return true if it is a valid integer
	@Test
	public void testIsInteger0() {
		String[] testArray = {"8"};
		assertTrue(CitySim9002.isInteger(testArray));
	}

	
	// VALID INTEGER TEST - 1
	//Return false if the input is 0 or 1
	@Test
	public void testIsInteger1() {
		String[] testArray1 = {"1"};
		String[] testArray2 = {"0"};
		assertFalse(CitySim9002.isInteger(testArray1) || CitySim9002.isInteger(testArray2));
	}
	
	// VALID INTEGER TEST - 2
	// Return false if the input is more than one parameter 
	@Test
	public void testIsInteger2() {
		
		String[] testArray = {"7", "2"};
		assertFalse(CitySim9002.isInteger(testArray));
	}
	
	// VALID INTEGER TEST - 3
	// Return false if the input is not integer
	@Test
	public void testIsInteger3() {
			
		String[] testArray = {"NotInteger"};
		assertFalse(CitySim9002.isInteger(testArray));
	}
	
	
}
