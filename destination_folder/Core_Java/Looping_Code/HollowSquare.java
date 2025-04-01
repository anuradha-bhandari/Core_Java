package org.code;
import java.util.*;
public class HollowSquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1)
				{
					System.out.print("*");
				}
				else if(i==5)
				{
					System.out.print("*");
				}
				else if(j==1)
				{
					System.out.print("*");
				}
				else if(j==5)
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
