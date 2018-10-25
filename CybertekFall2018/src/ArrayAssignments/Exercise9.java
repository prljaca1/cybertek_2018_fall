package ArrayAssignments;

import java.util.Arrays;

public class Exercise9 {
	
	public static void main(String[] args) {
		
		
//		9)copy old_r elements into new_r empty positions, new_r size is bigger then old_r
//	size by one. inside new_r last position put new_word "four", and then output the
//	array using the java array util "Arrays.toString()". this is the starting code:
//	String[] old_r = new String[] {"one","two","three"};
//	String new_word ="four";
//	String[] new_r = new String[old_r.length+1];

		//	hint: use a loop to loop all of old_r elements, use the loops increment int (if you
//	dont have one create it int i = 0 and at the end of the loop put i++;) to put the
//	element in the same position inside of new_r, after the loop put the new_word in
//	the last position of new_r, use length1
//	to point to the last position. finally use
//	Arrays.toString() to easily print the new_r to console.
//		
		
	
	        	String[] old_r = new String[] {"one","two","three"};
				
	        	String new_word ="four";
				
	        	String[] new_r = new String[old_r.length+1];
				
             	int length1=new_r.length;
				
				for(int i=0;i<old_r.length;i++)
				{
					new_r[i]=old_r[i];
					
				}
				new_r[length1-1]=new_word;
				
      		System.out.println(Arrays.toString(new_r));
	    
				
	
	
	
	
	}

}
