package day51;

public class JavaAssesment extends Assesment {

//	int questionCount;
//	int score;
//	String type;
//	
//	static int timeLimit;
//	
	int level;
	
	
	
	
	
	public static void main(String[] args) {
		//static way to access .timeLimit
		System.out.println(Assesment.timeLimit);
		
		//accessing inherited static field directly in static method
		System.out.println(timeLimit);
		timeLimit = 50;
		
		//accessing inherited static field in static way
		//using class name
		System.out.println(JavaAssesment.timeLimit);
		
		
		Assesment.printTimeLimit();
		printTimeLimit();
		JavaAssesment.printTimeLimit();
		
		
	}
	
//	
//	//static method can only access static members
//		public static void printTimeLimit() {
//			System.out.println("Time Limit "+timeLimit);
//		}
//		
//		
//		
//		@Override
//		public String toString() {
//			return "Assesment [questionCount=" + questionCount + ", score=" + score + ", type=" + type + "]";
//		}
//		
		
		
	
}
