package homeStudy;

import day_3_VariablesAndType.MyVariables;

public class JavaMethods {
	
	public static void main(String[] args) {
	
	String one="selen";
	String two="java";
	System.out.println(mergeStrings(one,two));


	
	}
	
//	
//	public static String mergeStrings(String one, String two) {
//	      String merged="";
//	   for(int i=0; i<one.length();i++){	     
//		        merged+=(String.valueOf(one.charAt(i))+String.valueOf(two.charAt(i)));
//		   
//		     if(i>(two.length()-1))
//		    	 merged+=one.substring(i);
//		     if(i<(two.length()-1)&&i==one.length()-1)
//		    	 merged+=two.substring(i+1);
//		    	
//		    }
//	    return merged;
//	    }
	

	public static String mergeStrings(String one, String two) {
		String merged="";
		int index1=one.length()-1;
		int index2=two.length()-1;
		for(int i=0; i<one.length();i++){	     
			merged+=(one.substring(i,i+1)+two.substring(i,i+1));
			if (index1>index2) {
				merged+=one.substring(index1-index2);
			}
			if(index2>index1) {
               merged+=two.substring(index2-index1);
			}
		}
            return merged;
		
	   
	   
}
}