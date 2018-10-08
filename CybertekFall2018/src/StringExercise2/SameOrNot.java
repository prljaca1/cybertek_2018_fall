package StringExercise2;

import java.util.Scanner;

public class SameOrNot {
	
	public static void main(String[] args) {
//		Same or not
//		Ask user to enter a word. Print true is the first and last characters of the string are same characters, print
//		false otherwise.
//		Input: abba
//		Output: true
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter A Word");
		String w1=scan.nextLine();
		int lent=w1.length();
//		String first = w1.substring(0);
//		String last=w1.substring(-1);
//		
//		if (first==last) {//inside if condition you can not use string !!! xxxx !!!8520.
		
		
		
		
		

//		
//		System.out.println("True");
//		
//		}else {
//			
//			System.out.println("False");
//		}
		
		char first=w1.charAt(0);
		char  last=w1.charAt(lent-1);//finding the  last character  in char type  you must use length();
		
	if (first==last) {  
		
//	or	if (w1.charAt(0)== w1.charAt(w1.length()-1)) { 
		

		
			System.out.println("True");
			
			}else {
				
				System.out.println("\n");
			
		   System.out.println("False");
		  
		   
		   
		   
		   scan.close();
		   
		
			}	
	}
	}

