package org.code;
import java.util.*;
public class Decreasing_Number_Pattern {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			int c=n-i;
			for(int j=1;j<=n;j++)
			{
				if(j<(n+1)-i)
				{
					System.out.print(c);
					c--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
