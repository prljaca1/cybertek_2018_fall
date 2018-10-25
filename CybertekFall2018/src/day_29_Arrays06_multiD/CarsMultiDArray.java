package day_29_Arrays06_multiD;

import java.util.Arrays;

public class CarsMultiDArray {
	public static void main(String[] args) {
		
	/*
	 * create a 2d array cars
	 * it shold have 4 groups of cars
	 * 1.japanese
	 * 2.german
	 * 3.american
	 * 4.italian
	 * 
	 */
		
		String[][] cars = {
		           {"Honda", "Lexus" , "Toyota", "Acura", "Mazda" , "Nissan", "Subaru"},
		           {"Audi", "BMW" , "Porsche" , "VW" , "Mercedes benz"},
		           {"Dodge" , "Ford", "Tesla", "Jeep" , "Chevrolet", "Lincoln"},
		           {"Ferrari" , "Fiat", "Maserati", "Lamborghini", "Alfa Romeo","Lacia"}
		           };

		
		//1.using "For Loop"
		//outer loop->we loop from 0-cars.length
		//inner loop->we loop 0 to cars[index].length
	
	
	for(int i=0; i<cars.length; i++) {
		
		for(int j=0; j<cars[i].length; j++) {
			
			System.out.print(cars[i][j]+" ");
		}
	  System.out.println();
	
	}
	
	
	//2.Using for "For Each Loop"="Enhanced For Loop"
	
	for(String[]carGroup:cars) {
		for(String car: carGroup) {
			
			System.out.print(car+" ");
		}
	   
	}
	    //2.way//
	for(String[]carGroup:cars) {
		
		System.out.print(Arrays.toString(carGroup));
	}
	System.out.print(Arrays.deepToString(cars));
	
	System.out.println("===================================================");
	
for(int i=0; i<cars.length; i++) {
	switch(i) {
	case 0:
	    System.out.println("Japanese: ");
	    break;
	case 1:
		System.out.println("German: ");
	     break;
	case 2:
	    System.out.println("Japanese: ");
	    break;    
	case 3:
	    System.out.println("American: ");
	    break;    
	case 4:   
	   System.out.println("Italian: ");
	break;
	 default:
	 System.out.println("Unknown Group");
	}
	for(int j =0; j < cars[i].length; j++) {
		System.out.print(cars[i][j] +" ");
	}	
	System.out.println();
	}
	
	}

}
