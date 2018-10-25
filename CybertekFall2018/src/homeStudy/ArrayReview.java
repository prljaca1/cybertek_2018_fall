package homeStudy;

import java.util.Arrays;

public class ArrayReview {
	public static void main(String[] args) {
		
		    //length   //1  2  3   4  5
		int [] numbers= {23,45,67,78,90};    // int numlent=numbers.length;
		       // index  0   1  2  3  4
		
	//	numbers[0]=23;
		//numbers[1]=45;
		
		
		
		
	                 
		
		
	//	System.out.println(numbers[4]);
	
	
	//for(  int  k  : numbers) {
	
	//System.out.println(k);
	
	
//	System.out.println(numbers[numbers.length-3]);
	
	
	
	//for(int idx=0; idx<numbers.length; idx++) {
	
	//System.out.print(Arrays.toString(numbers));
	
	
	
		System.out.println("-----EXAMPLE RUN ---------");
	    
		String[] number = {"zero", "one", "two","three","four"};
	    System.out.println(Arrays.toString(getWithE(number)));
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	    //just work with arr array.And loop through each element.
	   int counter=0;
			
			for(String str:arr) {
				if( str.contains("e")) {
					counter++;
				}
			}
			System.out.println(counter);//3
		//create array fewValues,with size of counter
			
			String[]fewValues=new String[counter];
		
			//go over arr one more time and add the words with 'e' into fewValues
		     
			int i=0;
				
			for(String each:arr) {
				if (each.contains("e")){
				fewValues[i]=each;
					i++;
		 }
	  }
		for( String val:fewValues) {
			System.out.println(val+ " ");
		}
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	  }
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

