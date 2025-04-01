package Org.Array;
import java.util.*;
public class Rotate_Array_N_position {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
		
	int a[]=new int[5];
	System.out.println("Enter the elements in array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=s.nextInt();
		
	}
	System.out.println("Enter the value of n");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		int temp=a[a.length-1];
		for(int j=a.length-1;j>0;j--)
		{
			a[j]=a[j-1];
		}
		a[0]=temp;
	}
	System.out.println("rotate array by"+ n +"Position");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(" "+a[i]);
	}

}
}
