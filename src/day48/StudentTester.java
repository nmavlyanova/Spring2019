package day48;

public class StudentTester {

	public static void main(String[] args) {
		

		Person p1 = new Person();
		p1.age=18;
		p1.name="John";
		p1.height=5.9d;
		p1.gender='M';
		System.out.println(p1.name +p1.age);
		p1.eat();
		
		Person p2 = new Person();
		p2.name = "Tom";
		p2.age = 21;
		p2.height = 6.1d;
		p2.gender = 'M';
		
		
		
		Student s1 = new Student();
		s1.name = "Hon";
		s1.age = 15;
		s1.height = 5.3d;
		s1.gender = 'F';
		s1.studentId = 123456;
		System.out.println(s1.name+s1.age);
		s1.eat();
		
		Student s2 = new Student();
		s2.name = "Lala";
		s2.age = 17;
		s2.height = 5.5d;
		s2.gender = 'F';
		s2.studentId = 789654;
		
	}

}
