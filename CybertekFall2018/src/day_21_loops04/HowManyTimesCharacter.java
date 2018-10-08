package day_21_loops04;

import java.util.Scanner;

public class HowManyTimesCharacter {
	public static void main(String[] args) {
		
		
//		2.ACCEPT A STRING AND CAHARACTER.FIND OUT HOE MANY TIMES THAT CAHARACTER APPEARS IN THE STRING.
//		 * ENTER WORD
//		 * JAVA
//		 * ENTER CHARACTER
//		 * A
//		 * 2
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter A Word");
		String word=scan.nextLine().toLowerCase();

		System.out.println("enter your character");
		char ch= scan.next().toLowerCase().charAt(0);
		
		int counter=0;
		
		for (int i=0; i<word.length(); i++) {
			//System.out.print(word.charAt(i));
			
			if (word.charAt(i)==ch) {
				//System.out.println(" found c ");
			    counter++;
			}
	      }
		System.out.println();
		System.out.println(counter);
		
  }

}
