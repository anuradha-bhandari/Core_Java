package org.code;
import java.util.*;

public class Prime_Factorization {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		int no=s.nextInt();
		int c=0;
		boolean flag=true;
		for(int i=2;i<=no/2;i++)
		{
			flag=true;
			if(no%i==0)
				{ 
					for(int j=2;j<=i/2;j++)
					{
						if(i%j==0)
						{
							flag=false;
						}
						
					}
					if(flag)
					{
						c++;
						System.out.println(i);
					}
				}
		}
		System.out.println(c);
	}

}
