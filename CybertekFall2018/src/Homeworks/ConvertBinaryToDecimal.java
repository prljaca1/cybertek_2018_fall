package Homeworks;

import java.util.Scanner;

public class ConvertBinaryToDecimal {
	
	public static void main(String[] args) {
		
//		Binary number is a number expressed in the base-2 numeral system or binary numeral system, which uses only two symbols: typically 0 (zero) and 1 (one). 
//Each digit is referred to as a bit.
//
//
//Given an array binary with 8 integers (0s or 1s), write java program to calculate decimal value and print out to console. 
//Feel free to use additional arrays or formulas.
//
//Example:
//binary -> [0, 0, 0, 0, 0, 0, 1, 1]
//print 3
//
//binary -> [0, 0, 1, 0, 0, 0, 1, 1]
//print 35
//
//binary -> [1, 1, 1, 1, 1, 1, 1, 1]
//print 255
	
	
		
		    
		  
	

		    
//	int binaryValue=1;
//	int sum=0;
//	
//	for(int idx=binary.length-1;idx>=0; idx--) {
//		
//        if(binary[binary.length-1]==1) {
//		sum+=binaryValue;
//		
//        }else if(binary[binary.length-1]==0) {
//         sum+=0;
//       
//        }else  if( binary[idx]==1) {
//    	   sum+=binaryValue;
//	  
//        }  else if(binary[idx]==0){
//	       sum+=0;
//	       binaryValue*=2;   
//           }
//       
//	}
//	System.out.println(sum);
	

//		    int[] binary = {0,0,0,0,0,1,1,0};
//		  
//		int decimal=1;
//		int sum=0;
//		
//		for(int idx=binary.length-1;idx>=0; idx--) {
//			
//		
//		if(binary[idx]==1) {
//		sum+=decimal;
//		decimal*=2;
//			}else {
//	    sum+=0;
//	    decimal*=2;
//	
//	}
		
//		double[] binary = {0,0,1,0,0,1,0,0};
//		double sum=0;
//		for(int i=0;i<=binary.length-1;i++)
//		{
//			if(binary[i]==1)
//			{
//				double currSum=1;
//				for (int j=binary.length-1;j>i;j--)
//				{
//					currSum*=2;
//				}
//				sum+=currSum;
//			}			
//		}
//		System.out.println(sum);
//		
		int[] binary = {0,0,0,0,0,1,1,0};
		long currVal=0,sum=0;
		int pow=1;
		for(int i=binary.length-1;i>=0;i--)
		{
			pow*=2;
			if(binary[i]==1)
			{
				currVal+=pow;
			}
			sum+=currVal;
			currVal=0;
		}
		System.out.println(sum);
		
		
	}
}