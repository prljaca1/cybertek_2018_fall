package Homeworks;

import java.util.Arrays;

public class ZombieAttack2 {
	public static void main(String[] args) {
//		An array of inhabitants represent cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:
//
//			[3, 6, 0, 4, 3, 2, 2, 0]
//
//			Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.
		
		//After each day, any city that is adjacent to a zombie-ridden city will lose half of its population.
//
//			write a program to loop though each city population and make it lose half of its population if it is adjacent(right or left) to a city with zero people until all cities have no humans left. 
		
		// And print like below for each day:
//
//			Day 0 [3, 6, 0, 4, 3, 2, 2, 0]
//
//			Day 1 [3, 3, 0, 2, 3, 2, 1, 0]
//
//			Day 2 [3, 1, 0, 1, 3, 2, 0, 0]
//
//			Day 3 [3, 0, 0, 0, 3, 1, 0, 0]
//
//			Day 4 [1, 0, 0, 0, 1, 0, 0, 0]
//
//			Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
//
//			---- EXTINCT ----
//
//			Write the program in a way that it will handle any number of people in cities, above was just an example numbers to follow.


		/*
		 * Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
		 *        0  1  2  3  4  5  6  7
			Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
			Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
			Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
			Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
			Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
			---- EXTINCT ----
		 */
		
		int [] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
		int day = 0;
		int sum =0; 
		
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		
		do {
		day++;	
		sum = 0;	
		int [] inhabitantsTemp = Arrays.copyOf(inhabitants, inhabitants.length);
		
		for (int i = 0; i< inhabitants.length; i++) { //i = 7
			if (inhabitants[i] == 0 && i != 0 && i != inhabitants.length -1 ) {
				inhabitantsTemp[i-1] = inhabitants[i-1]/2; //3
				inhabitantsTemp[i+1] = inhabitants[i+1]/2; //2 
			} else if (i == 0 && inhabitants[i] == 0) {
				inhabitantsTemp[i+1] = inhabitants[i+1]/2;
			} else if (i == inhabitants.length - 1 && inhabitants[i] == 0 ) {
				inhabitantsTemp[i-1] = inhabitants[i-1]/2;
			}
	
		}
		
		for ( int i =0; i < inhabitants.length; i++) {
			inhabitants[i] = inhabitantsTemp[i];
		}
		
		for (int inhabitant :inhabitants) {
			sum = sum + inhabitant; //sum = 0 + 3 + 3 + 0 + 2 + 3 + 2 + 3 +0 = 16
		}
		
		System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
		} while (sum != 0); 
		
		System.out.println("---- EXTINCT ----");
	}

}


 