package LoopsMondayOCT1Projects;

public class MijatMentoringQuestion2FindB {
	
	public static void main(String[] args) {
		
		
		char arr[]=new char[] {'A','Z','B','N','P','T','X','C'};
	
	boolean found =false;
	char searchChar='B';
	
	for (int i=0; i<arr.length;i++) {
		if (arr[i]==searchChar) {
			
			found=true;
		}
		
	}
	
	 if(found==true) {
	System.out.println(searchChar+ " Found!");
	 }else {
	System.out.println(searchChar+ " NOT FOUND!");
	 
	 }

}
}