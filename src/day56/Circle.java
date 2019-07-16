package day56;

class Circle extends Shape{
	
//	String color;
	double radius;
	
	
	public Circle(String color, double radius) {
	super(color);
	this.radius = radius;
}
	
	@Override
	public void calculatePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Calculated perimeter of area is: "+ perimeter);
	}
	@Override
	public double calculateArea() {
		double area = 3.14*(radius*radius) ;
		return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", calculateArea()=" + calculateArea() + "]";
	}
		
}

