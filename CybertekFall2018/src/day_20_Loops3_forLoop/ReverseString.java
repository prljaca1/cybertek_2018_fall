package day_20_Loops3_forLoop;

public class ReverseString {
	public static void main(String[] args) {
		/*
		 * take a string variABLE word.
		 * and reverse it using for loop
		 * ex:
		 * java
		 * avaj
		 * civic
		 * 
		 * 
		 */
	
	String word="java";//you can cahnge the word
	
	String reversed= "";
	
	//using for loop-loop from length of word -1 until 0
	//and use either charAt or substring and add that character
	//to reserved string
	
	for(int idx=word.length()-1; idx >= 0 ; idx--) {
		reversed=reversed+word.charAt(idx);
		}
	
	System.out.println(reversed);
	
	
	
	}
	
	
	

}
