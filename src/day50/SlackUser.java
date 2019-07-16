package day50;

public class SlackUser {

	
	String displayName;
	int timeZone;
	String status;
	
	public SlackUser() {
		System.out.println("Empty Slack Uer");
	}

	public SlackUser(String displayName, int timeZone, String status) {
		
		this.displayName = displayName;
		this.timeZone = timeZone;
		this.status = status;
	}
	
	
	public void sendMEssage(String message) {
		System.out.println("< "+ displayName+ " > is sending  < "+message +" >");
	}
	
	public void changeStatus(String newStatus) {
		this.status=newStatus;
		
	}
	
}
