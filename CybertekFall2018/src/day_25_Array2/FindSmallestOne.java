package day_25_Array2;

public class FindSmallestOne {
	public static void main(String[] args) {
		
		/*
		 * create nums and assign several values
		 * print the smallest value in array
		 */
		
	int []numbers= {23,67,-98,567,2098,-123,345};
	int smallest= numbers[0];
	for (int n : numbers) {
			
	 if (n < smallest) {
		 smallest=n;
			
		}
	}
	 System.out.println(smallest);
	
	
	
	
	
	
	}
}
