package day_22_nestedLoops;

public class Homework_Pattern {
	public static void main(String[] args) {
		
		
//		1
//		1 2
//		1 2 3                                           //
//		1 2 3 4
//		1 2 3 4 5
//		1 2 3 4 5 6
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		
		

		
		
		
		
	   for (int outer=1; outer<=10; outer++) {
			
		   
			for (int inner =1; inner<=outer; inner++)  {
				
				System.out.print(inner + " ");
			}
			    
			
			
			
		System.out.println();
	   }	
				
	      for( int outer=9; outer>=1; outer--) {
		   
		   for( int inner=1; inner<= outer; inner++) {
			   
			   System.out.print(inner+ " ");
		   }
		   
		      System.out.println();   
		   
	   
	      
	      }    
	
	
	
	
	
	
				
				
	
		
		
		
		
}	

}
