/*Q1. Java program to print Even length words in a String?

Input: s = "This is a java language"

Output: This is  java language

Explanation: All the elements with the length even are printed. 
"This" length is 4 so printed whereas "a" length is 1 so not Printed.  */
import java.util.*;
public class StringEvenLengthWords
{
  public static void main(String x[])
  {
	Scanner s=new Scanner(System.in);
	  
	System.out.println("Enter the String");
	String s1=s.nextLine();
	int d=0;
	int c=0;
	 String result="";
	for(int i=0;i<s1.length();i++)
	{
	  
	  d++;
	  
	  if(s1.charAt(i)!=' ')
		{
		  c++;
		  
		  result+=s1.charAt(i);
		}
	 if(s1.charAt(i)==' '||d==s1.length())
		{
			if(c%2==0)
			{
		     System.out.println(result);
			}
			c=0;
			 result="";
		}
		
	}
 
  }
}