package day_30_methods01;

public class Cooking {
	public static void main(String[] args) {
		
	cook(" Steak ;");
	
	youWillNeed("Meat,Oil,Salt,Pepper,Wooden Spoon,Tomato,Onions,Garlic");
	
	cookFor(10," Grilling");
	
	
	
	}


/*
 * method cook accepts String food name,and prints
 * "Today we are cooking foodname"
 */
public static void cook(String foodName) {
	System.out.println("Today we are cooking" + foodName);
}


/*
 * method you WillNeed, accept a string  with things we need
 * prints"We need following items: items"
 *  
 */

public static void youWillNeed(String items) {
	System.out.println("We need following items: " + items+".");
}

/* method cookFor accepts  minutes and way of cooking and prints:
 * "you needs to cook for minutes by  wayOfCooking  
 */

public static void cookFor( int minutes, String wayOfCooking) {//inside paranthesis cant change int and string after you write the method
	System.out.println("You need to cook for "+ minutes+"minutes by"+wayOfCooking);
}


/*
 * method ready, does not accept any parameter,
 * prints: "mealsis ready! Enjoy !"
 * 
 */
public static void ready() {
	System.out.println("Meal is ready! Enjoy!");
}















}


