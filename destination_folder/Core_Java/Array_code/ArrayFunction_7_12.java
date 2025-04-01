/*3. Write a java program to pass the array function name as findEvenOdd( ), then display the even and odd number in array.
*/

import java.util.*;
public class ArrayFunction_7_12
{
  public static void main(String x[])
  {
    Scanner s=new Scanner(System.in);
	int a[]=new int[5]; 
	System.out.println("Enter the elements in array");
	for(int i=0;i<a.length;i++)
	 {
	    a[i]=s.nextInt();   
	 }
	 
	 findEvenOdd(a);
  }
  
  public static void findEvenOdd( int a[])
  {
	  
        System.out.println("Even numbers"); 
       for(int i=0;i<a.length;i++)
	    {
		  if(a[i]%2==0)
		   {
		      System.out.println(a[i]);
		   }
	    }
		
		  System.out.println("odd numbers"); 
       for(int i=0;i<a.length;i++)
	    {
		  if(a[i]%2==1)
		   {
		      System.out.println(a[i]);
		   }
	    }
  }
}
