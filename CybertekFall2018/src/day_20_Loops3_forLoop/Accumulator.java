package day_20_Loops3_forLoop;

public class Accumulator {
	public static void main(String[] args) {
		/*
		 * write aprogram to calculate sum off all numbers
		 * between 1 and 5
		 * 1,2,3,4,5->15
		 */
		
		
		int sum =0;
		// 1,2,3,4,5_>
		for(int i=1; i<=5; i++) {
			
			sum=sum+i;
			}
		System.out.println("sum is" +sum);
	
		/*
		 * Program to calculate the sum of all odd and even numbers
		 * between 0 and 100
		 * sumOfOdds-
		 * sumOfEvens
		 * 
		 */
		
		int sumOfOdds=0;
		int sumOfEvens=0;
		
          for(int n=0; n<=100; n++) {
        	  if (n %2==0) {
        		  sumOfEvens=sumOfEvens+n;
        	  }else {
        	   sumOfOdds=sumOfOdds + n;
        	  }  
        	  
          }
		
		System.out.println("sum0f0dds" + sumOfOdds);
		System.out.println();
		System.out.println("sumOfEvens" +sumOfEvens);
		
	}

}
