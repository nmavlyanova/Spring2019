package day45;

public class Student {

	String name;
	int age;
	String major;
	
	
	//one constructor can be called
	//in another constructor of same class
	//this(argument)
	
	//However,
	//THIS CAN BE ONLY A SINGLE CALL
	//this(arguments) can not be called more than once
	
	//this(args..)
	//Call MUST be first line of your constructor
	
	public Student() {
	
		//calling constructor with one argument
		//to put default name
		this("No name");
		System.out.println("No arg");
	}
	
	public Student(String name) {
		
		System.out.println("1 arg " +name);
	}

	public Student(String name, int age, String major) {
		this();
		System.out.println("3 arg");
//		this.name = name;
//		this.age = age;
//		this.major = major;
	}
	
}
