package day_22_nestedLoops;

import java.util.Scanner;

public class Register {
	
	public static void main(String[] args) {
//		It will ask user how many items he purchased.
//
//		Then based on that number it will ask item name and price that many times.
//
//		You need to gather all items in one String variable items separated by comma
//
//		And calculate sum of each item price into variable totalPrice.
//
//		Then print out items and total price.
//
//		Example:
//
//		How many items are you purchasing?
//
//		2
//
//		What is item 1?
//
//		Gloves
//
//		How much is Gloves?
//
//		10.44
//
//		What is item 2?
//
//		Hat
//
//		How much is Hat?
//
//		13
//
//		----------
//
//		Your items: Gloves, Hat
//
//		Your total Price: $23.44

        Scanner scan=new Scanner (System.in);
		System.out.println("How many items are you purchasing?");
		
		double total=0;
		
		int itemNumber=scan.nextInt();
		
		String allNames="";
		
		for(int i= 1; i<=itemNumber ; i++ ) {
			
			
			System.out.println("What is item " +i+ " ?");
			
			String itemName=scan.next(); 
			 
		
		    System.out.println("How much is "+ itemName+ " ?");
		  
		    double itemPrice=scan.nextDouble();
			 
		   if(i==itemNumber) {
			   allNames= allNames + itemName ;
		   }else {
		    allNames= allNames + itemName+ "," ;
		   
		    total+=itemPrice;
			}
			 }
	        System.out.println ("Your items: " + allNames);
		    
	        System.out.println("Your total Price: " + "$ " + total);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
