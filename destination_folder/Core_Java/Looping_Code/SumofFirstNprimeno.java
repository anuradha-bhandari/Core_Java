package org.code;
import java.util.*;
public class SumofFirstNprimeno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int c=0;
		int no=2;
        int i=2;
        int sum=0;
		boolean flag=true;
		while(n!=c)
		{
			flag=true;
			for(i=2;i<=no/2;i++)
			{
				if(no%i==0)
				{
					flag=false;
				}
				
			}
			if(flag)
			{
				System.out.println(no);
				sum=sum+no;
				c++;
			}
			
			no++;	
		}
		System.out.println("Sum of First "+n+" number"+ sum);
		
	}

}
