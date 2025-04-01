package Org.Array;
import java.util.*;
public class CommonElementArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter the elements in first arrray");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			
		}		
		
		System.out.println("Enter the elements in second arrray");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
			
		}	
		
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}	
		}*/
		int c[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k]=a[i];
			k++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[k]=b[i];
			k++;
		}
		System.out.println("After merging");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(" "+c[i]);
		}

	}
	
}
