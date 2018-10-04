package day19_loops02;

public class SnackTime {
	public static void main(String[] args) {
		
		//create  BOOLEan VARIABLE hungry and assign true
		//create int variable apples and assign 1 to it
		//as lon as you are hungry print "eating an apple"
		//and increase the APPLE
		// ONCE YOU EAT 5 APPLES YOU ARE NO LONGER HUNGRY
		
		boolean hungry=true;
		
		int apples=1;
		
		while (hungry ) {
			System.out.println("I am eating an apple..");
			//apples++;when apples inside if conditions it is not became expecting number  
			if(apples>=5) {
				hungry=false;
				}else {
			apples++;//put increasing apple outside if statement condition
		}
		
		
}

}
}