package day_26;

public class UniquePrint {
	public static void main(String[] args) {
//		Given an array of ints nums
//
//		[1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4]
//
//		Using a nested loop print only values that appear once(true meaning of unique):
//
//		1 44 12 20 33
//
//		Do not use any strings!
//	
	
	int []nums= {1, 2, 3, 4, 2, 3, 4, 44, 12, 20, 100, 33, 100, 4};
	
	for (int outer=0; outer<nums.length; outer++) {
		int currentNum=nums[outer];
		boolean duplicate =false;
		
		
		for (int inner=0; inner<nums.length; inner++) {
	         if(nums[inner]==currentNum && outer!=inner) {
	        	duplicate=true;
	        	break;
	        
	         }
	      }			
		  if (duplicate==false) {
			System.out.print(currentNum+ " ");
			
			}
	}	
		
	      System.out.println();
	      System.out.println();
	
	
	// 2.solution
	
	for (int i = 0; i < nums.length; i++) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] == nums[j]) {
                count++;
            }
        }
        if (count == 1) {
            System.out.print(nums[i] + " ");
        }
    }
	
	
	}

}
