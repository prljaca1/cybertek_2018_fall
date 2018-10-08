package day_24_Array1;

public class MultiplicationTable {

	public static void main(String[] args) {
		
//	
//        int result=1;
//		for (int mult=1; mult<=10; mult++) {
//			      
//			System.out.println("===============");
//			 	
//			for(int num=1; num<=10; num++) {
//				
//				result=mult*num;
//				
//			 	
//			System.out.println("||" +mult+ "X"+ num +"=" +result +" ||");
//			 	}
//			 
//			 	
//			 	System.out.print("=============");	
//			 	
//		}
	
	
	
	      for( int outer=1; outer<=10; outer++)  {
	    
	    	  System.out.println("----------------");
	    	  
	    	for (int inner=1; inner<=10;inner++) {
	    	
	    
	    		
	    		int result=outer*inner;
	    		
	    		System.out.println("| "+outer+ " x "+inner+" = " + result+"\t|");
	    	}
	          System.out.println("----------------");
	      }     
	
	
	
	
	
	
	
	}
}
