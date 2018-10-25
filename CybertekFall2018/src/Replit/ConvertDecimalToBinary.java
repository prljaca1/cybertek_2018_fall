package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("please enter your decimal");
		    
		     int decimal = input.nextInt();
		    
		     int[] binary = new int[8];
		    
//	int temp[]= {};
//	 
//	temp= binary ;
//	
//	int difference=2;
//	
//	
//	
//	
//	
//	for (int i=binary.length-1; i<=0; i--) {
//		
//	
//    if(i==binary.length-1 && binary[i]==1) {
//	     	
//		 temp[i]=1;
//	     decimal-=1;
//	  
//     } else if( binary[i]==0) {
//	       temp[i]=0;
//	       decimal-=0;
//           difference*=2;
//     } else {
//		  temp[i]=1;
//		  decimal-=difference;
//		  difference*=2;
//        
//	  
//	  
//     	}
//   	
//	
//	}
//	System.out.println(Arrays.toString(temp));
//	
//	
		     int [] temp= {};
		    int difference=2;
		    
			temp=binary;
		int count=0;
			
		while(decimal>0) {
	
			
		  if (decimal%2!=0 ) {
		       count++;
			   decimal-=1;
		     temp[count]=1;
		  }else{  
			 decimal -=difference;
		      difference*=2;
		      temp[count]=1;
		  }
		    }	
 
			System.out.println(Arrays.toString(temp));
			
		
	}
}