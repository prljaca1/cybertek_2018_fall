package day_22_nestedLoops;

public class NestedLoopExample {
	
	public static void main(String[] args) {
		
		/*write a program that prints numbers from 1 to 10 in same line
		 * seperated by space.For Loop
		 
		 * 2. step Add one more for loop and put everythimg from 14-17.needs to loop 5 times.
		 */
		
		
		for(int j=1; j<=3; j++) {
		
		for(int num=1; num<=10; num++) {
		   
		   System.out.print(num + " ");
	   }
	   
		System.out.println();
	}
	   System.out.println("Outside the loop");
	   
	   
	   //modify nested loop above so that it print this pattern
	   
	      for(int j=1; j<=10; j++) {                         
			        
			   for(int num=1; num<=j; num++) {
			   
			   System.out.print(num + " ");
		   }
		   
			System.out.println();
		}
		   System.out.println("Outside the loop");
		   
	 System.out.println();
	 
	// 
		
		   for(int outer=10; outer>=1; outer--) {
				
				for(int inner=1; inner<=outer; inner++) {
				
				System.out.print(inner + " ");
				}
		  System.out.println();
		   }
		   
				
	
	}
}

