package StringExercise2;

import java.util.Scanner;

public class FirstHalf {
	public static void main(String[] args) {
//		
//		First half
//		Ask user to enter a word. If the first word has even number of characters, print the first half of the word.
//		Input: banana
//		Output: ban
//		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter A Word ");
		String word=scan.nextLine();
		
		int wordlent=word.length();
		
		if(wordlent%2==0) {
			System.out.println(word.substring(word.length()/2));//or
			System.out.println("\n");
			System.out.println(word.substring(wordlent/2));
		}else {
			
			System.out.println("Your word doesn't have even number of caharacters ");
			
			
		}
		
		
		

		
		
		
		
		
		
		
	}

}
