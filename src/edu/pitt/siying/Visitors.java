package edu.pitt.siying;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Random;

public class Visitors {
	
	private List<String> studentLikes;
	private List<String> professorLikes;
	private List<String> businessLikes;
	private List<String> bloggerLikes;
	
	private HashMap<String, List<String>> visitorsInfo;
	
	private List<String> visitorTypes;
	
	//Initialization
	public Visitors() {
		//Student information
		studentLikes = new ArrayList<String>();
		studentLikes.add("Squirrel Hill");
		studentLikes.add("Downtown");
		studentLikes.add("The Point");
		visitorsInfo.put("Student", studentLikes);
		
		//Professor information
		professorLikes = new ArrayList<String>();
		professorLikes.add("Squirrel Hill");
		professorLikes.add("Downtown");
		professorLikes.add("The Point");
		professorLikes.add("The Cathedral of Learning");
		visitorsInfo.put("Professor", professorLikes);
		
		//Business Person information
		businessLikes = new ArrayList<String>();
		businessLikes.add("Squirrel Hill");
		businessLikes.add("Downtown");
		visitorsInfo.put("Business Person", businessLikes);
		
		//Blogger information
		bloggerLikes = new ArrayList<String>();
		visitorsInfo.put("Blogger", bloggerLikes);
		
		visitorTypes = new ArrayList<String>();
		visitorTypes.add("Student");
		visitorTypes.add("Professor");
		visitorTypes.add("Business Person");
		visitorTypes.add("Blogger");
	}
	
	public String randomGetVisitor(int seed) {
		String selected = "";
		
		Random generator = new Random();
		int item = generator.nextInt(seed);
		
		int i=0;
		for(String s:visitorTypes) {
			if (i == item)
				selected = s;
			i ++;
		}
		return selected;
	}
}
