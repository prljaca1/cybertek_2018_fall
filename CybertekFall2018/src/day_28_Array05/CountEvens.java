package day_28_Array05;

public class CountEvens {
	public static void main(String[] args) {
		
		int[]nums={2,1,2,3,4};
		int counter=0;
		
		for (int n: nums) {
			if (n%2==0) {
		   counter++;
		}
		}
	
	System.out.println(counter);
	
	}

}
