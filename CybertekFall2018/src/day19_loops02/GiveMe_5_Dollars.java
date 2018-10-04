package day19_loops02;

import java.util.Scanner;

public class GiveMe_5_Dollars {
	public static void main(String[] args) {
		
		/*
		 * Ask for 5 dollars
		 * and keep asking for 5 dollars until you get it.
		 * or user enters it
		 */
		
		Scanner input=new Scanner(System.in);
	   int tries=1;// it should give chance to give max $5 3 times
		int amount ;
		
		do {
			
			System.out.println("Give me 5 Bucks");
			tries+=1;
		amount=input.nextInt();
		
		}while(amount!=5 && tries<=3);
		
			if(amount==5)
			{
			    System.out.println("THANK YOU FOR $ 5 ");
		} else {				 
			
			System.out.println("You tried 3 times");
			}
//			
//				
//			do {
//				tries+=1;
//				System.out.println("Give me 5 Bucks"); 
//			amount=input.nextInt();
//			
//			}while(amount!=5 && tries<=3);
//				
//				System.out.println(tries>=3?"You  tried more than 3 times":"THANK YOU FOR $ 5");
//				
//	
			input.close();
			
			
	}
} 


