/*Q1. Write a java program to create class name ReverseApp using Constructor overloading  
ReverseApp(int []) 
{ 
// perform integer reverse array logic. 
} 
ReverseApp(char [])
 { 
// perform string reverse logic
}*/

import java.util.*;
class ConstructOverload
{  
 	ConstructOverload(int a[])
	{
	 int end=a.length-1;
     int mid=a.length/2;
     for(int i=0;i<mid;i++,end--)
	 {
	   int temp=a[i];
	   a[i]=a[end];
	   a[end]=temp;
     }
	 
	 System.out.println("Reversing");
	 for(int i=0;i<a.length;i++)
	 {
		System.out.println(a[i]); 
	 }
	}
	
	ConstructOverload(char a[])
	{
	 	int end=a.length-1;
     int mid=a.length/2;
     for(int i=0;i<mid;i++,end--)
	 {
	   char temp=a[i];
	   a[i]=a[end];
	   a[end]=temp;
     }
	 
	 System.out.println("Reversing");
	 for(int i=0;i<a.length;i++)
	 {
		System.out.println(a[i]); 
	 }
	}
	
}
public class ConstructorOverloadingRev_20_10
{
 public static void main(String x[])
 {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the elements in array");
   int a[]=new int[5];
   for(int i=0;i<a.length;i++)
   {
    a[i]=s.nextInt();
   } 
   ConstructOverload c1=new ConstructOverload(a);   
   System.out.println("Enter the character in array");
   char ch[]=new char[5];
   for(int i=0;i<ch.length;i++)
   {
    ch[i]=s.next().charAt(0); 
   }
   ConstructOverload c2=new ConstructOverload(ch);
 }
}





