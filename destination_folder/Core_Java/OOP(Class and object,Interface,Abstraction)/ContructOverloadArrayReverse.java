/*Q2. Write a java program to create class name as Reverse using Constructor overloading name as :

	void Reverse(int [ ])
	{
		//  perform integer reverse array logic.
	}
	
	void Reverse(char [ ])
	{
		//  perform string reverse logic.
	}*/
	
import java.util.*;
class Reverse
{ 
   int a[];
   char	b[]; 
   int mid,end;
	Reverse(int a[])
	 {
		this.a=a;
		mid=a.length/2;
		end=a.length-1;
	    for(int i=0;i<mid;i++,end--)
	      {
		   int temp=a[i];
            a[i]=a[end];
            a[end]=temp; 			
	      }	
       System.out.println("After reversing array");
       for(int i=0;i<a.length;i++)
       {
	     System.out.println(a[i]);
       }		  
	 }
	Reverse(char b[])
	 {
	   this.b=b;
	   
	   mid=b.length/2;
	   end=b.length-1;
	   for(int i=0;i<mid;i++,end--)
	     {
		   char temp1=b[i];
            b[i]=b[end];
            b[end]=temp1; 
			
	     }	
       System.out.println("After reversing array");
       for(int i=0;i<b.length;i++)
       {
	     System.out.println(b[i]);
       }		  
	 }		 
	
} 


public class ContructOverloadArrayReverse
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int a[]=new int[5];
char b[]=new char[5];
 
 System.out.println("Enter the elemnts in array");
 for(int i=0;i<a.length;i++)
   {
	 a[i]=s.nextInt();
   }
 Reverse r1=new Reverse(a);   
 System.out.println("Enter the elemnts in array");
 for(int i=0;i<b.length;i++)
   {
	 b[i]=s.next().charAt(0);
   }   
 Reverse r2=new Reverse(b); 
}
}
