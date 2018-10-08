package day_21_loops04;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		/*
		 * step1-reverse the string
		 * step2-compare reversed version with original
		 * 
		 * 
		 */
		Scanner scan=new Scanner (System.in);
		System.out.println("Please Enter Word");
		String word=scan.next();
		String reversed= "" ;
	
		//StringBuilder sb=new StringBuilder(word);
	//	boolean e=word.equalsIgnoreCase(sb.reverse().toString());
		  
		                // 3
		for (int idx=word.length()-1; idx >=0 ; idx--) {
			//System.out.print(word.charAt(idx));
			reversed+=word.charAt(idx);
		}
		System.out.println(reversed);
		//System.out.println(word);
		 
		if(word.equalsIgnoreCase(reversed)) {
			 System.out.println("Palindrome");
		 }else {
			 System.out.println("Not Palindrome");
	}
		
	}

}
