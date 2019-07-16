package day45;

public class SpartanGo {
public static void main(String[] args) {
	
	
	Spartan s1= new Spartan();
	System.out.println(s1);

	
	String[] certs= {"OCA", "PSM", "AWS", "OCP"};
	
	Spartan s2= new Spartan("Coder", 8, 600, false, certs);
	Spartan s3= new Spartan("Coder", 18, 200, false, new String [] {"OCA"});
	Spartan s4= new Spartan("Coder", 12, 500, true, new String[] {});
	Spartan s5= new Spartan("Coder", 50, 1600, false, null);
	
	
	System.out.println(s2);
	System.out.println(s2.toString());
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	
	
	
}
}
