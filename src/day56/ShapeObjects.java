package day56;

public class ShapeObjects {

	public static void main(String[] args) {
		
		Circle c1 = new Circle("red", 5.6);
		c1.calculatePerimeter();
		c1.calculateArea();
		System.out.println(c1.toString());
		
		Rectangle r1 = new Rectangle("blue", 5.6, 8.2);
		r1.calculatePerimeter();
		r1.calculateArea();
		System.out.println(r1.toString());
		
	}
}
