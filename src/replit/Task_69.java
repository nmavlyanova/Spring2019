package replit;

import java.util.Scanner;

public class Task_69 {

	public static void main(String[] args) {
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name");
		name=scan.nextLine();
		System.out.println("Do you have a US driver license?");
		String driverLicense=scan.next();
		if (driverLicense.equalsIgnoreCase("no")) {
		System.out.println("Invalid data!");
		System.exit(0);}
		System.out.println("Please provide your zip code:");
		int zipCode=scan.nextInt();
		if(zipCode==20910||zipCode==20740) {
		premium+=60;
		}else if (zipCode==22102||zipCode==22103) {
		premium+=30;	
		}else {
		premium+=50;	
		}
		System.out.println("Is this vehicle Owned, Financed, or Leased?");
		vehicleOwnership=scan.next();
		if (vehicleOwnership.equalsIgnoreCase("Owned")) {
		premium+=10;
		}else {
		premium+=20;	
		}
		System.out.println("How is this vehicle primarily used?");
		vehicleUsage=scan.next();
		if(vehicleUsage.equalsIgnoreCase("Business")) {
		premium+=50;
		}else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
		premium+=10;
		}else if (vehicleUsage.equalsIgnoreCase("Commute")) {
		premium+=20;
		System.out.println("Days Driven To Work And/Or School");
		daysDrivenToWorkOrSchool=scan.nextInt();
		premium+=daysDrivenToWorkOrSchool*5;
		System.out.println("Miles Driven To Work And/Or School");
		milesToWorkOrSchool=scan.nextInt();
		premium+=milesToWorkOrSchool*1;}
		System.out.println("How old are you?");
		int age=scan.nextInt();
		if (age<16) {
			System.out.println("Invalid data!");
			System.exit(0);
		}else if (age>16&&age<18) {
			premium*=20;
		}else if (age>=18&&age<=21) {
			premium*=6;
		}else if (age>21&&age<=25) {
			premium*=2;
		}else {
		System.out.println("Invalid age!");}
	System.out.println("What is your driving expirience in years");	
	int drivingExp=scan.nextInt();
	if (drivingExp<0&&(drivingExp-age)<16) {
	System.out.println("Invalid data!");
	System.exit(0);
		}
	System.out.println("Have you had any accidents in the last 5 years?");
	String accidentYN=scan.next();
	if (accidentYN.equalsIgnoreCase("yes")) {
	System.out.println("How many?");
	accidentsAmount=scan.nextInt();
	premium*=accidentsAmount*0.2;
	}
	System.out.println("Have you had continuous insurance for the past 12 months?");
	continuousInsurance=scan.next();
	if(continuousInsurance.equalsIgnoreCase("No")) {
	premium*=2;	}
	System.out.println("What is the highest level of education you have completed?");
	education=scan.next();
	if(education.equalsIgnoreCase("Phd")||education.equalsIgnoreCase("Bachelors")||education.equalsIgnoreCase("Masters")) {
premium*=0.95;
	}else if (education.equalsIgnoreCase("Doctors")) {
	premium*=0.9;
	}else {
	premium*=1.05;	
	}
	System.out.println(name+", here's your quote!");
	System.out.println("Start Your Policy Today For: $"+premium);
	referenceNumber=(""+name.charAt(0)+name.charAt(1)+age+name.charAt(name.length()-2)+name.charAt(name.length()-1)+
	zipCode+education);
	String upper=referenceNumber.toUpperCase();
	System.out.println(upper);		}
		}
	


