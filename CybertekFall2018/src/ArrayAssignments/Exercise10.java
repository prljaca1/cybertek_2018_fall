package ArrayAssignments;

public class Exercise10 {
	public static void main(String[] args) {
		
//		10) the not so utopian tree. you have an int array describing the growth of the tree
//	every year for 10 years, for the first 3 years it shod grow 1 cm (the first 3 elements
//	in the growth array), for the rest it shod grow for 2 cm, create a loop that will make
//	sure this happens, if not change the values accordingly (if year is less then 3 and
//	the element is less then 1 set it to one),if in later years the array element show a
//	number less then 2 change the array element to 2.
//	after that print the trees growth:
//	year 1 growth 1 cm
//	tree size:1cm
//	year 2 growth 1 cm
//	tree size:2cm
//	year 3 growth 1 cm
//	tree size:3cm
//	year 4 growth 2 cm
//	tree size:5cm
//	year 5 growth 2 cm
//	tree size:7cm
//	year 6 growth 2 cm
//	tree size:9cm
//	... until you reach year 10
//	this is the starting code:
//	int[] growth = new int[] {1,0,1,2,1,0,2,0,2,1}
//	;
//	for(int n :growth) {}
//	hint: create an int to hold the trees growth, the loop can have two ifs the first checks if the years
//	are less then 3 and the current element is less then 1 if so, change the current element to 1, for
//	years you can use the increment (the loop runs 10 times anyway), the next if checks if its above
//	3 years and if the current element is smaller then 2 if so change the current element to 2.
//	use somthing like "growth[i]" to manipulate the current element i is the loops increment variable.
//	if you find growth[i] is less then 1 in the first 3 years set it to 1 (growth[i]=1). if the years start from
//	0 to 9 , you can create an int named actual_years = i+1; to use for outputs and ifs (inside the
//	loop). good luck.
//		
	
	
	
		int[] growth = new int[] {-1,0,1,2,1,0,2,0,2,1};
		
		

		
	
	
	
	int treeSize=0;
	for(int i=0; i <growth.length; i++) {
		
		if(i<3) {
			
			System.out.println("year " + (i +1)+  " growth  1 cm  " );
			
			treeSize+=1;
			System.out.println("Tree size : " + treeSize);
			
			System.out.println();
		
		  }else if(i>=3) {
				
			 treeSize+=2;
			System.out.println("year " + (i +1)+ " growth  2 cm  " );
				
			System.out.println("Tree size : " +treeSize + "cm");
			
				
			System.out.println();
			}
			
		
	}
	

	
	System.out.println();
	
	
	
	
	
	}

}
