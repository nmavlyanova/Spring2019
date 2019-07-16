package day49;

public class AudioBook extends Book{
	
	double audioLength;
	
	public void play() {
		System.out.println("We are playing Book of < "+ author+ " > and it is "+ audioLength+" minutes long" );
		
		this.author=author;
		
	}
	
}
