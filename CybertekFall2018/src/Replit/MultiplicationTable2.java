package Replit;

import java.util.Arrays;

public class MultiplicationTable2 {
	
	public static void main(String[] args) {
		
		int [][]multiplicationTable= new int [10][10];
		for(int r=1; r<=10; r++) {
			for(int c=1; c<=10; c++) {
				
		multiplicationTable[r-1][c-1]=r*c;
				
				
				
			}
		}System.out.println(Arrays.deepToString(multiplicationTable));		

	
		
		int grid2[][]= new int [10][10];
		
		int e=1;
		
		for(int outer=0; outer<=10; outer++) {
		
		for (int inner=0; inner<=10; inner++) {
			grid2[inner][outer]=(inner+1)*e;
		}e++;
		}e=1;
		
		int[][] array1=new int[10][];
		array1[0]=new int [2];
		array1[0][0]=1;
		
		System.out.println();

	}

}
