package day_18_loops01;

public class StairCase {


		
		/*
		*
		**
		***
		****
		*****
		******
	 */

		public static void main(String[] args) {
			
			String stairs = "";
			int count = 1;
			
			
			while(count <= 10) {
				stairs = stairs + "*";
				System.out.println(stairs);
				count++;
			}
			
			/*
			stairs = stairs + "*";//*
			System.out.println(stairs);
			stairs = stairs + "*";//**
			System.out.println(stairs);
			stairs = stairs + "*";//***
			System.out.println(stairs);
			*/
		}
	

	}


