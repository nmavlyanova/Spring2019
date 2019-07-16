package day50;

public class SlackUserAccount {

	public static void main(String[] args) {
		
		SlackUser user1 = new SlackUser();
		SlackUser user2 = new SlackUser("Nodira", 6, "available" );
		user2.sendMEssage("Hi Everyone!");
		user2.changeStatus("AWAY");
		System.out.println(user2.status);
		
		
		
		
		StudentUser student1 = new StudentUser(29, "Nodira", 5, "SLEEP");
		System.out.println(student1.toString());
		student1.displayGroup();
		
		
		
	}
}
