package day_32_MethodWithReturn;

public class AccumulatorMethod {
	public static void main(String[] args) {
		String myStars=getStars(5);
		System.out.println(myStars);

		int[]nums= {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};

		for(int n:nums) {
			System.out.println(getStars(n));
		}
        
		System.out.println(sumToN(8));

	}

	//methods getStars that accept an int and returns a string
	//it will return that may * bsbfrom method.
	//getStars(5)->*****
	//getStars(2)->**
	//
	public static String getStars(int count){
		String stars=" ";
		
		for(int i=1; i<=count; i++){
			stars+="*";
		}

		return stars;

     }
//	method: sumToN: accepts an int and return sum of ints starting from 1 to that int.
//		     * sumToN(3) -> 6  (1+2+3)
//		     * sumToN(5) -> 15 (1+2+3+4+5)
//		     */

     public  static int  sumToN(int n ) {
    	 int sum=0;
    	 for(int i=1; i<=n;i++) {
    		 sum+=i;
    	 }
    	 return sum;
     }



}