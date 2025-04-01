/*Q1. Sorting Arrays with Sortable Interface 
 
Objective: Implement an interface and two classes to sort arrays of integers and strings. 
Requirements: 
Define an Interface: 
Create an interface named Sortable with a method sort(). 
Implementing Classes: 
Create a class named IntegerArray that: 
Contains a private array of integers. 
Implements the Sortable interface and provides the implementation for the sort() method 
to sort the integer array in ascending order. 
Includes a method printArray() to display the contents of the integer array. 
Create a class named StringArray that: 
Contains a private array of strings. 
Implements the Sortable interface and provides the implementation for the sort() method 
to sort the string array in alphabetical order. 
Includes a method printArray() to display the contents of the string array. 
Demonstration: 
In the main method of a separate class, create an instance of IntegerArray with an array of 
integers. 
Create an instance of StringArray with an array of strings. 
Call the sort() method on both instances to sort the arrays. 
Print the sorted arrays using the printArray() method. 
Expected Output: 
The program should display the sorted integer and string arrays when executed. For 
example: 
Sorted Integer Array: [1, 2, 3, 5, 8] 
Sorted String Array: [apple, banana, kiwi, orange]*/

import java.util.*;
interface Sorted
{
  void Sort(int a[]);
  void Sort(char ch[]);

}
	
class IntegerArray implements Sorted
  {
	 int a[]; 
    public void Sort(int a[])
	{
		this.a=a;
	}
    public void Sort(char ch[])
	 {
		 
	 }
 	
	  void show()
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
		System.out.println("After sorting Int Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}	
  }	
  
class StringArray implements Sorted
  {
	  char b[];
	public void Sort(char b[])
	  {
		 this.b=b; 
	  }
	 public void Sort(int a[])
	 {
		 
	 }

    void show()
	{	
		for(int i=0;i<b.length;i++)
		{
		  for(int j=i+1;j<b.length;j++)
		  {
			  if(b[i]>b[j])
			  {
				char temp=b[i];
                b[i]=b[j];
                b[j]=temp;				
			  }
		  }			  
		}
		System.out.println("After sorting String Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	  }	
  }	

public class InterfaceArraySortString_30_0ct
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		IntegerArray s1=new IntegerArray();

		StringArray s2=new StringArray();

		System.out.println("Enter the interger Elements");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
		 a[i]=s.nextInt();	
		}
		s1.Sort(a);
		s1.show();
		System.out.println("Enter the String Elements");
		char b[]=new char[4];
		for(int i=0;i<b.length;i++)
		{
		 b[i]=s.next().charAt(0);	
		}
		s2.Sort(b);
		s2.show();

	}
}