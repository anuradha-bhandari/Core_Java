//Check if an array is sorted
//Determine if the given array is sorted in ascending or descending order.

package org.Array;
import java.util.*;
public class CheckArraySorted {
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(checkArraySortedOrder(a));
	}
	
public static String checkArraySortedOrder(int []a) 
	{
		
		boolean isAscending=true;
		boolean isDescending=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				isAscending=false;
			}
			else if(a[i]<a[i+1])
			{
				isDescending=false;
			}
			
		}
		
		if(isAscending)
		{
			return "Ascending";
		}
		else if(isDescending)
		{
			return "Descending";
		}
		else
		{
			return "Not Sorted";
		}

}
}
