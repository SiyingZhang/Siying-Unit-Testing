package edu.pitt.siying;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class VisitorsTest {
	
	private Visitors visitors = new Visitors();

	/**
	 * The element of index 3 should be Blogger in visitors list
	 * Mock the random generator
	 * Set the random number to be 3
	 * nextVisitor should return Blogger
	 */
	@Test
	public void testNextVisitor0() {
		
		Generator mockGenerator = Mockito.mock(Generator.class);
		Mockito.when(mockGenerator.randomGenerator()).thenReturn(3);
		
		assertEquals("Blogger", visitors.nextVisitor(mockGenerator));
		
	}
	
	/**
	 * The element of index 3 should be Blogger in visitors list
	 * Mock the random generator
	 * Set the random number to be 3
	 * nextVisitor should not return Student
	 */
	@Test
	public void testNextVisitor1() {
		
		Generator mockGenerator = Mockito.mock(Generator.class);
		Mockito.when(mockGenerator.randomGenerator()).thenReturn(3);
		
		assertNotEquals("Student", visitors.nextVisitor(mockGenerator));
		
	}
	
	//Business Person should like 2 - Squirrel Hill
	//Given the visitor to be Business Person
	//Given the location to be 2
	//The likeLocation function should return true
	@Test
	public void testLikeLocation0() {
		
		String visitor = "Business Person";
		String location = "Squirrel Hill";
		
		assertTrue(visitors.likeLocation(visitor, location));
	}
	
	//Student shouldn't like 1 - The Cathedral of Learning
	//Given the visitor to be Student
	//Given the location to be 1
	//The likeLocation function should return false
	@Test
	public void testLikeLocation1() {
		
		String visitor = "Student";
		String location = "The Cathedral of Learning";
		
		assertFalse(visitors.likeLocation(visitor, location));
	}

}
