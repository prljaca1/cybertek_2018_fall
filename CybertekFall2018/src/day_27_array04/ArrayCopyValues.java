package day_27_array04;

public class ArrayCopyValues {
	public static void main(String[] args) {
		//for each loops
		String[] arr = {"zero", "one", "two","three","four","keys"};
		
		//count how many words have 'e' in the arr
		int counter=0;
		
		for(String str:arr) {
			if( str.contains("e")) {
				counter++;
			}
		}
		System.out.println(counter);//3
		//create array fewValues,with size of counter
		
		String[]fewValues=new String[counter];
	
		//go over arr one more time and add the words with 'e' into fewValues
	     
		int i=0;
			
		for(String each:arr) {
			if (each.contains("e")){
			fewValues[i]=each;
				i++;
	 }
  }
	for( String val:fewValues) {
		System.out.println(val+ " ");
	
	}
	
	//second solution with for loops
	
//	int counter = 0;
//	for(int i=0; i<arr.length;i++) {
//		
//		if(arr[i].contains("e")) {
//			counter++;
//		}
//		
//	}
//	
//	System.out.println(counter);
//	//create array fewValues, with size of counter
//	String[] fewValues = new String[counter];
//	
//	//go over arr one more time and add the words with 'e' into fewValues
//	int i = 0;
//	
//	for(int j=0; j < arr.length; j++) {
//		if(arr[j].contains("e")) {
//			fewValues[i] = arr[j];
//			i++;
//		}
//	
//	
//	}

}
}