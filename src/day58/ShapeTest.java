package day58;

public class ShapeTest {

	public static void main(String[] args) {
		
		Drawable myDrawable1 = new Triangle(2.5, 5, "red");
		myDrawable1.drawLine(3);
		myDrawable1.draw();
		
		
	    myDrawable1 = new Square("blue", 4);
		myDrawable1.drawLine(4);
		myDrawable1.draw();
		
		
		Drawable[] myDraw = new Drawable[2];
		myDraw[0] = new Triangle(5, 5, "yellow");
		myDraw[1] = new Triangle(6, 1, "black");
		for(Drawable each: myDraw) {
			each.draw();
			each.drawLine(4);
			
		}
		
		
		
		// 	ONLY REFERENCE TYPE DECIDE WHAT YOU CAN ACCESS USING THAT VARIABLE!!!
		
	}
}
