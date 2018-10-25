package day_28_Array05;

import java.util.Arrays;

public class ArrayEquals {
public static void main(String[] args) {
	
	//Equals method in Arraysbclass
	//When 2 arrays with sma length and asame order of elements then they areequal
	
	
	int[]a  = {10,20,30};
	int[]b  = {10,20,30};
	
	int[]c= {10,20,30,40};
	int[]d= {10,20,40,30};

       System.out.println(Arrays.equals(a,b));
       System.out.println(Arrays.equals(b,c));
       System.out.println(Arrays.equals(c,d));

//sort the d ARRAy AND COMPare with c array
 Arrays.sort(d);

 boolean bool = Arrays.equals(c, d);
	System.out.println(bool);
	//Use operators to compare instead of equals method
	System.out.println(a == b);
	
	int[] j = a;
	
	System.out.println(Arrays.toString(j));
	System.out.println(a == j);
	
	j[0] = 1000;
	System.out.println(Arrays.toString(j));
	System.out.println(Arrays.toString(a));
	
 
 
 
 
}
}
