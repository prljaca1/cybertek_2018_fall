package day_25_Array2;

public class CountMatches {
public static void main(String[] args) {

	/* create double array called prices
	 
	 *assign 10 or more different prices 
	 *using a loop count how many items tahat is more tahan $20
	 *print the count
	 *if no price was found that is more than $20 then print
	 *
	 *"No items that costs more than $20"
	 */
	
	
	double[] prices = {34.0,15.55,78.76,17.4,23,39.0,56,106,13,21};
	int count=0;
	
	for (double price :prices) {
		if(price>20.0) {
			count++;
		}
	}
      if(count==0) {
    	  System.out.println("No items for more than $20");
      }else {
	     System.out.println(count+ " items with more than $20");
      }
   
      
      
}
}