package org.Array;
import java.util.*;
public class Array_move_Elements_End {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int k=0;
		for(int i=0;i<a.length;i++)
			{
				if(a[i]!=0)
				{
					int temp=a[k];
					a[k]=a[i];
					a[i]=temp;
					k++;
				}
					
			}
		System.out.println("sorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
