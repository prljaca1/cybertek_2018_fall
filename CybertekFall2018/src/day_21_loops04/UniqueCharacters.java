package day_21_loops04;

import java.util.Scanner;

// find unique characters
/*
 * "java"
 *   |
 * "jav"
 * 
 */
public class UniqueCharacters {
   public static void main(String[] args) {
	
     Scanner scan=new Scanner(System.in);
     System.out.println("PLEASE ENTER A WORD");
     String word=scan.next();
     
     String unique="";
     
     for(int i=0; i<word.length(); i++) {
      // System.out.println(word.substring(i,i+1));
    	 if(!unique.contains(word.substring(i,i+1))) {
    		 unique+=word.substring(i,i+1);
    	 }
      }
          System.out.println();
         System.out.println(unique);
   
   
   
   
   
   
   
   
   
   
   
   
   
   }
  }
