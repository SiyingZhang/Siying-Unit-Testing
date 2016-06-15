package edu.pitt.siying;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class LocationsTest {
	
	private Locations locations = new Locations();

	/**
	 * The element of key 3 should be The Point in locations HashMap
	 * Mock the random generator
	 * Set the random number to be 2
	 * nextLocation should return "The Point"
	 */
	@Test
	public void testNextLocation0() {
		
		Generator mockGenerator = Mockito.mock(Generator.class);
		Mockito.when(mockGenerator.randomGenerator()).thenReturn(2);
		
		assertEquals("The Point", locations.nextLocation(mockGenerator));
	}
	
	/**
	 * The element of key 3 should be The Point in locations HashMap
	 * Mock the random generator
	 * Set the random number to be 1
	 * nextLocation should not return "The Point"
	 */
	@Test
	public void testNextLocation1() {
		
		Generator mockGenerator = Mockito.mock(Generator.class);
		Mockito.when(mockGenerator.randomGenerator()).thenReturn(1);
		
		assertNotEquals("The Point", locations.nextLocation(mockGenerator));
	}

}
