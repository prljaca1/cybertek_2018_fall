package day_30_methods01;

public class MethodIntroduction {
	public static void main(String[] args) {
	sayHello();
	askHowUR();
	sayHello();
	reply();
	System.out.println("I am doing great!thanks");
	bye();
	bye();
	sayHelloTo(" Ayse !");
	
	String nameOfOnlineFriend="Umit";
	sayHelloTo(nameOfOnlineFriend);
	
	}
   
	
	
	
	public static void sayHelloTo(String name) {
		System.out.println("Hello" + name);
		
	}
 
	
	public static void sayHello(){
	  System.out.println("Hello!");
  }	
	
	
	/*
	 * write a method askHowRU tahat asks "how areyou doing?"
	 * 
	 */ 
	public static void askHowUR() {
		System.out.println("How are you doing?");
		}
	 /*
	  * write a method relpy.that prints '"I am doing well,how about you?"
	  * 
	  */
	
	public static void reply() {
		System.out.println("I am doing well,how about you?");
	}
	/*
	 * 
	 * write a method bye that asks "Bye have a good day"
	 * 
	 */
	public static void bye(){	
       System.out.println("Bye! Have a good day");
}
	
 public static void sayHello (String name) {
	System.out.println("Hello" + name);
	
}	
	
	
}