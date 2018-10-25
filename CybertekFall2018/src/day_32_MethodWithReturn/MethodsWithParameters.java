package day_32_MethodWithReturn;

public class MethodsWithParameters {
	public static void main(String[] args) {
	    
		String newEmail=buildEmail("Ihsan","Prljaca");	
	    System.out.println(newEmail);
	 
	    System.out.println(buildEmail("ihsan","prljaca"));
	
	 //2.example
	    System.out.println(getMax(100,3));
	    int  myNum=getMax(34,90);
	    System.out.println(myNum);
	
	//3.example
	
	  int max=getMax3(10,5,3);
	  System.out.println(max);		  
	
	  max=getMax3(10,10,3);
	  System.out.println(max);
	
	//4.example
	  
	boolean valid=isValidDday("Monday");
	  System.out.println(valid);
	  
	valid=isValidDday("funday");
	System.out.println(valid);
	
	
	
	}
  
	
	
	
	//buildEmail that will accept a firstname and lastname and
//return a full e mailmby adding @gmail.com
	
	public static String buildEmail(String firstName, String lastName) {
		String email=firstName.toLowerCase()+"_"+lastName.toLowerCase()+"@gmail.com";
		return email.toLowerCase();
	}
   
//method getMax that accept 2 ints and return larger one

public static int getMax(int num1,int num2) {
	int largest;
	if (num1>num2) {
	   largest=num1;
	}else {
	   largest=num2;
    }
    return largest;
}
    //method getMax3 that accepts 3 ints and returns largestvalue
    
    public static int getMax3(int num1,int num2,int num3) {
    	
    if (num1>=num2&&num1>=num3){
    	return num1;
    }else if(num2>num1 && num2>num3){
    	return num2;
   }else{
    	return num3;
   }	
    }
  //isValidWeekday method: accepts a weekdayName, and checks
 //if it is a valid one of 7 days then return true,otherwise return false.
    
  public static boolean isValidDday(String day){
	day=day.toLowerCase().trim();
	//1.solution
	
  if(day.equals("monday")|| day.equals("tuesday")||day.equals("wednesday")||
	 day.equals("thursday")||day.equals("friday")||day.equals("saturday")
	 ||day.equals("sunday")) {
	  return true;
	  }else{
      return false;
	  }
     
    //2.solution
    // if(day.equals("monday")|| day.equals("tuesday")||day.equals("wednesday")||
    //		   day.equals("thursday")||day.equals("friday")||day.equals("saturday")
    //		   ||day.equals("sunday")) {
    //return true;
	//}
//    return false;
	  
	 //.3 solution
	//if(day.equals("monday")|| day.equals("tuesday")||day.equals("wednesday")||
	//		   day.equals("thursday")||day.equals("friday")||day.equals("saturday")
	//		   ||day.equals("sunday")) {
			  
  
  }
}
