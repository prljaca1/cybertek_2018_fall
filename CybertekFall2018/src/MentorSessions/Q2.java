package MentorSessions;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		
//		Given a string, return a string where for every char in the original, there are two chars.


//				doubleChar("The") → "TThhee"
//				doubleChar("AAbb") → "AAAAbbbb"
//				doubleChar("Hi-There") → "HHii--TThheerree"
//	
	
	Scanner user=new Scanner(System.in);
	
	System.out.print("pleASE enter a word: ");
	String word = user.next();
	
	for(int i=0; i <word.length(); i++) {
		
		System.out.print(word.charAt(i));
		System.out.print(word.charAt(i));
		
		
	
	}
	
	
	}

}
