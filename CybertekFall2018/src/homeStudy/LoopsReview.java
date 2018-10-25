package homeStudy;

import java.util.Scanner;

public class LoopsReview {
	public static void main(String[] args) {
		
		
		//2) write a program that calculates the sum of numbers from 1 to 100
		//(1+2+3+4+5...+100 ). using a for loop. output the sum after the loop.
		
		int i=1;
		
		int sum=0;
		
		while(i<1000) {
			sum+=i;
			//System.out.print(sum + "+");
			
			i++;
			
		}
	System.out.println();
		System.out.println(sum);
		
	
//		9) create a program that asks a user to write something, prints you wrote:(what the
//				user wrote) until he writs exit. use a while or do while for that:
//				write somthing:
//				bla
//				you wrote: bla
//				write somthing:
//				123
//				you wrote: 123
//				write somthing:
//				exit
//				hint: use a boolean(set to true) inside the while argument like while(is_running).
//				inside the loop get the user input using a scanner, then check if the user input
//				equals "exit" if it dose set the loops boolean to false.
//	
	
	boolean flag=true;
	
	Scanner scan=new Scanner(System.in);
	
	   while(flag) {
	
    System.out.println("please write something");
	String str=scan.next();
	System.out.println("you wrote: " + str );
	
	   if( str.equals("exit")) {
		   flag=false;
		  break;  
	        
	   }
	}
	
	System.out.println("good bye");
	
	}

}
