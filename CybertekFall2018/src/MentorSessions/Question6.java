package MentorSessions;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
//		Enter a word and check if it is palindrome
//
//		Output
//		Enter a string: noon
//		noon is a palindrome
//
//		Enter a string: moon
//		moon is not a palindrome
//	
		
	Scanner user=new Scanner(System.in);
	
	System.out.println("ENTER A WORD TO CHECK IF IT IS PALINDROME : ");
	String word=user.nextLine();
	int counter=1;
	
	for(int i =0; i<word.length();i++) {
		
		if(word.charAt(i)!= word.charAt(word.length()-i-1)) {
			System.out.println(word + " is not palindrome");
			return;
			}
		}
	         System.out.println(word + " is a palindrome");
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
