package MentorSessions;

public class OfficeHours {
	public static void main(String[] args) {
		
	int[]arr= {1,4,5,9,3,7};
	
	int targetNumber=12;
		
	for (int i=0;i<arr.length;i++) {
		
	for(int j=i+1 ;j<arr.length; j++) {
			
		if(arr[i] + arr[j]==targetNumber) {
				
			System.out.println(i+","+j);
			System.out.println(arr[i]+arr[j]);
			
	
		}
}
		
}

}
		
}


