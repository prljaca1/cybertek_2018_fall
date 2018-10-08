package MentorSessions;

import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		
		
		
		/*
		 * Ask user to input numbers
		 * write if conditions to do determine if the number is positive, negative or zero
		 * print out the result 
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		     System.out.println("Input a number");
		     int num=input.nextInt();
		    		 
		    		 if(num>0) {
		    			 
		    			 System.out.println("This number is positive");
		    		 } else if (num<0) {
		    			 System.out.println("This number is negative");
		    		 }else {
		    			 System.out.println("The number you entered is zero");
		    		 }
	
	
	System.out.println("This number is "+((num>0)? "positive": (num<0)? "negative" : "zero"));
	
	
	input.close();
	
	}

}
