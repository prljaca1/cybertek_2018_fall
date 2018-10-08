package BasicLoopsAssigtments;

public class WhileLoop7 {
	public static void main(String[] args) {
		
//		7) create a rectangle pattern using the star character (*) using loops (while or for):
//			*******
//			*******
//			*******
//			*******
//			
//       hint: you will need to use two loops to create this, one for the rows and the inner
//			for the columns.
//			before the loop create a string to hold the final product, inside the inner loop add a
//			* so the string something like : str +="*";
//		
		
	
		
		for( int rows=1 ; rows<=4; rows++) {
			
		 for(int columns=1; columns<=7; columns++) {
			  	
			  System.out.print ("*");
			  
				}
			    
			    if( rows != 4) {
			    	System.out.println();
			    }
			    
		   }
		
		System.out.println();
		System.out.println();
		
		// 2.solution with while loop
		
//		int rows=1;
//		int columns=1;
//		String str="*";
//		 
//		while(rows<=4) {
//			
//			if (columns<=7) {
//				
//				System.out.print("*");
//			}
//			else if (rows!=4) {
//				
//				System.out.println();
//			}
//		  
//		}
		
		
		
		
		
		
		
		
	}

}
