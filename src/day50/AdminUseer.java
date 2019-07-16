package day50;

public class AdminUseer extends SlackUser {
//
//	String displayName;
//	int timeZone;
//	String status;
//	
	int adminLevel;
	 
	public AdminUseer(String displayName, int timeZone, String status, int adminLevel) {
		super(displayName, timeZone, status);
		this.adminLevel=adminLevel;
	}
	
	public void sendMEssage(String message) {
		System.out.println("@Channel :");
		System.out.println("< "+ displayName+ " > is sending  < "+message +" >");
		System.out.println("asjdgdsgfusdcakfh");
	}
	
	
	public static void main(String[] args) {
		
		AdminUseer a1 = new AdminUseer("B11",5, "Available", 1);
		a1.sendMEssage("Hello");
	}
	
}
