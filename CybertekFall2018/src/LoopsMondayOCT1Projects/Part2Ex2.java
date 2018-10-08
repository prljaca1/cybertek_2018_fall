package LoopsMondayOCT1Projects;

import java.util.Scanner;

public class Part2Ex2 {
	public static void main(String[] args) {
		


		   Scanner scan = new Scanner(System.in);
	        
	        int countP = 0;
	        int countN = 0;
	        int countZ = 0;
	        boolean exit=true;
	        
	        while (exit) {
	            System.out.println("Enter a Number: ");
	            int num = scan.nextInt();
	            if (num > 0) {
	                countP++;
	            }
	            if (num < 0) {
	                countN++;
	            }
	            if (num == 0) {
	                countZ++;
	            }
	            System.out.println("Would you like to continue?");
	            String answer = scan.next();
	            if (answer.equalsIgnoreCase("yes")) {
	            exit=true;
	            }else if (answer.equalsIgnoreCase("no")) {
	                    exit=false;
	            }
	        
	        }
	        
	            System.out.println("Number of positive integer: " + countP);
	            System.out.println("Number of negative integer: " + countN);
	            System.out.println("Number of zero integer: " + countZ);

	    scan.close();
	}
	}