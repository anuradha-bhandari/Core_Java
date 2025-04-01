package org.code;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		
		int c=0;
		int no=1;
		
		int temp=0;
	while(no<n)
	{	
		temp=no;
		 c=0;
		while(no>0)
		{
			no=no/10;
			c++;
		}
		no=temp;
		int rem=0,sum=0;
		while(no>0)
		{
			rem=no%10;
			no=no/10;
			     int p=1;
			     
				for(int i=1;i<=c;i++)
				{
					p=p*rem;
				}
				sum+=p;
				
		}
		
		no=temp;
		if(sum==no)
		{
			System.out.println(no);
		}
		
 	  no++;
	}	
}

}
