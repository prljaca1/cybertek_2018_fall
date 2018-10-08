package MentorSessions;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(2);
		
		  // Command + Alt + R is shortcut rename
       
		for (int number = 3; number < 100; number++) {
            
            for (int j = 2; j < number; j++) {
                if(number % j ==0)
                    break;
                if(number-1 ==j)
                    System.out.println(number);
            }
            
        }
    
	
	
	
	
	
	
	
	
	
	}
}