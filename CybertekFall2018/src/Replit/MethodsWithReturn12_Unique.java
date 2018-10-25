package Replit;

public class MethodsWithReturn12_Unique {
public static void main(String[] args) {
	System.out.println( uniqueChars("wooden") ) ;

	
}






public static String uniqueChars(String str) {
    //TODO: write your below
   int counter=0;
    String newstr="";
    for(int i=0; i<str.length(); i++){
      for(int j=0; j<str.length()-1; j++){
        
    	  if (i==j) {
    	  counter++;
        } 
        if(counter==1) {
          
      	newstr+=str.substring(i,i+1);
      }
       
      }   
}   
    return newstr;
}
}