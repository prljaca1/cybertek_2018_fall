package day_4_operators;

import java.util.Scanner;

public class TemparatureConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	// from Fahrenheit to Celcius converter
		
		System.out.println("Enter a value in Fahrenheit");
		double fahrenheit = scan.nextDouble();
		
		double celcius = (5.0 / 9) * (fahrenheit - 32);
		
		System.out.println("Temperature in Celcius: " + (int)celcius);
 //	 from celcius to Fahrenheit Converter
		System.out.println("\n");
		System.out.println("Enter a value Celcius");
	double cel= scan.nextDouble();
	
	double fah= ( 9/5.0)*cel + 32;
	
	System.out.println("Temperature in  Fahrenheit : " + (int)fah);
	
	
//	int Cybertek=380;   int CybetrtekStudents=Cybertek-- +1;   
//	System.out.println(CybetrtekStudents-Cybertek);
//	
	
	
	
	
	}
	

}
