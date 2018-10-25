package Homeworks;

public class ZombieAttack1 {
	public static void main(String[] args) {
//		
//		An array of inhabitants represent cities and their respective populations. For example, the following arrays shows 8 cities and 
		//their respective populations:
//
//			[3, 6, 0, 4, 3, 2, 7, 1]
//
//			Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives. 
	//  After each day, every city will lose half of its population.
//
//			write a program to loop though each city population and make it lose half of its population until all cities have no humans left. 
		//And print like below for each day:
//
//			Day 0 [3, 6, 0, 4, 3, 2, 7, 1]
//
//			Day 1 [1, 3, 0, 2, 1, 1, 3, 0]
//
//			Day 2 [0, 1, 0, 1, 0, 0, 1, 0]
//
//			Day 3 [0, 0, 0, 0, 0, 0, 0, 0]
//
//			---- EXTINCT ----
//
//			Write the program in a way that it will handle any number of people in cities, above was just an example numbers to follow.
//

		int []inhabits= {3, 6, 0, 4, 3, 2, 7, 1};
		
		int days=0;
		boolean people = true;
		//System.out.println("Day 0[ 3, 6, 0, 4, 3, 2, 7, 1  ]");
		
		while(people)
		{
			System.out.print("Day "+days +"[ ");
			int lastResult=0;
			for (int i=0; i<inhabits.length ;i++) {
				
				if(days!=0)
			   inhabits[i] /= 2 ;
			   lastResult+=inhabits[i];
				System.out.print(inhabits[i]+", ");
			}
			if(lastResult==0)
				people=false;
			days++;
			System.out.print("]\n");
			
		}
		System.out.println();
		System.out.println();

		
		
		//2.solution
		
		//		for(;people;)
//		{
//			System.out.print("Day "+days +"[ ");
//			int sum=0;
//			for (int i=0; i<inhabits.length ;i++) {
//				
//			   inhabits[i] /= 2 ;
//			   sum+=inhabits[i];
//				System.out.print(inhabits[i]+", ");
//			}
//			if(sum==0)
//				people=false;
//			days++;
//			System.out.print("]\n");
//			
//		}
//		
//		
		
		
		
		
		
		
}	
		
	}


