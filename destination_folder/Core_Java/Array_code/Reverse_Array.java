package Org.Array;
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		System.out.println("Enter the lements in arrray");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			b[i]=a[i];
		}
		
		int end=a.length-1;
		for(int i=0;i<a.length/2;i++,end--)
		{
			int temp=a[i];
			a[i]=a[end];
			a[end]=temp;
			
		}
		System.out.println("After reverse an array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("no");
		}
	}

}
