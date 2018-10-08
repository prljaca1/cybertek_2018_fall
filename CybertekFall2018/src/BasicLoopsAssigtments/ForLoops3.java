package BasicLoopsAssigtments;

import java.util.Scanner;

public class ForLoops3 {
	public static void main(String[] args) {
		
	
	 // please enter a number:
//			3
//			the multiplication table for 3 is:
//			0,3,6,9,12,15,18,21,24,27,30,
//			hint: use scanner to get the number input from the user and use a for loop that
//			runs 10 times for the calculations, and use the loop iterator with the multiplication
//			operator.         
//                
                       Scanner kb = new Scanner(System.in);
                        System.out.println("PLEASE ENTER A Number");
                   
                      int number=kb.nextInt();
             	     
                      int multip=0;	                
             	    
             	     for ( int num=0; num<=10; num++) {
             	      
             	    	 multip=number*num;
              	            
             	    	 System.out.print(multip+ ",");
             	  }
             	  
             	  }

}
