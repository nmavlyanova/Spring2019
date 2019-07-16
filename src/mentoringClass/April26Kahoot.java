package mentoringClass;

import java.util.Arrays;
public class April26Kahoot {

	
		
		
	public static void main(String[] args) {
		
		
					
			/*
			 * 
	  		Question 01:  
	  			what's the result of the Following code fragment?
	  			
	  			double A=10;
				switch (A) {
					case 10:  System.out.println("Hello");
					case 11: System.out.println("Hola"); 
							  break;
					default: System.out.println("invalid");	
					
				}		
				
				A. Hello  Hola                     B. Invalid
				C. Compile error   ( C)                D. Hello
				
						// switch does not accept: double, long, boolean, float.	 
						 
			 */
			
			

			int A=10;
		switch (A) {
			case 10:  System.out.println("Hello"); 
			case 11: System.out.println("Hola"); 
					  break;
			default: System.out.println("invalid");	
			
		}		
			
			
			
			
			/*
			  	Question 02: 
			  	
			  	public static void main(String[] args) { 
			  	  System.out.println("2"+(3)+(4));
			  	  }
			  	
			  A. 27     					B. 234    (correct)
			  C. 9							D. compile error
			  
			 */
			
				System.out.println( "2" + (3)+(4) );   //234
				
				String AA="2".concat("3").concat("4");  //234
				System.out.println(AA);
			
				String str2 ="Cybertek "+"batch 11";
				String str3="Cybertek ".concat("batch 11");
			
			
			/*
			 Question 03: 
			    public static void main(String[] args) { 
			  	      System.out.println("2"+( 3 + 4 ) );
			  	  }
			 
			 A. 27	(correct)					B. 234
			 C. 9						D. 2+7
			 
			 */
			
				System.out.println( "2" + (3 + 4)   );  //27
			String str1="2".concat("7");  
			System.out.println(str1); // 27
			
			
			
			
			/*
			 Question 04:
			 
			    public static void main(String[] args) { 
			  	      method1();
			  	      
			  	      public static void method1() {
					System.out.println("hello batch 11");
						}
						
			  	  }
			  	  
			  	  A. hello Batch 11					 B. compile error  (correct).
			  	  
			 
			 */
			
			
			
			
			
			/*
			 Question 05: 
			 	 Which statement is true about Java byte code?
			 	 	
			 	 	A. it can run on any platform.
			 	 	
			 	 	B. it can only run on Eclipse.
			 	 	
			 	 	C. it can run on any platform that has Java runtime environment. JRE  (correct).
			 	 	
			 	 	D. none of the above.
			 	
			 */
			
			
			/*
			 	Question 06:
			 			static public void main(String... OCA){
			 			
			 					int[][] arr= { {1,2}, {3,4} };
			 				System.out.println(Arrays.toString(arr));
			 				
			 					}
			 		A. compile error             		B. [ [1, 2], [3, 4] ]
			    C. [[I@7852e922, [I@4e25154f] (correct)	 		D. [ 1, 2 ]	
			    
			    // Arrays.toString: only applies for single dimentional.
			 
			 */
			
			int[][] arr= { {1,2}, {3,4} };
			System.out.println(Arrays.deepToString( arr ));
			
			
			
			
			
			/*
			  Question 07:
			  		Which statement is true about the switch statement?
			  		  	A. It must contain the default section  
			  			B. The break statement is mandatory at the end of case block. 
			  			C. Its expression must evaluate to a single value   (Correct).
			  			
			 */
			
			
			
			
			
			/*
			 Question 08:
			      Which option can replace xxx to enable the code to print 135 ?
			      
			      	 int[] arr1 = {1,2,3,4,5};
			      		for( XXX ) {
			      			System.out.println(arr1[e]);
			      			}
			 
			 		A. int e = 1;  e <= 5;  e += 1        B. int e = 0;  e <= 4;  e++
			 		C. int e = 0;  e < 5;  e += 2  (correct)        D. int e = 1;  e  <  5;  e +=2
			 
			 */
			//    index:  0 1 2 3 4
			int[] arr1 = {1,2,3,4,5};
			
	 		for( int e=0; e<5; e += 2 ) {
	 			System.out.print(arr1[e]);
	 			}
			
			
			
			/*
			 Question 09: 
			 	 Whichcode fragment causes a compilation error?
			 	 
			 	   A.  float flt =100F ;           B. float flt = 100;
			 	   
			 	   C. double y = 203.22;             D. int  y =10;    
			 	    float A= y;			 (correct)		         float flt= y; 
			 	    
			 	        byte < short < int <long < float < double
			 
			 */
			
	 		int i =10;
		//	byte a = i;
			
	 		  int A1= '9';
	 		  System.out.println();
	 		  System.out.println(A1);
	 		  
	 		  
			
			/*
			  Question 10:
			     which one of the following will give compile error?
			       A. int a= 'B' ;         B. double a = 100L ;
			  	   C. long a='8' ;          D. int a= 200F ;    (correct)
			  
			 */
			long l1=20;
			double d1 = l1;
			
			long t='@';
			
		//	int a1=200f;
			
			
			/*
			  Question 11:
			  		int x=100;
			  		int y=x++;
			  		int z= y++;
			  			++z;
			  	System.out.println(z);		
			  
			  A. 100           B. 101
			  C. 102           D. 103
			  
			 */
			
			
			int x=100;   //1st: 101
	  		int y=x++;  // 100++  => y=100
	  		int z= y++; // 100++    =>z=100;
	  			++z;   // ++z;   ==>z =101;
	  			System.out.println(z);
	  			int u=9;
			System.out.println(++u);
			
			
			/*
			 Question 12:
			 	
			 		int x=100;
			 		int a=x++;
			 		int b=++x;
			 		int c=x++;
			 		
			 		int d=(a<b) ? (a < c) ? a : ( b<c )? b : c;
			 		System.out.println(d);
			 		// in ternary: total number of ? and total numbers of :  MUST be equal
			 		
				A. 100						B. compile error (correct).
				C. 101          		    D. 102			 	
			 		
			 */
		
			//int x=100;
	 		int a=x++;
	 		int b=++x;
	 		int c=x++;
	 		
	 	//	int d=(a<b) ? (a < c) ? a : ( b<c )? b : c;   totaol number of ? is not equal to total number of :
	 	//	System.out.println(d);
	 		
	 		int e=0;
	 		if(10 > 9) e =20;
	 		else e =40;
	 		// ? is if. : is else
	 		
	 		int t1 = (10 < 9)? 20 : 40;
	 		System.out.println(t1);
			
	 		int z1=10;
	 		if(true == false) z1=20;
	 		else if( true == !false) z1=30;
	 		else if( !false == !true) z1=40;
	 		
	 		System.out.println(z1);
	 		
	 		int y1= (true == false) ? 20 : ( true == !false) ? 30 : ( !false == !true) ? 40:0; 
	 		System.out.println(y1);
	 		
	 		boolean b1=!true;  // false
	 		
	 		
	 		//  !false is true, !true is false,  
			
			/*
			 Question 13:
			 	String[][] arr = { {"A","B"}, {"C","D"} };
				for(int i=0; i<arr.length; i++) {
				
					for(int z=0; z<arr[i].length; z++) {
						System.out.print(arr[i][z]);
						
						break;
					}
				}
				
				A. ABCD         B. AB
				C. AC           D. CD
			 
			 
			 */
			
			
	 		String[][] arr2 = { {"A","B"}, {"C","D"} };
	 		int num1=arr2[1].length; //2
	 		int num2=arr2.length;  //2
	 		
			for(int i2=0; i2<arr2.length; i2++) {
			                     // z<2
				for(int z2=0; z2<arr2[i2].length; z2++) {
					System.out.print(arr2[i2][z2]);
									//	[0][0]   A
									//	[1][0]   C
					break;
				}
				
			}
		

		}

	}
	