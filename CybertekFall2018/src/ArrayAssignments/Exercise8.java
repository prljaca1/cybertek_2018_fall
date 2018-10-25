package ArrayAssignments;

public class Exercise8 {
	public static void main(String[] args) {
		
//		8) loop a string array filled with fruit names and count how many instances of the
//	string "banana" are inside the array, after the loop print how many instances of
//	banana you find.
//	this is the array:
//	String[] list = new String[]
//	{"banana","apple","pinapple","banana","mango","banana"};
//	hint: you will need an if statement to check each array element inside the loop,
//	also everytime you find an instance increment an int variable you created before
//	the loop.
//		
	
		String[] list = new String[] {"banana","apple","pinapple","banana","mango","banana"};
	
	  int count=0;
	  for ( String fruit: list) {
		  if (fruit=="banana") {
			  count+=1;
			  
		  }
	 }
	      System.out.println("banana is  " +count+ "  times in the list");
	}

}
