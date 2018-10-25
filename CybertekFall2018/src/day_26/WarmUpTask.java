package day_26;

public class WarmUpTask {
	public static void main(String[] args) {
//		
//		1) Write a program called IncrementArrayValues:
//
//			1. Declare array nums and assign {1,2,3,4,5,6,7,8,9}
//
//			2. Print out all values in single line separated by space:
//
//			1 2 3 4 5 6 7 8 9
//
//			3. Using a Loop write some code to do the following:
//
//			       if the value is even - double it and assign back. If the value is odd - triple it and assign back.
//
//			4. Print out all values in single line separated by space:
//
//			3 4 9 8 15 12 21 16 27


	// 1 and 2	
		int [] numbers= new int[] {1,2,3,4,5,6,7,8,9};
		
		for(int n:numbers) {
			
			System.out.print(n+ " ");
		}
		System.out.println();
		//3//
		
	System.out.println();
	for(int k=0; k<numbers.length ; k++) {
			
	if(numbers[k] %2==0) {
			
	numbers[k]=numbers[k]*2;
				
	}else {
			
	numbers[k]=numbers[k]*3;
	 }
	
	//numbers[k] = (numbers[k] % 2 == 0) ? numbers[k] * 2 : numbers[k] * 3;
	
	}
	for( int num:numbers) {
	System.out.print(num+" ");
			
}
		
		
		
		
	}

}
