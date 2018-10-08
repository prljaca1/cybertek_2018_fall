package Homeworks;

import java.util.Scanner;

public class MiddleCharacter {
	public static void main(String[] args) {
		
//		Write a Java method to display the middle character of a string. Go to the editor
//		a) If the length of the string is even there will be two middle characters.
//		b) If the length of the string is odd there will be one middle character.
//
//
//		Input:
//		Input a string: elephant 
//		Output:
//
//		The middle character in the string: ph
//		
//		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please Enter A Word");
		String input=scan.next();
		System.out.println("Input a string: " + input);
		String MiddleCharacter="";
		int lent=input.length();
		if(lent%2==0) {
			MiddleCharacter =input.substring(lent/2-1,lent/2) + input.substring(lent/2,lent/2+1);
			System.out.println("The middle character in the string :" + MiddleCharacter);
		}else {
			System.out.println();
			MiddleCharacter=input.substring(input.length()/2,lent/2+1);	
			System.out.println("The middle character in the string :" + MiddleCharacter);	
					
					
				}
				
				
				
	}

}
