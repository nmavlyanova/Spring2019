package day45;

import java.util.Arrays;

public class Spartan {

	String name;
	int studyHour;
	int horsePower;
	boolean tired;
	String[] certificates;
	
	//this no arg constructor should set default value for name,studyHour, horsePower
	public Spartan() {
		this("No name", 5);
		
		System.out.println("No arg Constructor");
		
//		this.name="Cybertek student";
//		this.studyHour=5;
		this.horsePower=320;
		//this.certificates=new String[] {"OCA", "PSM", "AWS", "OCP"};
	}
	
	public Spartan(String name, int studyHour) {
		this.name=name;
		this.studyHour=studyHour;
	}
	
	public Spartan(boolean tired) {
		this("John", 20, 550, true, new String [] {"OSA","Scrum MAster"});
		System.out.println("boolean");
	}

	public Spartan(String name, int studyHour, int horsePower, boolean tired, String[] certificates) {
		
		this(name, studyHour);
//		this.name = name;
//		this.studyHour = studyHour;
		this.horsePower = horsePower;
		this.tired = tired;
		this.certificates = certificates;
		System.out.println("5 arg constructor");
	}

	
	public String toString() {
		return "Spartan [name=" + name + ", studyHour=" + studyHour + ", horsePower=" + horsePower + ", tired=" + tired
				+ ", certificates=" + Arrays.toString(certificates) + "]";
	}

	
	
	
}
