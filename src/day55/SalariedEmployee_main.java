package day55;

public class SalariedEmployee_main {

	public static void main(String[] args) {
		
		SalariedEmployee emp1 = new SalariedEmployee("101",  "Nodira", 12000);
		System.out.println(emp1.toString());
		emp1.calculateAnnualSalary();
		
		int newMonthlySalary = (int) (emp1.getMonthlySalary()*1.1);
		emp1.setMonthlySalary(newMonthlySalary);
		emp1.calculateAnnualSalary();
		
		
		HourlyEmployee emp2 = new HourlyEmployee("102", "NNN", 40, 60);
		System.out.println(emp2.toString());
		emp2.calculateAnnualSalary();
		
		
	}
}
