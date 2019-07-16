package day44;

public class Job {

	private String title;
	private String company;
	private int annualSalary;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany() {
		this.company= company;
	}
	public int getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary() {
		this.annualSalary=annualSalary;
	}
	
	
	
	
	public Job() {
		this.title = "undefined";
		this.company = "unknown";
	}
	
	public Job(String title) {
		this.title=title;
	}
	
	public Job(String title, String company, int annualSalary) {
		this.title = title;
		this.company = company;
		this.annualSalary= annualSalary;
	}
	
	public String toString() {
		return "Job [title=" + title + ", company=" + company + ", annualSalary=" + annualSalary + "]";
	}
	
	//this is the special method that will be called
	//when reference variable printed out directly
	//and method header should be exactly as below 
	//toString, does not accept parameter and return String
//	public   String toString() {
//		String conc= "Your job title is: "+ title+ ", in Company: "+ company+ ", with salary: "+ annualSalary;
//		return conc;
//	}
	
	
	


}
