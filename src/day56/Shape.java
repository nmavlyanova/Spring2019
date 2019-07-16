package day56;

public abstract class Shape {
	
	String color;
	
	
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	public abstract void calculatePerimeter();
	public abstract double calculateArea();
	
	
	// THE OBJECT VERSION OF TOSTRING METHOD IS NOT ABSTRACT METHOD
	// -->> YOU CAN OVERRIDE A NON-ABSTRACT METHOD WITH ABSTRACT METHOD IF IT IS DEFINED IN
	@Override
	public abstract String toString();
	

}




