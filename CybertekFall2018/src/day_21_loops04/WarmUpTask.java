package day_21_loops04;

import java.util.Scanner;

public class WarmUpTask {
	public static void main(String[] args) {
		/*
		 * 1.ACCEPT A STRING AND IF IT IS "PALINDROME",IF NOT PRINT "NOT PALINDROME"
		 * EX;
		 * JAVA
		 * 
		 * NOT PALINDROME
		 * CIVIC
		 * 
		 *
		 * 2.ACCEPT A STRING AND CAHARACTER.FIND OUT HOE MANY TIMES THAT CAHARACTER APPEARS IN THE STRING.
		 * ENTER WORD
		 * JAVA
		 * ENTER CHARACTER
		 * A
		 * 2
		 * 
		 * 3.ACCEPT  A STRING AND PRINT ONLY UNIQUE CHARACTERS IN THE STRING.
		 * ENTER WORD
		 * JAVA
		 * JAV
		 * 
		 * COMPUTER
		 * COMPUTER
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		// 1. Task
		
//		System.out.println("please enter a word");
//		
//		 String word=scan.next();
//	     
//		 for(int i = 0; i<word.length();i++) {
//			
//			if(word.charAt(i)!= word.charAt(word.length()-i-1)) {
//				System.out.println(word + " is not palindrome");
//				return;
//				}
//			}
//		         System.out.println(word + " is a palindrome");
//		         
//		         
//		         for (int i = 0; i < word.length(); i++) {
//		             char start =word.charAt(i);
//		             char end =word.charAt(word.length()-1-i);
//		             if(start != end){
//		                 System.out.println(word + " is not a palindrome");
//		                 return;
//		             }
//		             
//		         }
//		         System.out.println(word + " is a palindrome");
//		     
		         
		         
		      //  2. task
		         
		       System.out.println("Please enter your word");
		       String theword=scan.next();
		       System.out.println("PLEASE enter your character");
		       String character=scan.next();
		       
		       int count=0;
		       
		       for(int i=0; i<theword.length(); i++) {
		    	   if(theword.contains(character)) {
		    		   count+=1;
		    		   System.out.println(" your character " +count+ " times in your string");
		    		   break;
		          }
		       }
		       
}
	
}	
	
	


