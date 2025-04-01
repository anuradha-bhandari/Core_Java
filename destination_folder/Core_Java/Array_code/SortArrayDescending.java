package Org.Array;
import java.util.*;
public class SortArrayDescending {

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
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		System.out.println("After sorting array ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
