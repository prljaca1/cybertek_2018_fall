package StringExercise2;

import java.util.Scanner;

public class PrintNameWithHi {
	public static void main(String[] args) {
//		Say hi
//		Ask user to enter a name. Print Hi <name>!
//		Input: Bob
//		Output: Hi Bob!
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Please Enter Your Name");
	String name=scan.nextLine();
	
	System.out.println(" Hi! " + name.substring(0,1).toUpperCase()+name.substring(1));
	
	scan.close();
	
	
	
	
	
	}

}
