package day60;

import day58.*;

public class ShapeUtility {

	
	// we don't want to create an object while calling this
	// utility method so we just made it static
	public static void describeTheShape(Shape anyShape) {
		System.out.println("Calling describeTheShape(Shape anyShape)");
		anyShape.draw();
	}
	
	public static void describeTheShape(Triangle anyTriangle) {
		System.out.println("Calling describeTheShape(Triangle anyTriangle)");
		anyTriangle.draw();
	}
	
	public static Shape getAnyShape() {
		return new Square("yellow", 15);
	}
	
	// The reason of making this method STATIC is
	// to call this method DIRECTLY in this class's main method
	// so we don't need to create an object out of this class and call the method
	public static Drawable getA_Drawable() {
		return new Square("White", 9);
	}
		
//	public Drawable getA_Drawable() {
//		Drawable d1 = new Triangle(3.5, 5, "Red");
//		return d1;
//	}
	
	
	public static void main(String[] args) {
		
		Shape s1 = new Triangle(5, 5, "grey");
		
		describeTheShape(s1);
		describeTheShape(new Triangle(5, 5, "grey"));
	
		describeTheShape(new Square("white", 6));
		
		Shape myShape = getAnyShape();
		
		Drawable myDrawable = getA_Drawable();
		myDrawable.drawLine(4);
		
	}
}
