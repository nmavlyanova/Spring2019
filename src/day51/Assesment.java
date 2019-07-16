package day51;

public class Assesment {

	int questionCount;
	int score;
	String type;
	
	//in our application all assesments have one shared timeLimit
	static int timeLimit=45;

	//static method can only access static members
	public static void printTimeLimit() {
		System.out.println("Time Limit "+timeLimit);
	}
	
	
	
	@Override
	public String toString() {
		return "Assesment [questionCount=" + questionCount + ", score=" + score + ", type=" + type + "]";
	}
	
	
	
}
