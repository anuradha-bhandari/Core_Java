package org.Array;
import java.util.*;

public class Array_remove_specific_el {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements in array");
		int a[]=new int[6]; // create an array
		for(int i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
		System.out.println("Enter the value");
		int value=s.nextInt();
		int c=0;
		for(int i=0;i<a.length;i++)
			{
				if(a[i]==value)//1 4 5 4 6 4  15
				{
					c++;		
				}
				else
				{
					a[i-c]=a[i];
				}
			}
			System.out.println("After sorting");
			for(int i=0;i<a.length-c;i++)
			{
				System.out.println(a[i]);  
			}
	}

}
