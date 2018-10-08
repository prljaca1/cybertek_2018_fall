package LoopsMondayOCT1Projects;

import java.util.Scanner;

public class Part2Ex1 {
	public static void main(String[] args) {
		
		
//		1. Write a program that prompts the user to input a positive integer.
		//It should then print the multiplication table of that number.
//
//		Example:
//
//		Enter any positive integer: 3
//
//		Multiplication Table of 3
//
//		3 x 1 = 3
//
//		3 x 2 = 6
//
//		3 x 3 = 9
//
//		3 x 4 = 12
//
//		3 x 5 = 15
//
//		3 x 6 = 18
//
//		3 x 7 = 21
//
//		3 x 8 = 24
//
//		3 x 9 = 27
//
//		3 x 10 = 30

		 
		Scanner scan =new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int N=scan.nextInt();
		int M;
		for (int i=1; i<=10; i++) {
			if(N>0) {
			  M=N*i;
			System.out.println(N + " X " + i + " = " + M);
		     System.out.println();
			} else {
			System.out.println("Invalid Number");
			  break;
				}	
		}
		
		}
	}		
	


