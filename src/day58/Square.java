package day58;

public class Square extends Shape {

	
	int sideLength;
	
	
	
	public Square(String color, int sideLength) {
		super(color);
		this.sideLength = sideLength;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Square");
		
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of square is : "+ sideLength*sideLength);
		
	}

	@Override
	public String toString() {
		return "Square [sideLength=" + sideLength + ", color=" + color + "]";
	}

	
	public void drawLine(int lineCount) {
		System.out.println("Drawing " +lineCount + " Line");
	}
	public static void printDrawingTool() {
		System.out.println("Drawing square with : "+ DRAWING_TOOL);
	}
	
}
