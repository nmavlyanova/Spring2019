package day63;

public class ScopeInTryCatchBlock {

	public static void main(String[] args) {
		
		// if a variable is defined in a block
		// it is only accessible within that block
		
		try {
			
			int i = 10;
			System.out.println(i);
		
		}catch(Exception e){
			
			int i = 20;
			System.out.println(i);
			
		}finally {
			
			int i = 30;
			System.out.println(i);
		}
		
	}
}
