package GroupLoopTasks_loopQuiz;

import java.util.Scanner;

public class EachCharacterPrintTwoTimes {
	
//	Write a Java program which accepts a string from user and print the string such that each
//	character in the string is printed two times.
//	
//	Input:
//	Hello
//	Output:
//	HHeelllloo
//	
//	Input:
//	Hi-there
//	Output:
//	HHii--tthheerree

public static void main(String[] args) {
	
	Scanner scan= new Scanner(System.in);
	
	System.out.println("Please Enter A Word");
	String word=scan.next();
	
	String result="";
	
    
	int i=0;
	
	
	         while(i<word.length()) {

           char c = word.charAt(i);

              result=result+c+c;

             i++;
            }
	         System.out.println(result);
}

	
	
	
	
	
	
	
	
	
}



















