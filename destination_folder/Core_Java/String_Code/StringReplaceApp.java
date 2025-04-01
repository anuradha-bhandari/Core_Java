/*2.	Replace All Vowels with a Specific Character ?
Input: "hello", replacement = '*'
Output: "h*ll*" */

import java.util.*;
public class StringReplaceApp
{
  public static void main(String x[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String s1=s.nextLine();
	  
	  for(int i=0;i<s1.length();i++)
	  {
		char ch=s1.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		   {
			   ch='*';
		   }
         System.out.print(ch);		   
	  }
  }
}