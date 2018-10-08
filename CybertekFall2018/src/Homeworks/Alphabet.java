package Homeworks;

import java.util.Scanner;

public class Alphabet {
	
	public static void main(String[] args) {
//		Write a Java program that takes the user to provide a single character from the alphabet. 
//		Print Vowel or Consonant, depending on the user input. 
//		If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//
//		Input:
//		Input an alphabet: b
//		Output :
//		Input letter is Consonant
	
	Scanner scan= new Scanner(System.in);
	System.out.println("Please Enter A Single Character From Alphabet : ");
	
	String vowels="AEIOU";
	
	String letter=scan.next();
	
	if (!(letter.toUpperCase().charAt(0)>='A' && letter.toUpperCase().charAt(0)<='Z'))
	{
		System.out.println("Error : Input is not letter !");
		
	}
	else if (letter.length()>1)
	{
		System.out.println("Error: Input has to have one character !");
	}
	else if(vowels.contains(letter.toUpperCase()))
	{
		System.out.println("Letter is vowel !");
		
	}
	
	else
	{
		System.out.println("Letter is consonant !");
		
	}		
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
