package StringExercise2;

import java.util.Scanner;

public class MakeASandwich {
	public static void main(String[] args) {
//		Make a sandwich
//		Ask user to enter two words. If the first word has even number of characters, print the first half of the
//		first word, print the second word and print the second half of the first word.
//		Input: banana
//		apple
//		Output: banappleana
//		
		
		Scanner scan=new Scanner (System.in);
	    System.out.println("Please Enter First Word");
		String word1=scan.nextLine();
		System.out.println("Please Enter Second Your Second Word");
		String word2=scan.nextLine();				
		int w1lent=word1.length();
		
				
		if (w1lent%2==0) {
		
		   System.out.println(word1.substring(0,w1lent/2) + word2 + word1.substring( w1lent/2 ));
			
		}else {			
			
			System.out.println("First Word doesn't have even number of characters");
	}
		 

		
		scan.close();
	
		
	}

}
