package day63;

public class TryFinally {

	public static void main(String[] args) {
		
		/*POSSIBLE COMBINATIONS:
		 * 
		 * try  catch
		 * 
		 * try  catch  finally
		 * 
		 * try  catch  catch  catch  finally
		 * 
		 * try  finally -->> POSSIBLE BUT DO NOT DO IT!!!
		 * 		  
		 */
		
		try {
			
			System.out.println("Just try and not catch");
			
		}finally {
			
			System.out.println("Just run no matter exception happen or not");
			
		}
		
		
		
		
	}
}
