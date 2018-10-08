package LoopsMondayOCT1Projects;

import java.util.Scanner;

public class FindMaxAndMin {
	public static void main(String[] args) {
		
		

        boolean b=true;
		Scanner scan=new Scanner(System.in);
		String userInput="";
		int userNumber=0;
		int currentMaxNumber=0;
		int currentMinNumber=0;
		boolean first=true;
		
		do {
			System.out.println("ENTER A NUMBER");
		    userNumber=scan.nextInt();
		    System.out.println("Do youwant to continue?");
		    userInput=scan.next();
		    
		    if( userInput.equalsIgnoreCase("no")) {
		    	b =false;
		    }
		    
		    if(userNumber>currentMaxNumber)
		    	currentMaxNumber=userNumber;
		   
		    if(userNumber<currentMinNumber)
		    	currentMinNumber=userNumber;
		    
		    if(first) {
		    	currentMinNumber=userNumber;
		    	currentMaxNumber=userNumber;
		    	}
		 
		    first=false;
		 
		}while (b);
			
	
			System.out.println(" MAX number=" + currentMaxNumber );
			System.out.println(" MIN number=" + currentMinNumber );
			
		scan.close();
		
	}

}
