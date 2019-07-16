package classwork;

//large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.

//Create a class named Pizza that stores information about a single pizza. 
//It should contain the following:
//Private instance variables to store the size of the pizza (either small, medium, or large), the number of cheese toppings, the number of pepperoni toppings, and the number of ham toppings.
//  Constructor(s) that set all of the instance variables.
//Public methods to get and set the instance variables.
//A public method named calcCost( ) that returns a double that is the cost of the pizza.
//Pizza cost is determined by:
//Small: $10 + $2 per topping
//Medium: $12 + $2 per topping
//Large: $14 + $2 per topping
//A public method named getDescription() that returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost().
//getDescription() example:
//Total Price: 18.0
public class Pizza {

	private String size="";
	private int cheeseToppings=0;
	private int pepperoniToppings=0;
	private int hamToppings=0;
	//double totalCost=0;
	public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
		
		this.size = size;
		this.cheeseToppings = cheeseToppings;
		this.pepperoniToppings = pepperoniToppings;
		this.hamToppings = hamToppings;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getCheeseToppings() {
		return cheeseToppings;
	}
	public void setCheeseToppings(int cheeseToppings) {
		this.cheeseToppings = cheeseToppings;
	}
	public int getPepperoniToppings() {
		return pepperoniToppings;
	}
	public void setPepperoniToppings(int pepperoniToppings) {
		this.pepperoniToppings = pepperoniToppings;
	}
	public int getHamToppings() {
		return hamToppings;
	}
	public void setHamToppings(int hamToppings) {
		this.hamToppings = hamToppings;
	}
	
	public double calcCost() {
	double totalCost=0;
		if(size.equalsIgnoreCase("Small")) {
			totalCost = 10+(getCheeseToppings()*2)+(getPepperoniToppings()*2)+(getHamToppings()*2);
		}
		else if(size.equalsIgnoreCase("Medium")) {
			totalCost = 12+(getCheeseToppings()*2)+(getPepperoniToppings()*2)+(getHamToppings()*2);
		}
		else if(size.equalsIgnoreCase("Large")) {
			totalCost = 14+(getCheeseToppings()*2)+(getPepperoniToppings()*2)+(getHamToppings()*2);
		}
		
		return  totalCost;
	}
	
	public String getDescription() {
		String descr =size +" Pizza with "+cheeseToppings+ " Cheese toppings, "+ pepperoniToppings+ " Pepperoni toppings, and "+hamToppings + " Ham toppings."+"\n"+"Total Price: "+ calcCost();
		return descr;

	}
	
	
}

//public static void main(String[] args) {
//	Pizza p = new Pizza("Small", 1, 1, 0);
//	p.calcCost();
//	System.out.println(p.getDescription());
//}
