package day55;

public class HourlyEmployee extends Employee {

	
//	private String id;
//	private String name;
	
	private double hourWorked;
	private double hourlyRate;
	
	@Override
	public void calculateAnnualSalary() {
		System.out.println("Salary : "+ (hourWorked*hourlyRate)*52);
	}

	public double getHourWorked() {
		return hourWorked;
	}

	public void setHourWorked(double hourWorked) {
		this.hourWorked = hourWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public HourlyEmployee(String id, String name, double hourWorked, double hourlyRate) {
		super(id, name);
		this.hourWorked = hourWorked;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hourWorked=" + hourWorked + ", hourlyRate=" + hourlyRate + ", getId()=" + getId()
				+ ", getName()=" + getName() + "]";
	}

	@Override
	public boolean isIn100KClub() {
		int annual = (int)(hourlyRate*hourWorked*52);
		return annual>100000;
	}
	
	
	
	
}
