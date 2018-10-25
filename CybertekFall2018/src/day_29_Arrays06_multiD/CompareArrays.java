package day_29_Arrays06_multiD;

import java.util.Arrays;

public class CompareArrays {
	public static void main(String[] args) {
		//1.senorio
		int[]arr1= {56,23,656,67};
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2= arr1;
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr1==arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		
		System.out.println("===============================================");
	//2.senoria
	
		int[]arr3= {56,23,656,67};
		
		// check if arr1 and arrr3 looking at same memory location
		System.out.println(arr1=arr3);//false
	   //test values in 2 arrays
		System.out.println(Arrays.equals(arr1, arr3));//it is gonna be *true* because same and data same .it doesn't look the same location of elements
	
	
	    String str1=new String("hello");
	    String str2=new String("hello");
	    
	    System.out.println(str1==str2);//false
	    System.out.println(str1.equals(str2));//true
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
