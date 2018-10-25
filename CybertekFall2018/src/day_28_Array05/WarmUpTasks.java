package day_28_Array05;

import java.util.Arrays;
import java.util.*;
public class WarmUpTasks {
	public static void main(String[] args) {
//		Instructions from your teacher:
//			Given a String array words, iterate through each word and print first and last letter of each element in separate lines.
//
//			Example:
//
//			words → ["hello", "why", "by", "apple" , "note"]
//			print: 
//			       ho
//			       wy
//			       by
//			       ae
//			       ne

		 
		    String[] words = {"hello", "why", "by", "apple" , "note"};
		    for(String str:words) {
		    	
		    	//System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
		    //	System.out.print("-------");
	//	2.solution    	//System.out.print(str.substring(0,1)+str.substring(str.length()-1)); with substring
		    }
		    
		    
		   
//2.
		    
		    for (int i=0; i<words.length;i++) {
		    	
		 //  System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1)); 	
		    	
		   	
		    words[i]=words[i].substring(0,1)+words[i].substring(words[i].length()-1); 	
		   
		    	
		    	
		    }
		    
		    System.out.println(Arrays.toString(words));
		    
		
		
		
		
	
	

	
	
	}
	
}