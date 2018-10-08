package homeStudy;

import java.util.Scanner;

public class HomeworkNumberPalindrome {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please A number");
		String number=scan.next();
		String reversed="";
		
		for(int idx=number.length()-1;idx>=0; idx--) {
			reversed+=number.charAt(idx);
			}
		System.out.println(reversed);
		
		 if(number.equals(reversed)) {
			 System.out.println("Palindrome");
		 }else {
			 System.out.println("Not a Palindrome");
		 }
		
	}

}
