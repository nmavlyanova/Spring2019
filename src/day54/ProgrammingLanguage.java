package day54;

public class ProgrammingLanguage extends Language {

	
	//We can not Override final instance methods
//	@Override
//	public void obeyGrammaRule() {
//		System.out.println("MUST OBEY THE SYNTAX RULE copy");
//		super.obeyGrammaRule();
//	}

	
	//We can not hide final static methods
//	public final static void display() {
//		System.out.println("Display language");
//	}
	}




class Language{
	
	public final void obeyGrammaRule() {
		System.out.println("MUST OBEY THE SYNTAX RULE");
	}
	
	public final static void display() {
		System.out.println("Display language");
	}
}