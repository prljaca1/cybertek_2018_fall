package day_25_Array2;

public class SearchInArray {
	public static void main(String[] args) {
		
		int [] nums= {14,26,37,56,100,68,53,29,90,18};
		int lookfor=100;
		boolean found=false;
		
		
	for(int i=0; i<nums.length; i++) {
		
	if (nums[i]==lookfor) {
	   System.out.println(lookfor +" was found at index " + i);
	   found=true;
	   //break; // if break is active when arrays has at the same value few times just ganna give first looking for value of positions
	       }
		}
	if (!found) {
	   System.out.println(lookfor +" not found ");
	 }
			
			
	}

}
