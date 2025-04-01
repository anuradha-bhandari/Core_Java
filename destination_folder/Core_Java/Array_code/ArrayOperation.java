import java.util.*;
class Array
{
	int i,j;
  void sort(int a[])
    {
	 for(int i=0;i<a.length;i++)
	    {
		  for(int j=i+1;j<a.length;j++)
		     {
			  if(a[i]>a[j])
			    {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			 }
		}
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{	
	      System.out.println(a[i]);	
		}  
	} 
 void sort(char ch[])
  {
    
	 for(int i=0;i<ch.length;i++)
	    {
		  for(int j=i+1;j<ch.length;j++)
		     {
			  if(ch[i]>ch[j])
			    {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				}
			 }
		}
		System.out.println("after sorting");
		for(int i=0;i<ch.length;i++)
		{	
	      System.out.println(ch[i]);	
		}  
	 
  }	 
  
}
public class ArrayOperation
{
public static void main(String x[])
{
 Array xy=new Array();
 Scanner s=new Scanner(System.in);
 int a[]=new int[5];
 char ch[]=new char[5];
 System.out.println("enter the elements in array");
 for(int i=0;i<a.length;i++)
    {
	 a[i]=s.nextInt();
	}
	System.out.println("enter the character in array");
	for(int i=0;i<ch.length;i++)
    {
	 ch[i]=s.next().charAt(0);
	}
	xy.sort(a);
	xy.sort(ch);
}
}