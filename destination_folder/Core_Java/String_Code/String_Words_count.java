/*Q3. WAP to input the string and find the number of words in the string without using the split() method?*/

import java.util.*;
public class String_Words_count
{
 public static void main(String x[])
 {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the String:");
   String s1=s.nextLine();
   int count=0;
   boolean flag=false;
   
   for(int i=0;i<s1.length();i++)
   {
    // char ch=s1.charAt(i);

      if(s1.charAt(i)==' ')
	  {
		
	    flag=false;
	  }	
     else 
	  {
		if(!flag) 
		{	
          count++;		
		 flag=true;
		}
	  } 
   }
   
   System.out.println("Number of Words:"+count);
   
 }
}