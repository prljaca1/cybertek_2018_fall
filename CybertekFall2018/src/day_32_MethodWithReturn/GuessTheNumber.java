package day_32_MethodWithReturn;

import java.util.Random;

 public class GuessTheNumber {
	//playGuessNumComputerOnly()
	//playGuessNumWithLimit(int limit )
	//playGuessNumComputerVSMe(int secretNum)
	 
public static void main(String[] args) {
		playGuessNumComputerWithLimit(10);
		playGuessNumComputerWithLimit(8);
		playGuessNumComputerWithLimit(9);
		playGuessNumComputerWithLimit(6);
    }
   public static void playGuessNumComputerWithLimit(int limit) {
		Random random=new Random();
		int secretNumber=random.nextInt(21);
		int guessNumber;
        int counter=0;
		do {
			counter++;
        System.out.println("Guess the secret number");
        guessNumber=random.nextInt(21);
        System.out.println("Guessing: "+guessNumber+" Counter:"+counter);
        //check if secretNumber matches guessNumber
        if(guessNumber==secretNumber) {
        	System.out.println("You Won!!!");
        	break;
        }else {
        	System.out.println("Wrong!! Try it again!!");
        }
        if(counter==limit) {
        	System.out.println("your limit is over!!!");
        	break;
        }
		
		
		}while(true);
        }
	
	
	
	
	
	
	
	
	

}
