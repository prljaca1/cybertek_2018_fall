package BasicLoopsAssigtments;

public class DoWhileLoop8 {
	
	public static void main(String[] args) {
		
	
	
//	8) create a program that outputs all the numbers from -100 to 100 using do while loop

	
	
int negnum=-100;
int posnum=0;
	 do {

		if(negnum<0) {
			 
			System.out.print(negnum+ " ");
			 negnum++;
	        }
		 
		else if(negnum<=-1) {
			System.out.print( "0" );
		break;
		}
		
		else  if (posnum<=100) {
			 System.out.print(" " + posnum );
			posnum++;
		 }
	      
	       }while (posnum<= 100);
	
	

	
	
	
	
	
	
	
	
	
	
}	
}	
	

