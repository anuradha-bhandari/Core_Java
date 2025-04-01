package Org.Array;
import java.util.*;
public class Array_Frequency {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the elements in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int c=0;
		System.out.println("Enter the element that u want to find");
		int el=s.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==el)
			{
				c++;
			}
		}
		
		
		if(c==0)
		{
			System.out.println("there is no such element in array");
		}
		else
		{
			System.out.println(c);
		}
		
	}

}
