package day53;

public class UK_OnlineCourse extends OnlineCourse {
int capacity = 200;
	
	
	
	public static void main(String[] args) {
		UK_OnlineCourse sdet = new UK_OnlineCourse();
//		System.out.println(sdet.capacity);
		sdet.showCapacity();
		
	}
	
	@Override
	public void showCapacity() {
		
		//As long as we have a field called Capacity in this class
		//below line will always be interpreted as this.capacity
		System.out.println("Capacity directly"+capacity);
		System.out.println("UK Online Course "+this.capacity);
		System.out.println("Online Course "+ super.capacity);
	
		System.out.println("------------");
	
		//how to print out Course capacity field
		super.showCapacity();
	}
	
}



