package StringExercise2;

import java.util.Scanner;

public class IgnoreTheFirstOnes {
	public static void main(String[] args) {
		
//		Ignore the first ones
//		Ask user to enter two words. Print first word without its first character then print the second word
//		without its first character.
//		Input: apple
//		banana
//		Output: ppleanana
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Please Enter First Word");
		String w1=scan.nextLine();
		System.out.println("Please Enter Second Word");
		String w2=scan.nextLine();
		
		
		System.out.println(w1.substring(1)+w2.substring(1));//or
		
		System.out.println("\n");
		
		System.out.println(w1.substring(1).concat(w2.substring(1)));
		
		scan.close();
	}

}
