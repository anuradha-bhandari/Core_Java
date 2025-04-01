package org.code;
import java.util.*;

public class Print_Star_Pyramid {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row");
		int r=s.nextInt();
		System.out.println("Enter the colomn");
		int c=s.nextInt();
		int l=c/2;
		System.out.println(l);
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j>=(1+r)-i && j<=l+i)
				{
					System.out.print("*");
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
