package LoopsMondayOCT1Projects;

public class Part1Ex7 {
	public static void main(String[] args) {
//		
//7.Write for and while loops so that they add up the even numbers between 1 and 20 and prints it
//
//  Expected Output:  110
//		
		int sum=0;
	for(int num=0; num<=20; num++) {
		
		if (num%2==0) {
			
			sum+=num;
		}
		}
	System.out.println(sum);
	
	System.err.println();
	
	int i=0; int summa=0;
	
	
	while (i<=20) {
			
			
		   if(i%2==0) {
			
			summa+=i;
				
			  
		   }
			
		i++;
			}
	System.out.println(summa);
	
	
	
	
	
	}

}
