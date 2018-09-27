package day19_loops02;

import java.util.Scanner;

public class warmUp {
	public static void main(String[] args) {
		
//		1.  Write a program that takes string word and converts first letter to uppercase and the rest to lowercase. 
//		Print it after conversion.
//		2.  Write a program to print numbers from 1 to 10.
//		in same line, separated by space
//		3.  Write a program to print numbers from 10 to 1.
//		in same line, separated by space

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter A Word");
		String word=scan.nextLine();
		System.out.println(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase());
		//second solution
		word=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
		System.out.println(word);
		
		
		int num=1;
		while(num<=10) {
			System.out.print(num + " ");
			num++;
		}
		
		System.out.println("\n");//to seperate outlines
		
		System.out.println("NUM VALUE:" + num); // num is becoming 11 out of line 11 .because outside loop num
		 
		System.out.println("\n");//to seprates outlines
		
		
		 int number=10;
		while ( number>=1){
			System.out.print(number + " ");
			number--;
        }
		
		System.out.println("\n");
		
		System.out.println("NUM VALUE:" + number);// number is becoming 0 out of loop.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
