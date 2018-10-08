package MentorSessions;

import java.util.Scanner;

public class PrimeNumberWithMarufjon {
	public static void main(String[] args) {
		 
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("PLEASE ENTER A NUMBER");
		
		int number=scanner.nextInt();
		
		// 1 2 3 4 5 6
		
		//number which only divisible by 1and itself
		
		 //strategy : get all the numbers between 1 and the given numbers and divide the given numb by them one by one.

		// if any those numbers can divide the given number,then the given number is not prime
		
		// but if none of those numbers can divide the given number then the given NUMBER is prime
		
		// so if our given number if 6,the numbers we use to divide will be 2,3,4,6
		
		
		for (int i = 2 ; i < number; i ++) {
			System.out.println(i);
			
			int remainder=number%i;
			
			if (remainder == 0 ) {
				System.out.println("Not Prime");
				System.out.println("it was divided by:" + i);
				break;
				
				
}

			
		
		
}
		
		
	}
}