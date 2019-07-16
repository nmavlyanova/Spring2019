package day47;

//import is used to import the type that not under the package

//static import
  //-->> is used to import the visible static members of another class
  //we use keyword "import static yourClassName.staticMember
  //just like importing the class, we can use .* to import all static members

import static day47.StudentUtility.*;

public class StudentUtilityActivity {

	
	public static void main(String[] args) {
//		StudentUtility.displayAllStudent();
//		StudentUtility.displayAllStudent();
//		
//		StudentUtility.addOneStudent("KKKK");
//		StudentUtility.displayAllStudent();
//		
//		StudentUtility.removeStudent(4);
//		StudentUtility.displayAllStudent();
//		
//		StudentUtility.updateStudent(0, "KING");
//		StudentUtility.displayAllStudent();
//		
		

			//System.out.println(studentList);
			displayAllStudent();
			
			System.out.println("------");
			addOneStudent("LLLL");
			displayAllStudent();
			
			System.out.println("------");
		    updateStudent(8, "CHCHCH");
			displayAllStudent();
			
			System.out.println("--------");
			removeStudent(5);
			displayAllStudent();

			System.out.println("----------");
			resetTheList();
			displayAllStudent();
			System.out.println("All cleared");
		
	
		
		
		
		
	}
}
