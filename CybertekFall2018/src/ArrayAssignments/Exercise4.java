package ArrayAssignments;

public class Exercise4 {
	public static void main(String[] args) {
		
//		4)print 2.5 double to the console by adding numbers from this array:
//			double[] d_r= new double[] {0.2,0.3,1.0,1.5,2.0};
//			
		double[] d_r= new double[] {0.2,0.3,1.0,1.5,2.0};
		
	 // System.out.println(d_r[2]+d_r[3]);
	  
	//  System.out.println(d_r[0]+d_r[1]+d_r[4]);
	  
	  
		double targetNumber=2.5;
		
		for(int i=0; i<d_r.length; i++) {
			
		  for(int j=i+1; j<d_r.length; j++) {
			  
			  if(d_r[i]+d_r[j]==targetNumber) {
				 
				  System.out.println(i);
				  System.out.println(j);
				
				 System.out.println(d_r[i]+d_r[j]);
					
 }
   }
	 }
		  
	
		
		
   
	
	
	
	
	}
}