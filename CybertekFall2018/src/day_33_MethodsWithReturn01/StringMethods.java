package day_33_MethodsWithReturn01;

public class StringMethods {
	public static void main(String[] args) {
	System.out.println(reverse("java"));
	
	//2.palindrome
	boolean isPal=isPalindrome("level");
	System.out.println(isPalindrome("google"));
	
	
	}
	
	/*
	 *method: reverse
	 *params: 1string 
	 * Return type:String
	 * It reverses the param string and returns the result
	 */

   public static String reverse(String original) {
	   String reversed="";
	   for(int i=original.length()-1;i>=0;i--) {
		reversed+=original.charAt(i);
	  //reversed+=original.substring(i,i+5);
	   }
	   return reversed;
   }
	/*
	 * Method :isPalindrome
	 * params: 1. string
	 * return: type boolean
	 * if param String is palindrome returns true  otherwise returns false
	 * 
	 */
  public static boolean isPalindrome(String word) {
		  String reverse="";
		  for(int i=word.length()-1;i>=0;i--) {
			  reverse+=word.charAt(i);
		  }
			  if (word.equalsIgnoreCase(reverse)) {
			   return true;
		      }
		      return false;
	  }
	
//VERSION 2 OF ISPALINDROME that will call reverse method
  
  public static boolean isPalindromeV2(String str) {
      //return reverse(str).equalsIgnoreCase(str);
      if(reverse(str).equalsIgnoreCase(str)) {
          return true;
      }
      
      return false;
  }


















}
