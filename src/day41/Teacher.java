package day41;

public class Teacher {

	private String name;
	private String specialty;
	
	
	//getters and setters
	//getter method is just like any other method 
	//it is specifically for getting the fields value
	//and returning it from the method
	//it accepts no parameter
	
	public String getName() {
		
		/*
		 * ENROLL CYBERTEK
		 * GO TO SPARTAN BATCH
		 * GET EXCLUSIVE ACCESS
		 * THEN GET THE NAME 
		 * 
		 */
		return name;
		}
	public String getSpecialty() {
		return specialty;
	}
	
	
	
	//setter method is just like any other method
	//it is specifically for setting/ updating the field value
	//it accepts one parameter so we can pass the new value
	//and return nothing
	public void setName(String newName) {
		/*
		 * GO TO DMV
		 * GET PERMISSION TO CHANGE THE NAME
		 * AND EVENTUALLY CHANGE THE NAME
		 */
		
		name = newName;
	}
	public void setSpecialty(String newSetSpecialty) {
		specialty = newSetSpecialty;
		
	}
	
	
	
}
