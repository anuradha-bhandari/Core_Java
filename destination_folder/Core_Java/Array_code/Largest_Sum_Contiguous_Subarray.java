/*
 * 16. Find the Largest Sum of Contiguous Subarray
Description: Find the largest sum of a contiguous subarray in a given array.


Input: [-2  1 -3  4  -1  2  1  -5  4]


Output: 6


*/
package Org.Array;
import java.util.*;
public class Largest_Sum_Contiguous_Subarray {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the elements in array");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			
		}
		
		int max_sum=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			int curr_sum=0;
			for(int j=i;j<a.length;j++)
			{
				curr_sum=curr_sum+a[j];
				System.out.println(curr_sum);
				if(curr_sum>max_sum)
				{
					max_sum=curr_sum;
					
				}
			}	
		}
		
		System.out.println("largest sum of a contiguous subarray is "+max_sum);
		
	}

}
