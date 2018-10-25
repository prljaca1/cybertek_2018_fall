package homeStudy;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
	
	String word="";

	boolean flag=true;
	do {
		
		System.out.println("please write something");
		word=scan.next();
		System.out.println("you wrote " + word);
	    if(word.equals("exit")) {
	    	flag=false;
	    	System.out.println("good bye");
			break;
	    }
	
	} while(flag);
		
	
		
		scan.close();
		
	}

}
