package day_28_Array05;

import java.util.Arrays;

public class BinarySearchMethod {
	
	public static void main(String[] args) {
		
	//binary method
		
		String[]words= {"cakee","tomato","wooden spoon","pizza"};
		
		Arrays.sort(words);
		
		// print all in one line:
		System.out.println(Arrays.toString(words));
		System.out.println();
		//find the index of pizza in the words array
		System.out.println(Arrays.binarySearch(words,"pizza"));
	
	
	//if you dont want to use binary method
		int index = -1;

		for(int i=0; i < words.length; i++) {
			if(words[i].equals("tomato")) {
				index = i;
				break;
			}
		}

		System.out.println(index);

		if(index == -1) {
			System.out.println("not found");
	}
	
	
	String[] senten= {"chips","juice","chocalate","marhmallow"};
	
	Arrays.sort(senten);
	
	System.out.println(Arrays.toString(senten));
	
	System.out.println(Arrays.binarySearch(senten,"juice"));
	
	
	
	
	
	
	}

}
