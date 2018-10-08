package BasicLoopsAssigtments;

public class ForLoop2 {
	public static void main(String[] args) {
		

//      2) write a program that calculates the sum of numbers from 1 to 100
//      (1+2+3+4+5...+100 ). using a for loop. output the sum after the loop.

			int sum=0;
	
  for (int num=1; num<=100; num++) {
			sum+=num;
		
			System.out.print(num + "+");
		
	}
			System.out.println();
	System.out.print ("Sum = " + sum);
		System.out.println();
		
	}

}
