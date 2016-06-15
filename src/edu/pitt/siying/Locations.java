package edu.pitt.siying;

import java.util.HashMap;

public class Locations {
	
	private HashMap<Integer, String> locationMap;

	public Locations() {
		
		locationMap = new HashMap<Integer, String>();
		
		//Four locations + left
		locationMap.put(1, "The Cathedral of Learning");
		locationMap.put(2, "Squirrel Hill");
		locationMap.put(3, "The Point");
		locationMap.put(4, "Downtown");
		locationMap.put(5, "left");
	}
	
	/**
	 * Randomly select next place to visit
	 * @param time - visiting 
	 * @return next location
	 */
	public String nextLocation(Generator generator) {
		
		String location = locationMap.get(generator.randomGenerator()+1);
		return location;
	
	}

	public String getLocation(int index) {
		return locationMap.get(index);
	}
}
