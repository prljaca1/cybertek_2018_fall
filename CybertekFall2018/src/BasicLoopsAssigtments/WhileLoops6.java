package BasicLoopsAssigtments;

public class WhileLoops6 {
	public static void main(String[] args) {
	
		//6) create a program that outputs the sum of all the numbers between 1 to 101
	    //(1+3+5+7+9....+ 101) using a while loop.
	   
		
		//(note:question is not clear,quesion's lines want different results)//
	
	
	int number=1;
	int sum=0;
	
	while( number<=101) {
		
		sum+=number;
		
		System.out.print(number);
	     if(number<101) {
	    	 System.out.print(" + ");	     }
		number++;
	
	}	  
	System.out.println();
	System.out.println();
	System.out.println("SUM IS = " + sum);
	
	//============================================================================//
	System.out.println();
	System.out.println();
	
    int integer=1;
	int summa=0;
	while (integer<=101){
		
		if (integer%2==1) {
	
		System.out.print(integer);
		
		summa+=integer;
		
		if (integer<101) {
			
			System.out.print(" + ");
		}
		  
		}
	   integer++;
	}
	System.out.println();
	System.out.print("Sum is = " + summa);
}

}
