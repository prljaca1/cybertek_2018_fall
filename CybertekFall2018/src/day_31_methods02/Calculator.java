package day_31_methods02;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
	double n1=0;
	double n2=0;
	
	add(n1,n2);
	substract(n1,n2);
	multiply(n1,n2);
	divide(n1,n2);
	
	//add more number?
	//add a scanner
	Scanner input=new Scanner(System.in);
	
	System.out.println("Enter 2 numbers:");
	 n1=input.nextDouble();
	 n2=input.nextDouble();
	System.out.println("Choose operation :\n"+
			  "1 - add\n"+
			  "2 - substract \n"+
			  "3 - multiply \n"+
			  "4 - divide ");
	/*
	 * for add select 1
	 * for substract select 2
	 * for multiply select 3
	 * for divide select 4
	 */
	int operation=input.nextInt();
	input.close();
	switch (operation) {
	case 1:
		add(n1, n2);
		break;
    case 2:
		substract(n1, n2);
		break;
    case 3:
	     multiply(n1, n2);
	     break;
     case 4:
 		divide(n1,n2);
 		break;
 	 default:
	  System.out.println("Error:Invalid operations");
	}
}

public static void add(double num1,double num2) {//you cannot two arguments with the same name

	double result=num1+num2;
	System.out.println(result);
}
public static void substract(double num1,double num2) {
	double result=num1-num2;
	System.out.println(result);
	}
public static void multiply(double num1, double num2) {
	
	double result=num1*num2;
	System.out.println(result);
}
public static void divide(double num1, double num2) {
	if (num2==0) {
		System.out.println("ERROR: Cannot divide by 0");
	}else {
		double result=num1/num2;
		System.out.println(result);
	}
	
}











}
