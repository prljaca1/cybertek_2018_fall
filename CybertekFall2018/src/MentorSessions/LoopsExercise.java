package MentorSessions;

public class LoopsExercise {
	public static void main(String[] args) {
		 
		for(int i=0; i<5 ; i++) {
			//if its odd line and below 10th line print it with stars
			
			System.out.println("* * * * *  =========================");
			
			//if its even line  and below line print it with stars
			System.out.println(" * * * * * =========================");
		
		}
		 for(int i=0; i<8; i++ ) {
			System.out.println("====================================");
		 }
		
		
	


for (int i = 0; i < 18; i++) {
    
    //if its odd line and below 10th line print it with stars
    if(i%2 == 0 && i <=10)
    System.out.println("*  *  *  *  *  =================================");
    
    //if its even line and below 10th line print it with stars
    if(i%2 == 1 && i <=10)
    System.out.println(" *  *  *  *  * =================================");
    
    //if the line number is greater than 10 just print it
    if(i >10)
    System.out.println("================================================");
}




//=====================================


for (int i = 0; i < 5; i++) {
    System.out.println("*  *  *  *  *  =================================");
    System.out.println(" *  *  *  *  * =================================");
}

for (int i = 0; i < 8; i++) {
    System.out.println("================================================");
}
}

}