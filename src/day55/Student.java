package day55;

// ABSTRACT class are not meant to be instantiated -- NO OBJECT!!!
// abstract class are meant to be a super class
//   to provide a general idea, without providing implementation details
//   using abstract method

// OTHER THAN ABOVE 
// YOU CAN HAVE EVERYTHING ELSE AS NORMAL CLASS CAN HAVE

public abstract class Student {

	int id;
	String name;
	public static final String SCHOOL = "Cybertek";
	
	
	
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name) {
	
		this.id = id;
		this.name = name;
	}

	public void Study() {
		System.out.println("Study hard to get the job");
	}
	
	public static void showSchool() {
		System.out.println(SCHOOL);
		
	}
	
	public abstract void attendClass();
	
//	public void attendClass() {
//		System.out.println("Implement in Sub classes");
//	}
	
}
