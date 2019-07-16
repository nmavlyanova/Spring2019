package day54;


// HAS-A RELATIONSHIP CAN BE BUILT USING INSTANCE VARIABLE WITH REFERENCE TYPE
// WHEN SoccerClub define has a relationship with Stadium by 
// putting Stadium as instance variable
// It has access to everything visible that Stadium object can have


// WHAT DO WE CALL HAS-A RELATIONSHIP COMPARED TO INHERITANCE FOR IS-A
// COMPOSITION

public class SoccerClub {
	
	int playerCount;
	int fanCount;
	String name;	
	Stadium st;


	public SoccerClub(int playerCount, int fanCount, String name,Stadium stadium) {
		//super();
		this.playerCount = playerCount;
		this.fanCount = fanCount;
		this.name = name;
		this.st = stadium;
		
	}
	
	public char getInitial() {
		return name.charAt(0);
	}


	public int getPlayerCount() {
		return playerCount;
	}


	public void setPlayerCount(int playerCount) {
		this.playerCount = playerCount;
	}


	public int getFanCount() {
		return fanCount;
	}


	public void setFanCount(int fanCount) {
		this.fanCount = fanCount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Stadium getStadium() {
		return st;
	}


	public void setStadium(Stadium stadium) {
		this.st = stadium;
	}


	@Override
	public String toString() {
		return "SoccerClub [playerCount=" + playerCount + ", fanCount=" + fanCount + ", name=" + name + ", stadium="
				+ st + "]";
	}
	
	
	public int getStadiumCapacity() {
		return st.capacity;
	}
	
	
	
	
}



