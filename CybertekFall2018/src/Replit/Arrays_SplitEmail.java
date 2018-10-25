package Replit;

import java.util.Scanner;

public class Arrays_SplitEmail {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("print an email address");
	    String email = input.nextLine();
	    
	   //Write your code below
	  String []emails=email.split("@");
		    int count=0;
		  // for(int i=0;i<email.length();i++){
		    if(email.contains("@")) {
		        count++;
		    }
		   //}
		   if(count==0 || count>1){
		        System.out.println("invalid email");
		      }else{
		        
		          System.out.println("Email id: "+ emails[0] );
		          System.out.println("Email domain: "+ emails[1]);
		        }
	  
	}

}
