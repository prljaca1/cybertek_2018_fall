package GroupLoopTasks_loopQuiz;

import java.util.Scanner;

public class LargestAndSum {
	public static void main(String[] args) {
		
//		Write a Java program that reads in 3 numbers from the user in a loop (one at a time)
//		And prints largest number and the summation of all numbers
//		Input:
//		Enter number 1: 10
//		Enter number 2: 20
//		Enter number 3: 30
//		Output:
//		Largest number = 30
//		Sum = 60
//		
//		
	  int num,largest=0;
	  long sum=0;
	  Scanner scan = new Scanner(System.in);
	 
	  for(int i=1; i<4; i++)
	  {
		  System.out.println("Enter number "+i+": ");
		  num=scan.nextInt();
		  if(num>largest)
			  largest=num;
		  
		  sum+=num;
		  		  
	  }
	System.out.println("Largest number = "+largest);
	
	
	System.out.println("Sum = "+sum);
		
		
	scan.close();
	  

	}

}
