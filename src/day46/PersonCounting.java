package day46;

public class PersonCounting {

	public static void main(String[] args) {
		
		Person p1=new Person("Aybek", 5.1F, 'm');
		Person p2=new Person("Otabek", 6.1F, 'M');
		Person p3 =new Person("Amirbek", 3.1F, 'M');
		
		System.out.println(p1.counter);
		System.out.println(p2.counter);
		System.out.println(p3.counter);
		System.out.println( Person.counter);
	}

}
