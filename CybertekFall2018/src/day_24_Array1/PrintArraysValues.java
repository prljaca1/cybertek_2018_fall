package day_24_Array1;

public class PrintArraysValues {
	public static void main(String[] args) {
		
		//create an array cars and directly assign following calues;
		
		//Audi,Porshe,BMW,Toyota,Honda,Tesla,Dodge,Kia,Acura,Fiat
		
	
		
		String[] cars= new String[] {"Moskovich","Audi", "Porshe","BMW","Toyota","Honda","Tesla","Dodge","Kia","Acura","Fiat"};
			
		//print number of cars	
	System.out.println(cars.length);
	

	
	for (int idx=0; idx<cars.length;idx++) {
		
		
		System.out.println(cars[idx]);
		}

       System.out.println("----FOR EACH LOOP----");
	    //PRINT all values using a for each loop
         for (String car : cars) {
	     System.out.println(car);
         }
	     System.out.println();
	     
	     
	     // For wach loop only works with arrays or other data collections/structures.
         
      //  for(Type0fArray tempVariable: arrayName) ;
         
        int []nums = { 4,6,3,1,4};
	     
	     for( int n : nums) {
	       System.out.print(n);
	     }
        	     
                     
	}
}