package day46;

import java.util.ArrayList;

public class SlackAction {

	public static void main(String[] args) {
		
		
		SlackUser user1= new SlackUser();
		//System.out.println(user1);
		user1.sendMessage("Soft Skills", "Hi everyone!!!");
		
		SlackUser user2=new SlackUser("Farrukh", "mavl@gamil.com", 29);
		//System.out.println(user2);
		
		SlackUser user3=new SlackUser("Otabek", "mavlono@harmony.edu", 25);
		//System.out.println(user3);
		
		SlackUser user4=new SlackUser("Aybek", "Chilton@yahoo.com",1);
		//System.out.println(user4);
		
		
		
		
		ArrayList<SlackUser> lst= new ArrayList<>();
		lst.add(user1);
		lst.add(user2);
		lst.add(user3);
		lst.add(user4);
		
		for (int i = 0; i < lst.size(); i++) {
		lst.get(i).sendMessage("QA", "HI");		
		}
		//or
		for(SlackUser each: lst) {
			each.sendMessage("general", "Good morning");
		}
	}

}
