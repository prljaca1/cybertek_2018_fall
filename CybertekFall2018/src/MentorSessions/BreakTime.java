package MentorSessions;

import java.util.Scanner;

public class BreakTime {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner user=new Scanner(System.in);
		System.out.println("ENTER BREAK MINUTES");
		
	
	int breakTime=user.nextInt();
	
	int totalSeconds= breakTime * 60;
	
	int minutes=totalSeconds/60;
	int seconds=totalSeconds%60;
	
	while (totalSeconds>0) {
		
		System.out.println("Remaining time is :"+minutes+":" + seconds);
		Thread.sleep(1000);
		minutes=totalSeconds/60;
		seconds=totalSeconds%60;
		totalSeconds--;
	}
	System.out.println("Break is Over");
	
	}

}
