package day_35_methodsReview;

public class MethodAndStuff {
	public static void main(String[] args) {
		
	String str="laptop";
	str=delete(str,"a");
	System.out.println(str);
	//lptop->is expected result
		System.out.println(delete("humeyra","a"));
		
	String str1="halloween";
	String str2="llo";//"ee"
	int count=numberOfOccurences( str1,str2);
	System.out.println(count);
	
	}
	/*
	 * delete utility 
	 * will delete a given character from the given string
	 * 
	 *  
	 */
	
	
	public static String delete(String str1,String str2){
		String newOne=str1.replace(str2, "");
		return newOne;
	}
/*
 * given a string,write a method which  returns 
 * how many times a certain character appears on a string
 *                                   (appears on another string)//second pseudocode
 */
public static  int numberOfOccurences(String str1,String str2) {
	int count=0;
	for (int i=0; i<=str1.length()-str2.length(); i++) {//(int i=0; i<str1.length()-str2.length()+1; i++)
		String currentString=str1.substring(i,i+str2.length());
	  //char charChar=str1.charAt(i);//2.solution
	if (currentString.equals(str2)) {
		count++;
	 }
 }
		
	return count;
}





}
