package GroupLoopTasks_loopQuiz;

import java.util.Scanner;

public class First10Multiples {
	public static void main(String[] args) {
		
//		Level: easy
//		Write a program which accepts an integer (N) and print its first 10 multiples. Each multiple
//		should be printed on a new line in the form: N x i = result.
//		Input:
//		2
//		Output:
//		2 x 1 = 2
//		2 x 2 = 4
//		2 x 3 = 6
//		2 x 4 = 8
//		2 x 5 = 10
//		2 x 6 = 12
//		2 x 7 = 14
//		2 x 8 = 16
//		2 x 9 = 18
//		2 x 10 = 20
		
		Scanner scan =new Scanner(System.in);
		System.out.println("ENTER A NUMBER");
		int N=scan.nextInt();
		int M;
		for (int i=1; i<=10; i++) {
			  M=N*i;
			
		System.out.println(N + " X " + i + " = " + M);
			  System.out.println();
		   // System.out.print(M +"," );           
		
		}
		scan.close();
	}

}
