package day_23_ArrayIntroduction;

import java.util.Scanner;

public class AreaCode {
	public static void main(String[] args) {

//		Program AreaCode to accepts phone number in one of two formats: (202)3334444 or 2023334444.
//
//		Extract area code using substring and use switch case to find out what state it is and assign city name to state variable.(no loop needed).Print state name.
//
//		ZipCode	State
//		202	Washington DC
//		703	Virginia
//		209	California
//		312	Illinois
//		347 New York
//		Others	Not in database
//		

		//1.Task
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER PHONE NUMBER");
		String phonenumber=scan.next();
		String areacode="";
		
	     if (phonenumber.startsWith("(")) {
	    	
	    	 areacode=phonenumber.substring(1,4);
	      }else {
	    	  areacode=phonenumber.substring(0,3);
	      }
	    	System.out.println(areacode);
	    	
            String state="";
	    	switch(areacode) {
	    	
	    	case "202" :
	    		state ="Washington DC";
	    	    break;
	    	case "209":
	    		state= "California";
	    		break;
	    	case "312":
	    	   state= "New York";
	    	case "347":
	    		state= "";
	    	case "703":
	    		state= "Virginia";
	    		break;
	    	default:
	    	 System.out.println("Not in Database");
	    	
	    		}
	    	System.out.println(state);

//	      2.
	  
//	  Program PhoneNumberValidator -  simple phone number format check.
	  
//	    Accepts phone number in one of two formats: (202)3334444 or 2023334444
//	    Checks:
//	   - if length is not 12 or 10 characters, then -> show error message : invalid length - must be either 12 or 10 characters.
//	 	- If first character is '(' then 1. fifth character must be ')' -> if not show error message: Invalid format -there is no closing parenthesis.
//	    - Get rid of parentheses using replace method - code:
//	    phoneNumber = phoneNumber.replace( "(", "");
//	    phoneNumber = phoneNumber.replace( ")", "");
//	    - Using a loop check if each character is a number between 0-9. -> if not show error message: Invalid character - must be a number between 0-9.
	    	
	    	System.out.println("Please Enter Phone NUmber");	
	    	
	    	String number=scan.next();
	    	 
	    	if (number.startsWith("(")) {
	    		if (number.length()!=12)
	    		System.out.println( "Invalid length-must be either 12 or 10 characters");
	    	  return;
	    	}
	
	     else {
	    	
	  if( number.length()!=10) {
	     System.out.println( "Invalid length-must be either 12 or 10 characters");
	    return;
	   }
	 }	 
	    		
	         System.out.println("Phone Number's length is good");
 // If first character is '(' then 1. fifth character must be ')' -> if not show error message: Invalid format -there is no closing parenthesis. 
	    	 
	  if (number.charAt(0) =='('){
	    		 
	   if(number.charAt(4) != ')') {
	    		 
	    System.out.println("Invalid format - there is no closing parenthesis");
	    return;
	    		 
	    	}	 
	     }
	       System.out.println("Parenthesis format check passed");
	     
		
		   number = number.replace( "(","");// ifthere is '(' then remove it
		  
	       number = number.replace( ")","");// if there is ')' then remove it
		
	       number = number.replace( "-","");// remove dashes
	    
	       number = number.replace( " ","");// remove spaces
	       
	      
	       for(int i=0; i<number.length(); i++) {
	    	   
	    	   if( !( number.charAt(i)>= '0' && number.charAt(i)<='9') ) {
	    	  
	    		System.out.println("Invalid character - must be a number between 0-9");
	    	   return; 
	    	}
	       }
		     
	       
	       System.out.println("All numbers detected");

	}

}
