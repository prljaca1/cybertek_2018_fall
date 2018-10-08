package day_24_Array1;

public class ArrayLength {
	
	public static void main(String[] args) {
		
		//declare array names that  store 5 names
		
		String [] names=new String[5];
		
		names[0]="Serik";
		names[1]="KHalili";
		names[2]="Z";
		//names[3]="Zarina";
		//names[4]="Erkam";
		
	
		
		
		
		System.out.println(names.length);//count of values in array not paranthesis
		
		//String name and assign Khalili to it by reading from array
		
		String name= names[1];
		
	System.out.println(name);
	
	System.out.println(name.length());// 7 character = khalili
	
	
	//whenever we declare an array with size ,depending on what type it is,it will get default values assigned.
	
	int[] arr=new int[3];//0,0,0
	
	//print arr[0];->0
	//print arr[1];->0
	//print arr[2];->0
	
	System.out.println(names[4]);
	
	
	
	}

}
