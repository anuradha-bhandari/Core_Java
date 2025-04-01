/* Add Zero to Start of Array
Write a Java program to take an array of integers as input and move all zeros to the start while maintaining the order of other elements.
Add Zero to End of Array
Implement a Java program that moves all zeros in an array to the end while keeping the order of non-zero elements unchanged*/

import java.util.*;
public class Add_Zero_to_Start_of_Array
{
 public static void main(String x[])
 {
   Scanner s=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("Enter the elements");

   for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int c=0;
		
		for(int i=0;i<a.length;i++)//10209
			{
			 if(a[i]==0)
				{
					c++;//2
				}
			}
			System.out.println(c);
			int k=a.length-1;
			
			for(int i=a.length-1;i>=0;i--)//10209
			{
				
			 if(a[i]!=0)
				{
					a[k]=a[i];//2
					k--;
				}
			}
			
			for(int i=0;i<c;i++)
			{
				a[i]=0;
			}
			
        
		System.out.println("after sorting");
		for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
 }
}
