package Replit;

import java.util.Scanner;

public class Arrays2D_MatchTwo {
	public static void main(String[] args) {
//		Instructions from your teacher:
//			Like in a match 3 game but not.
//
//			You get a 2d array and you need to find how many two matches there are.
//			and return the number(int) of matches you found.
//
//			For example : 1 and 2 are not a match, 2 and 2 are a match.
//			a match in this case is two numbers in a row that are equal .
//
//			for example:
//			[2,2,1,3,4,5]
//			[5,2,3,3,4,5]
//			[3,2,3,1,4,5]
//
//			print
//			matches: 2
//
//			This 2d array has 2 matches (the 2,2 in the first row and 3,3 in the second).
//
//			hint: you will need a nested for loop to loop all the array. 
//			in the if check the if the current number is equal to the next 
//			(or previous it doesn't matter), check for array boundaries before so you won't get an error.


	int [][]arr = {{4,5,5,7,8},{2,2,6,0,1},{2,1,1,3,5},{8,7,9,0,5}};
//		Scanner inp = new Scanner(System.in);
//	    int rows = inp.nextInt(), cols = inp.nextInt();
//	    int[][] arr = new int[rows][cols];
//	    for(int i=0 ;i<=rows-1;i++)
//	    {
//	      for(int j=0 ;j<=cols-1;j++)
//	      {
//	        arr[i][j]=inp.nextInt();
//	      }//end for cols
//	    }//end for rwos
//	    
	    //your code here
	    
	    int matches = 0;
	    
	    for(int outer=0; outer<arr.length; outer++) {
	    	
	    	for (int inner=0; inner<arr.length; inner++) {
	    	
	    	if (arr[outer]==arr[inner]) {
	    		matches++;
	 }
	    		
	    		
}
	    }    
	   System.out.print("matches: "+matches);
	
	}

}
