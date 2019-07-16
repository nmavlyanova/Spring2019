package day56;

class Rectangle extends Shape{
	
//	String color;
	protected double width;
	protected double height;
	public Rectangle(String color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void calculatePerimeter() {
		double perimeter = 2*(width+height);
		System.out.println("perimeter of rectangle is: ");
	}
	@Override
	public double calculateArea() {
		double area = width*height;
		return area;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", calculateArea()="
				+ calculateArea() + "]";
	}
	
	
	
}

