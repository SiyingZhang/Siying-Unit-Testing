package edu.pitt.siying;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratorTest {
	
	/**
	 * The random number should smaller than bound
	 * Input seed 9 and bound 6
	 * The generated number should no less than 0 and larger than 6
	 */
	@Test
	public void testRandomGenerator() {
		Generator generator = new Generator(9, 6);
		assertTrue(generator.randomGenerator()<6 && generator.randomGenerator()>=0);
	}

}
