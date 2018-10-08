package day_20_Loops3_forLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
	
	public static void main(String[] args) {
		/*
		 * Random is class name,
		 * The purspose of this class is to generate random numbers
		 * 
		 */
		Scanner input= new Scanner(System.in);
		Random random=new Random();
		
	//System.out.println(random.nextInt(10));//give me random number 0 and 9.just positive number
//	
//	int num = random.nextInt(100);
//	System.out.println("Num Vlaue "+ num);
	
	//10-35.random.nextInt(36);
	
	int secretN=random.nextInt(10);
	int guessedN;
	
	do {
		System.out.println("Guess the Number:");
		
		guessedN=input.nextInt();
		
		if (guessedN==secretN) {
			System.out.println("Congratulations!you won");
		
		}else {
			System.out.println("Incorrect guess.Try again");
		}
	  
	}while(secretN!= guessedN);
	}	
			
			
		
}



