package MentorSessions;

public class MilestoKM {
	public static void main(String[] args) {
		
////		Q-4
//		Conversion from miles to kilometers) Write a program that displays the following
//	table (note that 1 mile is 1.609 kilometers):
//
//	Miles     Kilometers
//	1          1.609
//	2         3.218
//	...
//	9         14.481
//	10         16.090
	
	final double MILES_TO_KILOMETERS=1.609;
	System.out.println("MILES     Kilometers");
	
	int counter=1;
	double miles=0;
	double kilometers;
	
	while(counter<=10) {
		miles++;
		kilometers=miles*MILES_TO_KILOMETERS;
		System.out.println(miles +"       "+kilometers);
		counter++;
	}
	 System.out.println();
	
	 for(int i=1; i<10; i++ ) {
		miles=i;
		kilometers=miles*MILES_TO_KILOMETERS;
		System.out.println(miles +"       "+kilometers);
		
	}
	
	
	
	
	
	
	
	
	}

}

