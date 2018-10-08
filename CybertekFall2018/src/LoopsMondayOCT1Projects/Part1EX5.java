package LoopsMondayOCT1Projects;

public class Part1EX5 {
	
	public static void main(String[] args) {
		
//	5. Print numbers between 1 and 20 in a way that:
//a. numbers are printed with plus signs between them and a space on either side,
//
//b. there should be no plus sign or space before the first number and after the last number
//
//Expected Output:  1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 + 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20
		
	System.out.print(1);
	for (int num=2; num<=20; num++){
		
		System.out.print( " "+ "+" +" " + num); 
		
		}
	
	System.out.println();
	System.out.println();
	
	int plus=1;
	  while(plus<=20){
		  System.out.print(plus);
		  if(plus<20){
			  System.out.print(" + ");
			   }plus++;
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}

}
