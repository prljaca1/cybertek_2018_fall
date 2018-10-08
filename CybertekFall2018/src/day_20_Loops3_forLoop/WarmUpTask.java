package day_20_Loops3_forLoop;

import java.util.Scanner;

public class WarmUpTask {
	
	public static void main(String[] args) {
		
//		1. Ask user to enter 2 numbers for variables start and end:
//
//			if start is less than end: loop from start position to end position
//
//			and print "Step " + number.
//
//			If start is more than end: loop backwards from end to start
//
//			and print "Step "+ number.
//
//			Ex:
//
//			Enter 2 numbers:
//
//			5 10
//
//			Step 5
//
//			Step 6
//
//			.....
//
//			Enter 2 numbers:
//
//			20 3
//
//			Step 20
//
//			Step 19
//
//			...
//
//			2. Write a program that accepts a String word
//
//			and using while loop and charAt print each char in separate line.
//
//			Ex: Enter word:
//
//			Pen
//
//			P
//
//			e
//
//			n


		Scanner scan=new Scanner (System.in);
		
//		System.out.println("Please Enter 2 numbers");
//		int start=scan.nextInt();
//        int end=scan.nextInt();
//        
//        
//        if(start<end) {
//              System.out.println("Looping Forward" );
//              while(start<=end) {
//            	  System.out.println("STEP"+ start);
//              	start++;
//              }
//       
//        }  else if(start>end) {
//        	System.out.println("Looping Backwards");
//           while(start>=end) {
//        	   System.out.println("STEP" + start);
//        	   start--;
//           }
//        }else {
//        	System.out.println("START AND END ARE EQUAL");
//        	System.out.println("Step"+ start);
//        }
//  
      System.out.println("Please Enter A Word");  
      String str=scan.nextLine();  
//      int begin=0;
//      int lentstr=str.length();
//    
//        
//      
//      while(begin<lentstr){
//     	System.out.println(str.charAt(begin));
//      	begin++;
//       }
   
        int index=0;
        while(index<str.length()) {
        	System.out.println(str.charAt(index));// or you can increment inside printout index++;
              index++;
       
        } 
        
        
        
        
        
        
        
        
        
        
        
}
        	
  }
        	
        	
        	
        
        
        
        
        
		
		
		
		
	


