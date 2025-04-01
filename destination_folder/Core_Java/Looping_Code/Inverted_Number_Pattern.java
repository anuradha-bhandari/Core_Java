package org.code;

public class Inverted_Number_Pattern {

	public static void main(String[] args) {
      int c;
      for(int i=1;i<=5;i++)
      {  
    	  c=6-i;
    	  for(int j=1;j<=6-i;j++)
    	  {
    		 
    		  System.out.print(c);
    		  c--;
    	  }
    	  System.out.println();
      }
	}

}
