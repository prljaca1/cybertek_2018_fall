package Replit;


public class ConvertBinaryToDecimal {
	public class NumberUtils {
		
		public int[] getBinaryNums(int decNumber,int arrSize) {
			int[] arr = new int[arrSize];
			for(int i = 0; i < arrSize; i++) {
				arr[i] = decNumber % 2; 		
				decNumber = decNumber / 2 ;		
				if(decNumber == 1) {
					arr[i+1] = decNumber % 2; 
					return arr;
				}
			}
			return arr;
		}
		
		public  int getAmount(int decNumber) {
			int count = 0;
			while(true) {
				decNumber = decNumber / 2 ;
				count++;
				if(decNumber == 1) {
					return count + 1;
				}
			}
		}
	}
	}
	