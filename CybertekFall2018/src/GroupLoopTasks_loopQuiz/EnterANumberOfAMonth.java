package GroupLoopTasks_loopQuiz;

import java.util.Scanner;

public class EnterANumberOfAMonth {
	
	
	public static void main(String[] args) {
		
//		Level: very easy
//		Write a Java program which repeatedly ask the user to enter the number of the months (1 to 12).
//		If the user enters an incorrect number, Program terminates.
//		For Example:
//		Input:
//		Enter number of a month: 1
//		Enter number of a month: 5
//		Enter number of a month: 12
//		Enter number of a month: 13
//		
//		
		Scanner input=new Scanner(System.in);
		
	System.out.println("Please enter a valid number between 1- 12 : ");
	int num=input.nextInt();
	String season="";
		if(num<1 || num<13 ) {
			System.out.println("Your number is valid");
		   
		}else {
			System.out.println("Your number invalid");
		}
		
		switch(num) {
		case 1:
			season="winter";
			System.out.println(season);
			break;
		case 2:
			season="winter";
			System.out.println(season);
			break;
		case 3:
			season="spring";
			System.out.println(season);
			break;
		case 4:
			season="spring";
			System.out.println(season);
			break;
		case 5:
			season="spring";
			System.out.println(season);
			break;
		case 6:
			season="summer";
			System.out.println(season);
			break;
		case 7:
			season="summer";
			System.out.println(season);
			break;
		case 8:
			season="summer";
			System.out.println(season);
			break;
		case 9:
			season="fall";
			System.out.println(season);
			break;
		case 10:
			season="fall";
			System.out.println(season);
			break;
		case 11:
			season="fall";
			System.out.println(season);
			break;
		case 12:
			season="winter";
			System.out.println(season);
			break;
		
		default:
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
	}

}
