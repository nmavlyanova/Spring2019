package classwork;

import java.util.Arrays;

public class ArraysCopyOf {

	public static void main(String[] args) {
		
		String[] heros = {"Superman", "Batman", "Aquaman", "Wonder women", "The Flash", };
		
		String[] herosCopy = new String [heros.length];
		for (int i = 0; i < herosCopy.length; i++) {
			herosCopy[i] =heros[i];
		
		}
		
		System.out.println(Arrays.toString(herosCopy));
		
		
		
		Arrays.sort(herosCopy);
		for(String sorted:heros) {
			System.out.println(sorted);
		
			if(sorted.contains("Batman")) {
				System.out.println("Bingo");
		}
		
			
		}
		
		

	}

}
