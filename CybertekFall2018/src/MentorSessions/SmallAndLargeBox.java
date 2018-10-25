package MentorSessions;

public class SmallAndLargeBox {
public static void main(String[] args) {
	
	/*
	 * giveb two box String of Array
	 * check if large box have ite, fom small box
	 * 
	 * 
	 * 
	 */
	
	String[] smallBox = {"apple","banana","kiwi"};
    
    String[] largeBox = {"apple","orange","pineaple"};
    
    for(String itemSmall : smallBox) {
        
        for(String itemLarge: largeBox) {
            if(itemSmall.equals(itemLarge)) {
                System.out.println(itemSmall + " in Large Box as well");
                break;
            }else {
                System.out.println(itemSmall + " is not in Large box");
                break;
            }
        }
        
    }
    
}
}

