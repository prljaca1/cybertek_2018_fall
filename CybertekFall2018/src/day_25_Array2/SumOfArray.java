package day_25_Array2;

public class SumOfArray {
	public static void main(String[] args) {
		/*
		 * create variable nums - assign several values
		 * using  a loop calculate the sum and print it
		 * Additional steps:
		 * -calculatesum
		 * -use loop
		 * Additional 
		 * calculate aum of even numbers
		 *calculate sumo
		*/
		
		int []numbers= {23,45,67,89,34,-56,};
		int sum=0;
		int sumOfEvens=0;
		int sumOfOdds=0;
		for (int num : numbers) {
			
			sum+=num;
		
		
		
		 if (num%2==0) {
			 sumOfEvens+=num;
		 }
	
	     if( num%2==1) {
	    	sumOfOdds+= num;
	     
	  }
	     }
	     System.out.println("SUM:" +sum);
	     System.out.println("Sum Of Odds:" +sumOfOdds);    
	     System.out.println("Sum Of Even:" +sumOfEvens);
	
	
	
	
	
	
	
	}

}
