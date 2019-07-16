package day49;

public class Action {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		//e can only access title, id
		
		FullTimeEmployee f = new FullTimeEmployee();
		//f can access salary, insurance,
		//title id  from Employee
		
		Teacher t = new Teacher();
		//teacherId, energyLevel,
		//salary, insurance from FullTimeEmployee
		//title and id from Employee
		
		Action a = new Action();
		a.toString();
		
		
	}
	
	
}
