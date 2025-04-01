package org.Array;
import java.util.*;
public class Array_Find_duplicate {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int r=0;
		System.out.println("Enter the elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int k=0;k<i;k++)// 1 2 3 4 1 2 
			{
				if(a[i]==a[k])
				{
					flag=true;
					break;
				}
			}
			
			if(!flag)
			{
			  int c=1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						c++;
					
					}
				}
				if(c>1)
				{
					r=1;//System.out.println("duplicate values are present "+a[i]);
					
				}
			}	
			
		}
		if(r==1)
		{
			System.out.println("Dupicate element is found");
		}
		else
		{
			System.out.println("Not found");
		}
	}

}
