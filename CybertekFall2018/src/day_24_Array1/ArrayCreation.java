package day_24_Array1;

public class ArrayCreation {
	public static void main(String[] args) {
		
	// arrays are always object like strings.	
		//declare array that can hold 5 item.
		int []number=new int[5];
		//asssign values
		
		number[0]=234;
		number[1]=432;
		number[2]=100;
		number[3]=54;
		number[4]=7654;
	
		
		//int[] nums= {100,200,300};
				
	  System.out.println(number[0]);
	  System.out.println(number[3]);
	
	number [0]=1000;
	
	System.out.println(number[0]);
	
	number[1]=number[2]+number[3];
	System.out.println(number[1]);
	
	//Declare a char array grades and assign  A,B,C,D,E TO it.
	
	char[] grades2=new char[5];
	
	grades2[0]='A';
	
	grades2[1]= 'B' ;
	
	grades2[2]= 'C' ;
	
	grades2[3]= 'D' ;
	
	grades2[4]= 'E' ;
	
	
	char grades []	= {'A','B','C','D','E'};
	
	
	//print first item
	
	System.out.println(grades[0]);
	
	char myGrade=grades[1];
	
	char grades3[]=new char[5];
	
	
	//String
	
	String [] cities;
	
	cities =new String[3];
	
	cities[0]="Washington";
	cities[1]="";
	cities[2]="Washington";
	
	
	
	}

}
