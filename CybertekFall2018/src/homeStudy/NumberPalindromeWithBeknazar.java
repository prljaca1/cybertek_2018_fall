package homeStudy;

import java.util.Scanner;

public class NumberPalindromeWithBeknazar {
	
	 public static void main(String[] args) {
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
	 
	        
	        
}
	 
}



