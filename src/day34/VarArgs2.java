package day34;

public class VarArgs2 {

	public static void main(String[] args) {
		printNames("Amirbek","Aybek","Otabek","Nodira","Farrukh");

	}
	public static void printNames(String... names) {
		
		
		System.out.println(names[0]);
		System.out.println(names[3]);
		
		System.out.println("All names count is "+names.length);
	}

}
