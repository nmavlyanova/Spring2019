package day58;

public interface Drawable {

	public static final String DRAWING_TOOL = "PENCIL";
	
	// must  be implemented in first concrete class 
	public abstract void draw();
	
	//can be used as is or being overridden
	public default void drawLine(int lineCount) {
		System.out.println("Drawing " + lineCount+" Line");
	}
	
	// only way to use static method of interface is a static way
	// it is not inherited
	// this behavior is exclusive to interface
	// class's static methods are inherited to sub class
	public static void printDrawingTool() {
		System.out.println("My tool is : "+DRAWING_TOOL);
	}
	
}
