package day50;

public class StudentUser extends SlackUser{

	int groupNumber;
	
	public StudentUser() {
		System.out.println("Student User no arg constructor");
	}

	public StudentUser(int groupNumber, String displayName,int timeZone, String status) {
		//super();
		this.groupNumber = groupNumber;
		this.displayName = displayName;
		this.timeZone = timeZone;
		this.status = status;
				
	}

	
	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber
				+ ", displayName=" + displayName
				+ ", timeZone=" + timeZone
				+ ", status=" + status + "]";
	}

	public void displayGroup() {
		System.out.println("< "+ displayName+ " > is member of group < "+ groupNumber+" >" );
	}
	
}
