package org.code;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int no=2;
		
		while(no<n)
		{
			int c=0;
		     for(int i=2;i<=no/2;i++)
		       {
		    	   if(no%i==0)
		    	   {
		    		  c=1; 
		    	   }
		       }
		     if(c==0)
		     	{
		    	 System.out.println(no);
		     	}
			no++;
			
		}
	}

}
