package LoopsMondayOCT1Projects;

public class Part1EX8 {
	public static void main(String[] args) {
		
//8.Write for and while loops so that they go through the odd integers (from 1 to 19), keeping track of the sum of these integers at each stage, and printing the sum at each stage.
//
//  Expected Output:  1 4 9 16 25 36 49 64 81 100
//
          
		
		
		int sum=0;
		for(int num=1; num<=20; num++) {
			
			if (num%2==1) {
				
	           sum+=num;
				
	           System.out.print(sum+" ") ;
				
			}
		
			}
			
		System.out.println();
		System.out.println();
		
			int i=1; int summa=0;
			
			while(i<=20) {
				
				if(i%2==1) {
					
					summa+=i;
					
					System.out.print(summa+ " ");
					}
				i++;
			}
			
		System.out.println();
		System.out.println(summa);
		
		
		
	}

}
