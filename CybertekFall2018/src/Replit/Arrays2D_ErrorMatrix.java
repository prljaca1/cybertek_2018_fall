package Replit;

import java.util.Arrays;

public class Arrays2D_ErrorMatrix {
	public static void main(String[] args) {
		
		String [][]arr= {{"a","d","2","4"},{"1","2","3","4"},{"2","1","q","0"}};
		                                       
	
		
		for(int i=0; i<arr.length;i++ ) {
			
			for(int j=0; j<arr[i].length; i++ ) {
				
			   if(j%2==0) {
					
			   arr[i][j]="0";
					
				}else {
				arr[i][j]="1";	
					
				}
			}
		}
		System.out.println( Arrays.deepToString(arr) ) ;
	  }
	}


