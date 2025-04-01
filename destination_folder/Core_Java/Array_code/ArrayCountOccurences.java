package org.Array;
import java.util.*;
public class ArrayCountOccurences {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements in array");
		int a[]=new int[6];
		for(int i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
		
	
		
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int k=0;k<i;k++)// 1 2 1 3 1 4
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
				System.out.println(a[i]+"----->"+c);
				
			}
		}	
	}

}
