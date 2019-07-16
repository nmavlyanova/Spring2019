package day38;

public class MethodOverloading3 {

	public static void main(String[] args) {
		
		boolean job =work("Sdet");
		System.out.println(job);
		
		double weeklyEarned = work(40);
		System.out.println(weeklyEarned);

	}
	
	public static boolean work(String jobType) {
		System.out.println("Working as < "+ jobType+ " > and it is fun!");
		return jobType.equalsIgnoreCase("sdet")||jobType.equalsIgnoreCase("developer");
	}

	public static double work(int hours) {
		double salary = hours*60;
		System.out.println("Worked < "+ hours+ " > and made < $ "+salary + " > income");
		return salary;
	}
	
}
