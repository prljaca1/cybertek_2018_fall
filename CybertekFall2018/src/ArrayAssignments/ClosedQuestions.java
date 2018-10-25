package ArrayAssignments;

import java.util.Scanner;

public class ClosedQuestions {
	public static void main(String[] args) {
		
//		
//		String a="aaaa";
//		char arra[]=a.toCharArray();
//		
//		String b= "bbbb";
//		char arrab []=b.toCharArray();
//		
//		int i=0;
//		
//		for(char c:arra) {
//			if(i%2==0) {
//				
//				arrab[i]=c;
//			}
//			i++;
//			}
//		
//System.out.print(i);
//		
	
	
//	String[] c=new String[] {"abc"};
//	
//	System.out.println(c[0].length());
//	
	
//	String[]c=new String[0];
//	System.out.println(c.length);
//	
//	String[] s=new String[] {"abc"};
//	
//	System.out.println("s[0]"+"d");
//	
	
//	
//	double[]nums=new double[] {9,0.5,3,4,6,5,1.5};
//	double smallest=nums[0];
//	for (double n:nums) {
//		if(n>smallest) {
//			smallest=n;
//		}
//		
//	}
//	System.out.println(smallest);
//	
//	int []Arrays= {1,2,3};
//	System.out.print(Arrays.toString(new int[] {1,2,3}));
//	
	
	//String str= "abcdefg";
	
////	for(int i=0; i<= str.length()-1;i++) {
////		
////		System.out.println(str.charAt(i));
////		
////		
//		
//	}
//	
//	String[] fruits=new String[] {"apple","melon","banana"	};
//	
//	String print=fruits[0];
//	
//	for(String f:fruits) {
//		
//		if(f.length()>print.length()) {
//			
//			print=f;
//		}
//		
//		}
//	
//	System.out.println(print);
//	
//	
//	String a ="aaaa";
//	char arra [] =a.toCharArray();
//	
//	String b ="bbbb";
//	char arrb []=b.toCharArray();
//	
//	int i=0;
//	for(char c: arra) {
//		if(i%2==0) {
//			arrb[i]=c;
//    }
//	i++;
//	
//	}
//	String ab=new String(arrb);
//	System.out.println(ab);
//	
	
	
	
                                                                                                                                                                                                                                                                                                                                                                            	}
	 Scanner input = new Scanner(System.in);
		
	 String[] words = new String[5];
		
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
	
		String maxWord="";

	for (int k=0; k<words.length; k++){
	 
	 if(words[k].length() >maxWord.length()){
	     
	      maxWord=words[k];
	   
	 }
	}
		System.out.println(maxWord);
		
		
		
		
	
	
	
	
	
	
	
	
}
	
}	


