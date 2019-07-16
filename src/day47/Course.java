package day47;

public class Course {

	public static String school;
	public static boolean isRamadan;
	
	//Static Initializer Block
	//It will only run once when the class is loaded
	//It is used to initialize the static fields value before 
	//the type's first usage and it will run only one time
	
	public Course() {
		System.out.println("Constructor");
	}
	
	static {
		school="Cybertek school";
		System.out.println("Welocome to our school: "+school);
		System.out.println("Let The Journey Begin");
		isRamadan=true;
		
		if(isRamadan) {
			System.out.println("Use Ramadan schedule");
		}else {
			System.out.println("Use normal schedule");
		}
	
	}
	
	
	
}
