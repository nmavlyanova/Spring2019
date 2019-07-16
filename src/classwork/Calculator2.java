package classwork;

public class Calculator2 {

	
	
	public static void calculate(char operator, int firstNum, int secNum){
		switch (operator) {
	    case '+':
	      System.out.println("result of addition is : " + (firstNum+secNum));
	      break;
	    case '-':
	      System.out.println("result of subtraction is : " + (firstNum-secNum));
	      break;
	    case '*':
	      System.out.println("result of multiplication is : " + (firstNum*secNum));
	      break;
	    case '/':
	      System.out.println("result of division is : " + (firstNum/secNum));
	      break;
	    case '%':
	      System.out.println("remainder of division is : " + (firstNum%secNum));
	      break;

	    default:
	      System.out.println("INVALID OPERATOR");
	      break;
	    }
	    
	    
	  }
	  
	  /*
	   * OPTIONAL :
	   * calculate method that take 3 paramEters and do below 
	   *  
	   * calculate("+" , 100, 30)  -- print 130
	   * calculate("-" , 100, 30)  --  print 70
	   * calculate("*" , 100, 30)  -- print 3000
	   * calculate("/" , 100, 30)  -- print 3
	   * calculate("%" , 100, 30)  -- print 10
	   * calculate("abc" , 100, 30)  -- print INVALID OPERATION CODE

	   * */
	  
	  public static void main(String[] args) {
	    
	    calculate('+' , 100, 30) ; 
	    calculate('-' , 100, 30) ; 
	    calculate('*' , 100, 30) ; 
	    calculate('/' , 100, 30) ; 
	    calculate('%' , 100, 30) ; 
	    
	    
	  }
	    


	}