package day41;

public class Student {

	
	//access modifiers
	/*
	 * public/ protected/ default/ private
	 * 
	 * we can use it for any methods
	 * we can use it for fields
	 */
	
	
	
	public String name;
	public int age;
	public long ssn;
	
	
	public void displayName() {
		System.out.println("Name is : "+name);
	}
	
	
	//it is only accessible within same class
	//which means Student class only
	private void displayNameAndAge() {
		System.out.println("Name is : "+ name + "|age is : "+ age);
	}
	
	

	//it is only accessible within same class
	//which means Student class only
	private void ssn() {
		System.out.println("SSN is : "+ ssn);
	}
	
	
}
