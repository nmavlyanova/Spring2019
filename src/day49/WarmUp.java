package day49;

public class WarmUp {

	
	public static void main(String[] args) {
		
		AudioBook a1 = new AudioBook();
		a1.audioLength= 60d;
		a1.author="John Smith";
		a1.chapterCount = 23;
		a1.price = 24.99d;
		a1.play();
		
		AudioBook a2 = new AudioBook();
		a2.author = "John smith";
		a2.audioLength = 104d;
		a2.price = 69.89;
		a2.printAuthor();
		
		
		
		PaperBook p1 = new PaperBook();
		p1.hardCover = true;
		p1.author = "Smth";
		p1.chapterCount = 25;
		p1.printAuthor();
		
		
		
		Book b1 = new Book();
		b1.author = "Catherine";
		b1.chapterCount = 15;
		b1.pageCount = 365;
		b1.price = 14.99;
		
		Book b2 = new Book();
		b2.author = "Malandrino";
		b2.chapterCount = 18;
		b2.pageCount = 448;
		b2.price = 18.99;
		
		
	}
}
