package org.code;
import java.util.*;
public class Print_inverted_Star_Pattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
