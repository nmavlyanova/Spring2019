package day46;

public class SlackUser {

	private String name;
	private String email;
	private int groupNum;
	
	public SlackUser() {
		this("Nodira", "mavl@gmail.com", 20);
	}
	
	
	public SlackUser(String name, String email, int groupNum) {
		
		this.name = name;
		this.email = email;
		this.groupNum = groupNum;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}


	
	public String toString() {
		return "SlackUser [name=" + name + ", email=" 
				+ email + ", groupNum=" + groupNum + "]";
	}
	
	public void sendMessage(String channel, String content) {
		System.out.println("User < "+ name+ " >  sent message  < "
						+ content+" >  to channel  < "+ channel);
	}
	
}
