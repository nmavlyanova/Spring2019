package day55;

public class SalariedEmployee extends Employee{

//	private String id;
//	private String name;
	private int monthlySalary;
	
	
	
	public int getMonthlySalary() {
		return monthlySalary;
	}



	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}



	public SalariedEmployee(String id, String name, int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}



	@Override
	public void calculateAnnualSalary(){
		System.out.println("Salary :"+ monthlySalary*12);
	}



	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary + ", getId()=" + getId() + ", getName()=" + getName()
				+ "]";
	}



	@Override
	public boolean isIn100KClub() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
