 /*rite a java program to create class name as Frequency using Constructor overloading name as :

	void Frequency(int [ ])
	{
		//  count even and odd number in array.
	}
	
	
	void Frequency(char [ ])
	{
		//  count alphabet , digit and special symbol charcter in string.
	}*/
 import java.util.*;
 class Frequency
 {
  int a[],c=0,c1=0,a1=0,d=0,sp=0;
  char b[];  
  Frequency(int a[])
  {
   for(int i=0;i<a.length;i++)
    {
	  if(a[i]%2==0)
	    {
		 c++;	
		}
	  else
	     {
		  c1++;
		 }
	}
	 System.out.println("Even count is"+c);
	 System.out.println("Odd count is"+c1);
 }
 Frequency(char b[])
  {
	for(int i=0;i<b.length;i++)
	  {
		if((b[i]>=97&&b[i]<=122)||(b[i]>=65&&b[i]<=90))
		   {
			 a1++;

		   }
      else if(b[i]>=48&&b[i]<=57)
	      {
		    d++;
	      }
     else 
	 {
		sp++; 
	 }		 
   }
	 System.out.println("alphabet count is"+a1);
     System.out.println("digit count is"+d);
	 System.out.println("special symbol count is"+sp);

	 
  }
 
 }
 public class ConstuctOverloadFrequency
 {
 public static void main(String x[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Elements in array");
  int a[]=new int[5];
  char b[]=new char[5];
  for(int i=0;i<a.length;i++)
    {
	 a[i]=s.nextInt(); 
	}
	Frequency f=new Frequency(a);
	System.out.println("Enter the alphabets in array");
	for(int i=0;i<b.length;i++)
    {
	 b[i]=s.next().charAt(0); 
	}
	Frequency f1=new Frequency(b);
	
  
 }
 }