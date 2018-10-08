package Homeworks;

import java.time.LocalDate;
import java.util.Scanner;

public class DayInMonth {
	/*
     * Ask user to enter a number of the month ask user to enter the year
     *
     * PRINT OUT: the month's name AND how many day it has
     *
     * HINT: check for LEAP YEARS (years that has 29 days for February)
     *
     * EXAMPLE: input number of month: 2 input year: 2016
     *
     * EXPECTED OUTPUT: February of 2016 has 29 days
     *
     */
	
public static void main(String[] args) {	
	
	
	//Calendar cal = Calendar.getInstance();
	int month,year;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter number of month :");
	month=scan.nextInt();
	System.out.println("Enter number of year :");
	year=scan.nextInt();
	LocalDate ld=LocalDate.of(year, month, 1);
	System.out.println(ld.getMonth() +" of "+year +" has "+ld.lengthOfMonth()+" days. Leap year ? "+ld.isLeapYear() );
}
}
