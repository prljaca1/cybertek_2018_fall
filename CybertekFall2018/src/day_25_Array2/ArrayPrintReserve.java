package day_25_Array2;

public class ArrayPrintReserve {
	public static void main(String[] args) {
		
	
	
	/*
	 * create int array  scores and assign 10 difeerent numbers
	 * between 0 and 100 
	 * 
	 * 
	 */

	
	int [] scores =new int [] {10,34,78,98,67,89,45,78,65,20};
	// check if 10 points and say 10 points found
	
	if (scores.length==10) {
		System.out.println("10 scores found");
	}else {
		System.out.println("We need 10 points");
	}

	
	
   for (int idx=scores.length-1; idx>=0; idx--) {
	
	System.out.print(scores[idx]+ " ");
	
	}
	
	System.out.println("\n-----While Loop-----");
	
	int i=scores.length-1;
	
	while(i>=0) {
		
		System.out.print(scores[i]+ " ");
		i--;
	}
	
	
	
	
	
	
	
	}
}