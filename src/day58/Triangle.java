package day58;

public class Triangle extends Shape{
	
	double height;
	double base;
	
	

//	public Triangle(double height, double base) {
//		
//		this.height = height;
//		this.base = base;
//	}
//	
	
	public Triangle(double height, double base, String color) {
		super(color);
		this.height = height;
		this.base = base;
	}

	@Override
	public void draw() {
		System.out.println("Drawing Triangle ");
		
	}

	@Override
	public void calculateArea() {
		System.out.println("Area of triangle is : "+ (int)(height*base)/2);
		
	}

	@Override
	public String toString() {
		return "Triangle [height=" + height + ", base=" + base + ", color=" + color + "]";
	}

	@Override
	public void drawLine(int lineCount) {
		System.out.println("Drawing Triangle using : " +lineCount + " Lines");
	}
	public static void printDrawingTool() {
		System.out.println("Drawing with : "+ DRAWING_TOOL);
	}

}
