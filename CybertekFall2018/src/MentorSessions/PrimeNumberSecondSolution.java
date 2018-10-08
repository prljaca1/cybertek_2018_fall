package MentorSessions;

import java.util.Scanner;

public class PrimeNumberSecondSolution {
	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		
		
		
		int counter = 0;
		
		for (int i = 1; i <= num; i++) {
			
			if (num % i == 0) {
				counter ++;
				if (counter > 2)
					break;
			}
				
		}
		
		
		if (counter <= 2)
			System.out.println("True");
		else
			System.out.println("False");
		
		
		
		
	}

}
