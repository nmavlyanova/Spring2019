package day54;

public class SoccerClubObject {

	public static void main(String[] args) {
		
		Stadium sta1 = new Stadium(250000, "HotDog");
		sta1.getCapacity();
		System.out.println(sta1);
		
		SoccerClub club = new SoccerClub(11, 10000, "BARSA", sta1);
		System.out.println(club.getPlayerCount());
		System.out.println(club.getFanCount());
		System.out.println(club.getName());
		System.out.println(club.toString());
		System.out.println(club.getInitial());
		System.out.println(club.getStadiumCapacity());
		
		
		club.setFanCount(12000);
		club.setPlayerCount(25);
		System.out.println(club);
		
		
	}
	
	
}
