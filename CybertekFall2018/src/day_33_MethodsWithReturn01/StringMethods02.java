package day_33_MethodsWithReturn01;

public class StringMethods02 {
	public static void main(String[] args) {
		System.out.println(countTimes("google","o"));
	   
		System.out.println(countTimesV2("anna karina","a"));
	 
		    System.out.println(countTimesV3("alistirma","i"));
	
	}
	
/*Method name:countTimes
 * Params: 2strings
 * return type: int
 * Count number of occurences of first string within second string
 * and return that count
 * Ex:
 * countTimes("java","a")->2
 * 	
 */
	public static int countTimes(String word,String letter) {
		int counter=0;
		for(int i=0; i<word.length();i++) {
			if(word.substring(i,i+1).equals(letter)) {
				counter++;
			}
		}
        return counter;
	}
   public static int countTimesV2(String word,String letter) {
	   String[]arr=word.split(letter);
	   return arr.length-1;
   }
	public static int countTimesV3(String word,String letter) {
		int len1=word.length();//4
		word=word.replaceAll(letter,"");
		int len2 =letter.length();//2
		return len1-len2;
	}
	
}
