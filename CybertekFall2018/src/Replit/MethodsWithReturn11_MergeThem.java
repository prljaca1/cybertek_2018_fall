package Replit;

public class MethodsWithReturn11_MergeThem {
	public static void main(String[] args) {
		
	
//   
	  String one="12345678";	  String two="abcdef";
//	 // int  index1 =one.length()-1;
//	 // int index2=two.length()-1;
//	  String merged="";
//	  
//	     if(one.length()<two.length()) {
//		     	for(int i=0; i<one.length();i++){	     
//			    merged+=""+one.charAt(i)+two.charAt(i);
//		   }
//	     }
//		     	if(one.length()>two.length()) {
//		     	for(int i=0; i<two.length();i++){	     
//			    merged+=""+one.charAt(i)+two.charAt(i);
//		     	 }   
//	
//	     System.out.println(merged);
//	
//	
//	
//	}	    	
//		  
	    
	
		String mergedString = "";
        for (int i = 0; i < (one.length() + two.length()); i++) {
            if(i< one.length())
            mergedString += one.charAt(i);
            if(i<two.length())
            mergedString +=two.charAt(i);
        
        }
  
      System.out.println(mergedString);

	}
	
	
	
	}



































