package day58;

// abstract shape class inherit all members of interface
// other than STATIC method
public abstract class Shape implements Drawable {

	String color;
	
	public abstract void calculateArea();
	public abstract String toString();
	public Shape(String color) {
		super();
		this.color = color;
	}
	
}
