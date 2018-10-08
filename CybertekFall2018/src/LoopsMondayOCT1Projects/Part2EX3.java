package LoopsMondayOCT1Projects;

import java.util.Scanner;

public class Part2EX3 {
	public static void main(String[] args) {
		
//		Write a program that prompts user to enter to enter the numbers till the user wants (by asking if user wants to continue) and at the end the program should display the largest and smallest numbers entered.
//
//		Example1:
//
//		Enter the number 8
//
//		Do you want to continue y/n? n
//
//		Largest number: 8
//
//		Smallest number: 8
//
//		Example 2:
//
//		Enter the number 7
//
//		Do you want to continue y/n? y
//
//		Enter the number 2
//
//		Do you want to continue y/n? y
//
//		Enter the number 9
//
//		Do you want to continue y/n? n
//
//		Largest number: 9
//
//		Smallest number: 2
//

	
		// ask users to number and every time ask to wants continiu
				//find max number
		// ask users to number and every time ask to wants continiu
				//find max number
				
		
		
		        int max=0;
				int min=0;
				String answer="y";
				Scanner scan=new Scanner(System.in);
			do {
				System.out.println("Please enter a number");
				int number=scan.nextInt();
				System.out.println("do you want to continiu ? Y 0r N ");
				 answer=scan.next().toLowerCase();
				max=Math.max(number, max);
				min=Math.min(number, min);
						
			}while(answer.equals("y"));
			System.out.println("Largest number"+ max);
			System.out.println("Smallest number" + min);
			scan.close();
			
			}
				
				
				
			
		
		
		
		
		
	}


