package day42;

import java.util.ArrayList;

public class EmpolyeeActions {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.printAllInfo();
		
		e1.name = "Nodira";
		e1.age = 37;
		e1.title = "SDET";
		e1.salary = 100000;
		e1.printAllInfo();		
		
		Employee e2 = new Employee();
		e2.name = "Aybek";
		e2.age = 8;
		e2.title = "Doctor";
		e2.salary = 450000;
		e2.printAllInfo();
		
		Employee e3= new Employee();
		e3.name = "Otabek";
		e3.age = 17;
		e3.title = "Engeneer";
		e3.salary = 200000;
		e3.printAllInfo();
		
		
		ArrayList<Employee> myPeople = new ArrayList<>();
		myPeople.add(e1);
		myPeople.add(e2);
		myPeople.add(e3);
		myPeople.add( new Employee());
		
		System.out.println( myPeople.size());
		myPeople.get(myPeople.size()-1);
		
		Employee firstItem = myPeople.get(0);
		firstItem.printAllInfo();
		
		Employee thirdItem = myPeople.get(2);
		thirdItem.printAllInfo();
		
		for (int i = 0; i < myPeople.size(); i++) {
			Employee each = myPeople.get(i);
			each.printAllInfo();
			
			//myPeople.get(i).printAllInfo();
			
		}
		
		System.out.println();
		
		System.out.println("----print out employee that makes more than 200K");
		for (int i = 0; i < myPeople.size(); i++) {
			Employee each =myPeople.get(i);
			if(each.salary>200000) {
				each.printAllInfo();
			}
			
		}
		
		System.out.println("-----count employee younger than 20--------");
		
		int count=0;
		for(Employee each: myPeople) {
			if (each.age>20) {
				count++;			
			}
		}
			System.out.println(count);
		
		
		System.out.println("----save the name of all employee\n" + 
				" who is less than 25 into a String Variable names-----");
		
		String names ="";
		for (int i = 0; i < myPeople.size(); i++) {
			Employee each=myPeople.get(i);
			if(each.age<25) {
				names+=each.name+ ", ";
			}
			
		}
		System.out.println(names);
		

		System.out.println("\n---Raise the salary of employee who is younger than 25 by 20K---\n");
		for (int i = 0; i < myPeople.size(); i++) {
			Employee each= myPeople.get(i);
			if(each.age<25&&each.name!=(null)) {
				each.salary+=20000;
				each.printAllInfo();
			}
		}
	}

}
