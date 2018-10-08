package GroupLoopTasks_loopQuiz;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
//		
//		Level: easy/med
//		Write a Java program which accepts a number from user and check if the number is palindrome
//		or not?
//		A palindrome number is a number which remains the same when it is reversed.
//		Input:
//		16461
//		Output:
//		Palindrome number
//		Input:
//		123
//		Output:
//		Not a Palindrome number
	
	
	
		 Scanner input = new Scanner(System.in);
	        
	        System.out.println("Please enter an integer: ");
	        int num = input.nextInt();
	        int copy = num; //12345
	        int reverse = 0;
	        
	        
	        while (copy > 0) {
	            //Multiply the reversed int by 10
	            reverse *= 10;
	            
	            //Extract last digit
	            //Add this digit to a reversed int
	            reverse += copy % 10;
	            
	            //Delete the last integer from copy
	            copy = copy / 10;
	        }
	        
	        if (num == reverse) {
	            System.out.println("The number is a palindrome.");
	        } else {
	            System.out.println("The number is NOT a palindrome.");
	        }
	 
	        input.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
