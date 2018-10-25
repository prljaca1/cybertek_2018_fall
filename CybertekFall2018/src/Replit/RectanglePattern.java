package Replit;

public class RectanglePattern {
		  
	 public static void main(String[] args) {
		   
		  //  printHollowRect();
		    multipl();
		  }
		  
		  public static void printHollowRect()
		  {
		   for( int i=0; i<5; i++){
		     
		      for(int j=0;j<5;j++)
		      {
		        //System.out.print((i==0 || j==0 || i==4 || j==4)?"*":" ");
		    	  if(i==0 || j==0 || i==4 || j==4)
		    	  {
		    		  System.out.print("*");
		    	  }
		    	  else
		    		  System.out.print(" ");
		        
		      }
		      System.out.println();
		   }
		  	    
		  }
		  
		  public static void multipl()
		  {
			  int [][] multiplicationTable = new int[10][10];
			    
			    //TODO: type your code below
			     for(int i=1;i<=10;i++)
						    {
						  
						       for(int j=1;j<=10;j++)
						       {
						         multiplicationTable[i-1][j-1]=(j*i);
						       }
				
						    }
			     
		  }
		  
		 
		  
		}
