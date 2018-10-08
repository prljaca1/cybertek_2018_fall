package MentorSessions;

import java.util.Scanner;

public class FindBob {
	
	public static void main(String[] args) {
		
		//ask scanner sring and middle can be any number
        //check contains a bob
        //abcBob..bob is here
        //b9b is here
        //bac is not here
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = sc.nextLine();
		boolean flag = true;
		                
		for(int i = 0; i < word.length()-2; i++) {
			if(String.valueOf(word.charAt(i)).equals("b") 
			  && word.charAt(i+2) == 'b') {
				System.out.println("Bob is here");
				flag = false;
				break;
			}
		}
		// false
		if(flag) {
			System.out.println("Bob is not here");
		}
		
		
	
		
		
		
		
}	
	}


