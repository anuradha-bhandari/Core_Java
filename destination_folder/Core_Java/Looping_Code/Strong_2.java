
//Q1. Write a java program to check whether number is strong or not.//

import java.util.*;
public class Strong_2
{
  public static void main (String x[])
  {
	Scanner s=new Scanner(System.in);
	int no=s.nextInt();
	int f=1,sum=0;
	int temp=no;
	while(no>0)
	 {
	  
	   int rem=no%10;
	    no=no/10;
		 f=1;
	      for(int i=1;i<=rem;i++)
		  {
		    f=f*i;           }

		sum=sum+f;
		
	 } 	
	 if(sum==temp)
	 {
		 System.out.println("Number is strong");
	 }
	 else
	 {
	System.out.println("Number is not strong");

	 }
  }
  
}



















































