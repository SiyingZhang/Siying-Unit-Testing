package edu.pitt.siying;

import java.util.Random;


/**
 * Main Class to run
 * @author siying
 */
public class CitySim9002 {
	
	private static int VISITOR_SIZE = 4;
	private static int LOCATION_SIZE = 5;

	public static void main(String[] args) {
		
		int seed = 0;
		
		//Only one valid integer parameter is allowed
		if(isInteger(args))
			//set the seed
			seed = Integer.parseInt(args[0]); 	
		else {
			System.out.println("Please enter one integer argument, seed");
			System.exit(0);
		}
		
		System.out.println("Welcome to CitySim!  Your seed is " + seed + ".");	
		
		Visitors visitors = new Visitors();	
		String nextVisitor = "";
		
		Locations locations = new Locations();
		String nextLocation = "";
		
		Generator visGenerator = new Generator(seed, VISITOR_SIZE);
		String[] visitorList = visitors.fiveVisiting(visGenerator);
		
		Random generator = new Random(seed);
		
		for(int i=1; i<=5; i++) {
			
			//STEP1 - Randomly select a visitor
			nextVisitor = visitorList[i-1];		
			System.out.println("Visitor " + i + " is a " + nextVisitor);
			
			//STEP2 - Randomly visit
			nextLocation = locations.getLocation(generator.nextInt(LOCATION_SIZE) + 1);
			
			//The visitor shouldn't leave in the first time.
			while(nextLocation.compareTo("left") == 0) {
				nextLocation = locations.getLocation(generator.nextInt(LOCATION_SIZE) + 1);
			}
			
			while(nextLocation.compareTo("left") != 0) {
				System.out.println("Visitor " + i + " is going to " + nextLocation + "!");
				
				if(visitors.likeLocation(nextVisitor, nextLocation))
					System.out.println("Visitor " + i + " did like " + nextLocation + ".");
				else
					System.out.println("Visitor " + i + " did not like " + nextLocation + ".");
				
				nextLocation = locations.getLocation(generator.nextInt(LOCATION_SIZE) + 1);
			}
			
			System.out.println("Visitor " + i + " has left the city.");
			
			//STEP3 - Print three asterisks
			System.out.println("***");
		}
	}
	
	/**
	 * Determine whether the input is a valid integer
	 * @param arg
	 * @return
	 */
	public static boolean isInteger(String[] arg) {
		
		//Only one integer is permitted
		if(arg.length != 1) return false;
		
		try{
			Integer.parseInt(arg[0]);
		} catch(NumberFormatException e) {
			return false;
		} catch(NullPointerException e) {
			return false;
		}
	
		return true;
	}

}
