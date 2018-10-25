package ArrayAssignments;

public class Exercise6 {
	public static void main(String[] args) {
		
//	      6)print to console the sum of this int array:
//			int[] nums = new int[] {6,7,11,12,2,3};
	
		int[] nums = new int[] {6,7,11,12,2,3};
				
	int sum=0;
	for(int n : nums) {
		sum+=n;
		System.out.println("Sum of the array is :" + sum);
	}
    
//	System.out.println("Sum of the array is :" + sum);
	
	
	}

}
