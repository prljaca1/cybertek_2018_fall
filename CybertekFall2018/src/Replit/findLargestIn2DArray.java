package Replit;

public class findLargestIn2DArray {
	public static void main(String[] args) {
		
		
		int current=0;
		int max=0;
		 int[][] arr = {{3,5,7,9},{2,4,5,8},{12,22,32,42}};
		
		for(int outer=0; outer<arr.length; outer++) {
			
			for (int inner=0; inner<arr[outer].length; inner++) { // arr[outer].length is used 
				                                                  //not just arr.length
			
			current=arr[outer][inner];
			
			if(current>max) {
			
			max=current;
			
		}
		
	  }
	}
System.out.println("Max num" + max);
}
}