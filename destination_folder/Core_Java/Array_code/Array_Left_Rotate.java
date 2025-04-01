package org.Array;
import java.util.*;


public class Array_Left_Rotate {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[6];
		System.out.println("Enter the Elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter the nth rotation");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}

	}

}
