package day_20_Loops3_forLoop;

import java.util.Random;
import java.util.Scanner;

public class GuessANumberV2 {
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		Random random=new Random();
		
	
	int secretNumber=random.nextInt(100);
	int guessedNumber;
	//only 5 cahances to guess
	int tries=0;
	do {
		System.out.println("Guess the number:");
		guessedNumber = input.nextInt();
		tries++;
		
		if(guessedNumber == secretNumber) {
			System.out.println("Congratulations! You won!");
			
			
		}else if(guessedNumber > secretNumber) {
			System.out.println("Too large");
		}else {
			System.out.println("Too small");
		}
		
		if(tries==5) {
			System.out.println("YOU LOST");
			System.out.println("Secret number"+ secretNumber);
			
		}
		
	}while(secretNumber != guessedNumber && tries<=5);
	
	
  
}
}

