package Replit;

import java.util.Scanner;

public class Arrays_ReverseSentence2 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("please write a sentence");
	    String sentence = input.nextLine();
	    
	    String reversed = "";
	    //TODO: start your code here
	    
	    String[] sentence2=sentence.split(" ");
	    System.out.print("");
	    for(int i=sentence2.length-1; i>=0;i--){
	    	System.out.print(sentence2[i]+ ((i==0)?"":" "));
	  }
	       System.out.print('"');
	    //End your code here. do not modify below statement
	    System.out.println(reversed);
	    
	  //2.solution
	
	String []str=sentence.split(" ");
	
	for (int n =str.length-1; n>0; n--) {
	   System.out.print(str[n]+" ");
      }
	  
	System.out.print(str[0]);
	
	
	
}
}
