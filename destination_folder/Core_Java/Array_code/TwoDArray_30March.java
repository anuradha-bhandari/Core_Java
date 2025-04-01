//Q1. Write java program to 2D array of size 3*3 and display the matrix.

package org.Array;
import java.util.*;
public class TwoDArray_30March {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		System.out.println("Enter the elements in fisrt array");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					a[i][j]=s.nextInt();
				}
			}
		int sum=0;
		System.out.println("After displaying array data");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}
	
}
