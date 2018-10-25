package Homeworks;

public class FindndUnique {
	public static void main(String[] args) {
		
		
//		 
//		Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.
//
//		Example:
//
//		nums -> [1, 1, 2, 3, 4, 3, 4]
//		         2

	
	int[]	nums = {1, 1, 2, 2, 4, 7, 4};
	
	for( int outer=0; outer<nums.length; outer++){
	      int count=0;
	      for (int inner=0; inner<nums.length; inner++){
	      if( nums[outer]==nums[inner]){
	        count++;
	      }
	    }
	    if(count==1){
	      System.out.print(nums[outer]+" ");
	    
	    }
	
	}
	}
}
