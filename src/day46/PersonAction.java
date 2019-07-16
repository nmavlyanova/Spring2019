package day46;

public class PersonAction {

	public static void main(String[] args) {
		
		Person p1=new Person("Aybek", 5.1F, 'm');
		Person p2=new Person("Otabek", 6.1F, 'M');
		
		//static way to access static variable
		System.out.println(Person.race);
		//non static way to access static variable
		//highly not recommended
		System.out.println(p1.race);
		System.out.println(p2.race);
		
		Person.race="Humanoid";
		System.out.println(p2.race);
		
		p2.race="Spartan";
		System.out.println(p1.race);

	}

}
