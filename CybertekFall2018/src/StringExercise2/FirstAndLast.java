package StringExercise2;

import java.util.Scanner;

public class FirstAndLast {
	public static void main(String[] args) {
//		First and last
//		Ask user to enter two words. Print the first letter of the first word and the last letter of the second word.
//		Input: Bob
//		system
//		Output: Bm
		Scanner input=new Scanner (System.in);
		System.out.println("Please Enter First Word");
		String word1=input.nextLine();
		System.out.println("Please Enter Second Word");
		String word2=input.nextLine();
		int lentw1=word1.length();
		int lentw2=word2.length();
		
		
		
		System.out.println(word1.substring(0,1)+word2.substring(lentw2-1));
		
		System.out.println("" +word1.charAt(0)+word2.charAt(lentw2-1));
		
		
		
		
		
		
	}

}
