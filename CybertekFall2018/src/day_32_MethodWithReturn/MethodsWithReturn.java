package day_32_MethodWithReturn;

public class MethodsWithReturn {

public static void main(String[] args) {
	int amount=giveme5$();
  System.out.println(amount);
  
  System.out.println(giveme5$());
//get president name from the method and assign to president.
  //then print out "US president is [president]
  String president =getPresidentName();
  System.out.println("US president"+president);
  
  System.out.println("US president"+getPresidentName());

  System.out.println( getPresidentName() );
//2.example
String firstName=getFirstName();

String LastName=getLastName();
             // Ihsan      Prljaca
String email=firstName+"_"+LastName+"@gmail.com";
System.out.println(email);
}

public static int giveme5$() {
	int d = 5;
	return d;
}

public static String getPresidentName() {
	return "Donald Trump";
}


public static String whatisYourName() {
 	String name = "Aysha";
	return name;
}
//METHODS  1)getFirstName, 2)getLastName
//main you willcall these methods and build an e mail
// String email=[firstname]_[lastname] @gmail.com


public static String getFirstName(){
 return "Ihsan";
 }

public static String getLastName(){
	 return "Prljaca";
	}



















}
