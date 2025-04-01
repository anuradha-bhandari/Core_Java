package org.code;
import java.util.*;
public class Perfect_Number {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number");
      int no=s.nextInt();
      int sum=0;
      for(int i=1;i<=no/2;i++)
      {
    	  if(no%i==0)
    	  {
    		  sum=sum+i;
    	  }
      }
      if(no==sum)
      {
    	  System.out.println("Number is perfect");
      }
      else
      {
    	  System.out.println("Number is not perfect");
      }
    }

}
