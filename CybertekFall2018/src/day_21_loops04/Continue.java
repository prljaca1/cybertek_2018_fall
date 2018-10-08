package day_21_loops04;

public class Continue {
	public static void main(String[] args) {
		
	//within loopa we can use different keywords as well
		//break 
		//continue
	//break will terminate/exit the loop at that point	
		//continue->will skip this iteration and continue to the next one
		
//		for (int i =1; i<=5; i++) {
//			System.out.println(i);// it just runs one time not more
//			break;
//		}
		
//		for (int i=1 ; i<=5; i ++) {
//			break;
//			System.out.println(i); //uncreachable code ,will not compile
//		}
	
	
//		for (int i =1; i<=5; i++) {
//			System.out.println(i);
//	        if (i>2) {
//		break;
//	        
//	        }
//		}
	
	
//	for (int k=0; k<=10;k++) {
//		if(k==1 || k==2) {
//			continue;//skip the rest out og the code
//		}
//		System.out.println("value of k" + k);
//	}
	
	/*
	 * loop through from 1=50
	 * print each number in same line, separated by space 
	 * if a number is divisible by 5 then skip it
	 * if a number is dividible by 20 then exit the loop
	 * 
	 */
	
	for (int num=0; num<=50; num++) {
		if (num%5==0) {
			continue;
		}
		if(num%2==0) {
			break;
		}
		
		System.out.println(num + " ");
	}
	
	
	
	
	
	}

}
