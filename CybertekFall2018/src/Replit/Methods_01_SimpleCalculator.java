package Replit;

import java.util.Scanner;

public class Methods_01_SimpleCalculator {
	
	public static void main(String[] args) {
		
	 plus();
	  
	
	
	}
	 
	 //	create a static method called "plus", its return is void and it gets no arguments.
//
//			It asks the user to input two numbers, then it will add them and print the result.
//			Create a scanner within plus method.
//
//			Example:
//
//			enter first number:
//			1
//			enter second number:
//			2
//			result: 3


public static void plus() {
	Scanner scan=new Scanner(System.in);
    System.out.println("Please enter first number");
	int first=scan.nextInt();
	System.out.println("Please enter second number");
	int second=scan.nextInt();

	int result=first+second;
    System.out.println("result : " +" "+result );

}






}
