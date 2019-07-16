package day43;

public class Food {

	String name;
	int prepTime;
	
	
	public Food() {
		System.out.println("Let's make somthng to eat");
		}
	
	public Food(String nameFood, int duration) {
		this.name=nameFood;
		this.prepTime = duration;
		System.out.println("Today's food");
	}
}
