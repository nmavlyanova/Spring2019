package day55;

public class OnlineStudent extends Student {

//	int id;
//	String name;
	int zoomID;
	
	
	public OnlineStudent(int id, String name, int zoomID) {
		super(id, name);
		this.zoomID = zoomID;
	}
	
	@Override
	public void attendClass() {
		System.out.println("Attend class using zoom");
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		OnlineStudent s1 = new OnlineStudent(29, "SSS", 123456);
//		s1.id = 101;
//		s1.name = "Spartan";
//		s1.zoomID = 123456;
		
		s1.attendClass();
		
		
		
// 		Super class meant not to be instantiated
//		We can not create an object from abstract class
//		Student stu = new Student();
		
		
		
	}
	
	
	
	
}




