package day53;

public class OnlineCourse extends Course {

	int capacity = 300;
	
	
	
	public void showCapacity() {
		
		//As long as we have a field called Capacity in this class
		//below line will always be interpreted as this.capacity
		System.out.println("Capacity directly"+capacity);
		System.out.println("Online Course "+this.capacity);
		System.out.println("Course "+ super.capacity);
	}
	
}

