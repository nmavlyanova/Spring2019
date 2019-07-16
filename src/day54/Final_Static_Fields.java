package day54;

public class Final_Static_Fields {

	
	// public static final field --->> CONSTANT
	
	//FINAL STATIC FIELD VALUE MUST BE INITIALIZED BEFORE CLASS FINISH LOADING
	public static final String RACE = "Human";
	private static final int MAX_SPEED;
	
	static final int MAX_NUM = getStaticNum();
	
	//ALL CAPITALL IS HIGHLY RECOMMENDED
	
	static {
	
		MAX_SPEED = 120;
	}
	
	public static int getStaticNum() {
		return 200;
	}
	
	public static void main(String[] args) {
		
		System.out.println(RACE);
		//RACE = "Humanoid";
		
		System.out.println(MAX_SPEED);
		System.out.println(Final_Static_Fields.MAX_SPEED);
		
		System.out.println( Integer.MAX_VALUE);
		System.out.println( Math.PI );
		
		
	}
}
