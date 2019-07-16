package day44;

import java.util.ArrayList;

public class JobObject {

	public static void main(String[] args) {
		
		Job j1 = new Job();
		Job j2 = new Job("SDET");
		Job j3 = new Job("QA","AIG", 125000);
		
		ArrayList<Job> findJob = new ArrayList<>();
		findJob.add(j1);
		findJob.add(j2);
		findJob.add(j3);
		
		System.out.println( j1.getAnnualSalary());
		System.out.println(j2.getAnnualSalary());
		
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		
		//if we print out any reference variable directly
		//or any object directly
		//it will by default call toString() method
		//If you have toString method defined in your own class
		//it will print out whatever that method returns
		//if not it will get Hashcode
		
		//when we print out 
		//List<Wrapper Type>List<String> objects directly
		//   it will just show what is inside directly
		//List<CustomType> object and 
		//if there is no toString method defined in that CustomType Class
		//it will print out each item as the toString return value
		//instead of HashCode
		
		System.out.println(j3);
		
		System.out.println(findJob);
		
		System.out.println(findJob.get(0));
		
		System.out.println(findJob.get(0).toString());
		
		for (int i = 0; i < findJob.size(); i++) {
			System.out.println(findJob.get(i));
		}
		
		
	}

}
