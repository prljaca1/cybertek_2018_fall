package LoopsMondayOCT1Projects;

public class Part1EX4 {
	
	public static void main(String[] args) {
		
		
//		4.Write for and while loops so that they print the square of each odd number from numbers between 1 and 20.
//
//        Expected Output:  1 9 25 49 81 121 169 225 289 361
//		
		
	for (int num=1; num<=20; num++) {
		
		if (num%2==1) {			
			System.out.print(num*num + " ");			
			}
	
	}
	
	
	System.out.println();
	
	int i=1;
	
   while (i != 20) {
		
		
	   if(i%2==1) {
		
		System.out.print(i*i + "  ");
			
		  }
		
		i++;
		
	}
	
	
	
	
	}

}
