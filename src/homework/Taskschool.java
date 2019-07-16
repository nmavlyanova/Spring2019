package homework;

public class Taskschool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int x =1;
//do {System.out.print(x++ + " ");
//}while(x<=100); 	
//	
//System.out.println();
//int y = 100;
//	
//	do {System.out.print(y-- + " ");
//	} while (y>0);
//
//	
//}
//	}
//
//
 
		System.out.println(" enter two numbers");
 int x =0;
 int y = 0;
 int tryCount=0;
 do {
	 System.out.println("Enter first number:");
	 System.out.println("Enter second number:");
     ++ tryCount;
     if (tryCount==3) {
    	 System.out.println("You Lost");
    	 break;
     }
 } while (x+y <=100);
	System.out.println("The END");
	
	
	}}