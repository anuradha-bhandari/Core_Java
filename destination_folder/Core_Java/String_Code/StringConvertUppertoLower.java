/*Q3. WAP to convert uppercase string to lowercase without using inbuilt function?
*/

import java.util.*;
public class StringConvertUppertoLower
{
   public static void main(String x[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the string");
	   String s1=s.nextLine();
	   String r="";
	   
	   for(int i=0;i<s1.length();i++)
	   {
		 if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
		   {
		 	  r+=(char)(int)(s1.charAt(i)+32);
		   }	

          else if(s1.charAt(i)>='a' && s1.charAt(i)<='z'||s1.charAt(i)==' ')
		        {
			     r+=s1.charAt(i);
		        }
		 
		   else
			  {
			    r+=s1.charAt(i);
		      }	
				
	   }
	   	   System.out.println("upper to lowercase is:"+r);

		
   }
}