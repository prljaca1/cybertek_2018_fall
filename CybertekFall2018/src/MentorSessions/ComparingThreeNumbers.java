package MentorSessions;

import java.util.Scanner;

public class ComparingThreeNumbers {
	
	public static void main(String[] args) {
		
		/*
		 * Aski user to input three numbers
		 * determine which
		 * is the greates
		 * print it ou
		 *
		 */
		
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter First Numbers");
	int num1=scan.nextInt();
	
	System.out.println("Enter Second Numbers");
	int num2=scan.nextInt();
	
	System.out.println("Enter Third Numbers");
	int num3=scan.nextInt();
	
	
	if( num1>num2&&num1>num3)
		System.out.println(num1);
	
	if( num2>num1&&num2>num3)
		System.out.println(num2);
	
	if( num3>num2&&num3>num1)
		System.out.println(num3);
	
	else
		System.out.println("All number are equal");
	
	
	scan.close();
	}

}
