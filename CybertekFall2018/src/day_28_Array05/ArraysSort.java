package day_28_Array05;

import java.util.Arrays;

public class ArraysSort {
	public static void main(String[] args) {
		
		//SORT METHODS OF ARRAYS CLASS
		
		int []nums= {9,4,3,0,-4,5,3,10};
		
		for (int n:nums) {
			
			System.out.print(n+" ");
		}
		
		System.out.println();
		
	   Arrays.sort(nums);//
	   
	   for (int n :nums) {
		   
		   System.out.print(n+" ");
	   }
	System.out.println();
	String[] names= {"Said","John","Asel","Alesia","Mijat","Trariq","Z","Khalili"};
	
	// ABCDEFGHIJKLMNOPQRSTUVWXYZ
	
	Arrays.sort(names);
	
	for (String name:names) {
		System.out.print(name+" ");
		
	}
	System.out.println();
	char[]charArray= {'c','C','D','A','2'};
	
	Arrays.sort(charArray);
	
	for(char ch:charArray) {
	
	System.out.print(ch +" ");
	}
	}
	
	
	

}
