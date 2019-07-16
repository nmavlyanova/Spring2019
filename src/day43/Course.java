package day43;

public class Course {

	String name;
	int courseId;
	
	//Constructor
	//---> a special method that being called whenever an object is created
	//it has same name as class name
	//it has no return type ---(this does not mean return type void)
	
	public Course() {
		System.out.println("Course Constructor");
	}
	
	
	public Course(String name) {
		this.name=name;
		System.out.println("passing argument");
	}
}
