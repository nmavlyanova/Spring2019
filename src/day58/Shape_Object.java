package day58;

public class Shape_Object {

	public static void main(String[] args) {
		
		
		Triangle t1 = new Triangle(2.5, 5, "Yellow");
		t1.calculateArea();
		t1.draw();
		t1.drawLine(3);
		t1.printDrawingTool();
		Triangle.printDrawingTool();
		System.out.println(Drawable.DRAWING_TOOL);
		System.out.println(Triangle.DRAWING_TOOL);
		System.out.println(t1.toString());
		
		System.out.println("----------------------");
		
		Square s1 = new Square("red", 4);
		s1.calculateArea();
		s1.draw();
		s1.drawLine(4);
		s1.printDrawingTool();
		Square.printDrawingTool();
		System.out.println(Square.DRAWING_TOOL);
		System.out.println(s1.toString());

	}

}
