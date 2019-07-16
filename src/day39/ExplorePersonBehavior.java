package day39;

public class ExplorePersonBehavior {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.age=19;
		p.gender='M';
		p.name= "King Kong";
		
		
		
		Person g = new Person();
		g.age=19;
		g.gender='F';
		g.name="Alina";
		
		
		
		p.eat();		
		p.tellMeYourName();
		p.printPersonInfo();
		
		g.eat();
		g.tellMeYourName();
		g.printPersonInfo();
	}

}
