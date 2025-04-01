package org.Array;
import java.util.Scanner;

public class Array_maj {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		boolean flag=false;
		int a[]=new int[5];
		System.out.println("Enter the elements in array");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int c=0;
		for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						c++;
						if(c>a.length/2)
							{
								flag=true;
							}
						
					}
				}
			}
		if(flag)
		{
			System.out.println("Majority element is found: ");
		}
		else
		{
			System.out.println("Majority element is not found");
		}

	}

}
