package day_23_ArrayIntroduction;

import java.util.Scanner;

public class PhoneNumberValidator {
	public static void main(String[] args) {
		String number=null;
		Scanner input=new Scanner(System.in);
		boolean valid=true;
		System.out.println("Please enter valid phone number :");
		number=input.next();
		if(number.startsWith("("))
		{
			if(')'!= number.charAt(4))
			{   valid =false;
				//System.out.println("Invalid format : Paranthesis not closed");
			}
		}
		 number=number.replace("(", "").replace(")", "").replace("-", "").replace(" ", "");
		 System.out.println(number);
		 for(int i=0;i<number.length();i++)
		 {
			if(!(number.charAt(i)>='0' && number.charAt(i)<='9')) 
			{
				System.out.println("Invalid number format !!"+number.charAt(i));
				valid=false;
			}
		 }
		 System.out.println("Number is "+(valid?"valid":"invalid"));
		 input.close();
//		 try {
//			 Long.parseLong(number);
//		 }
//		 catch(NumberFormatException e)
//		 {
//			System.out.println("Error ::"+e); 
//		 }
		 
		
		
	}

}
//(206)250-8716