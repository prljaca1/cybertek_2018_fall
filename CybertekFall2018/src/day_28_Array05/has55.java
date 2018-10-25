package day_28_Array05;

public class has55 {
	public static void main(String[] args) {
		
//		nstructions from your teacher:
//			Given an array of ints, print true if the array contains a 5 next to a 5 anywhere in the array. 
		//If no consecutive 5s or no 5s are detected in your code then print false.
//
//			nums → [1, 5, 5, 1, 1] → true
//			nums → [1, 8, 5, 5, 0] → true
//			nums → [1, 5, 4, 1, 5] → false
//			nums → [1, 4, 4, 1, 99] → false
//	
    boolean found=false;
		int []nums= {2,4,57,5,100};
	
    for(int k=0 ;k<nums.length-1; k++) {
     
    if (nums[k]==5 && nums[k+1]==5) {
    found=true;
    break;
         
     }
      }
        	   
   System.out.println(found);

      

	
	
	
	}
}