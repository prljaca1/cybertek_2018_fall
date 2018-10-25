package ArrayAssignments;

public class Exercise7 {
	public static void main(String[] args) {
		
//		7)get the biggest number in an int array using a loop and print the biggest number
//	to console.
//	use this loop:
	
		int[] nums = new int[] {60,73,9,15,200,350};
	  int largest=0;
		for(int number:nums) {
			
			if(number>largest) {
				largest=number;
				System.out.println("The largest number is :"+ largest);	
					
			}
		}
		System.out.println("The largest number is :"+ largest);	
	
	}

}
