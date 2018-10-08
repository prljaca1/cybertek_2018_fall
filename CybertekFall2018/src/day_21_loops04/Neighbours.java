package day_21_loops04;

import java.util.Scanner;

public class Neighbours {
	public static void main(String[] args) {
		/*
		 * String word and you need to check for same character side by side
		 * if found say "baap-" character
		 * ex:
		 * abccddefg
		 * cc-baap
		 * dd-baap
		 * 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER YOUR WORD");
		String word=scan.nextLine();
		

//		
//		for (int n=0; n<word.length()-1; n++) {
//			
//			if (word.charAt(n)==word.charAt(n+1)) {
//				System.out.println("Beep-" + word.charAt(n));
//				 }
//		}
	
		for(int n = 0; n < word.length()-1; n++) {
			if(word.substring(n, n+1).equals(word.substring(n+1,n+2)) ) {
				System.out.println("Beep - " + word.substring(n, n+1) );
			}
		}
		
	}

}
