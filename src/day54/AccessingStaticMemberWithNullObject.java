package day54;

public class AccessingStaticMemberWithNullObject {

	public static void main(String[] args) {
		
		
		SoccerFinal f1 = new SoccerFinal();
		
		f1.printScore();
		f1.printCupName();
		
		
		
		//static members does not need an object to be accessed
		//ClassName.memberName -- static way should be used
		//non-static way works but not encouraged
		SoccerFinal f2 = null;
		//f2.printScore();
		f2.printCupName();
		System.out.println(f2.cupName);
	}
	
	
}
