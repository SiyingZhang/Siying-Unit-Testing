package edu.pitt.siying;

/**
 * Main Class to run
 * @author siying
 * @version 1.0
 */
public class CitySim9002 {

	public static void main(String[] args) {
		
		int seed = 0;
		
		//Only one integer parameter is allowed, and it can't be 0 or 1
		if(isInteger(args))
			seed = Integer.parseInt(args[0]); 	//Get the Integer as a parameter
		else {
			System.out.println("Please enter one integer argument, seed");
			System.exit(0);
		}
		// TODO Auto-generated method stub
		
		
		System.out.println("Welcome to CitySim!  Your seed is " + seed + " .");	
		
		Visitors visitors = new Visitors();
		String selectedVisitor = "";
		
		for(int i=1; i<=5; i++) {
			selectedVisitor = visitors.randomGetVisitor(seed);
			
			System.out.println("Visitor " + i + " is a " + selectedVisitor);
			
		}
	}
	
	//Determine the parameter
	public static boolean isInteger(String[] arg) {
		
		if(arg.length > 1) return false;
		
		try{
			Integer.parseInt(arg[0]);
		} catch(NumberFormatException e) {
			return false;
		} catch(NullPointerException e) {
			return false;
		}
		
		if(Integer.parseInt(arg[0]) == 0 || Integer.parseInt(arg[0]) == 1)	return false;
		return true;
	}

}
