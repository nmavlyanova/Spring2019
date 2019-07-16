package day39;

public class RunnerClass {

	public static void main(String[] args) {

		//local variable
		//String s = "abc";
		
		//Creating new Person object		
		Person p1=new Person();
		//setting attributes value of object
		p1.name = "Nodira";
		p1.age = 38;
		p1.gender = 'M';
		
		//Creating new Person object
		Person p2 = new Person();
		//setting attributes value of object
		p2.name = "Diana";
		p2.age = 32;
		p2.gender = 'F';
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		
		
		Horse spartan = new Horse();
		spartan.breed = "Mustang";
		spartan.age = 10;
		spartan.color = "White";
		spartan.height = 5.5;
		
		
		
		
		
		
	}

}
