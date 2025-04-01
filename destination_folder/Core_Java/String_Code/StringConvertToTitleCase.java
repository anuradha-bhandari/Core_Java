/*4.	Convert a Sentence to Title Case ?
Input: "java is fun"
Output: "Java Is Fun"*/

import java.util.*;
public class StringConvertToTitleCase
{
  public static void main(String x[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the String");
	  String s1=s.nextLine();
	  String result=" ";
	  boolean flag=true;
	  for(int i=0;i<s1.length();i++)
	  {
		 char ch=s1.charAt(i); 
		if(ch==' ')
		 {
		  result+=Character.toUpperCase(ch); 
          flag=true;		  
		 }
		else if(flag)
		 {
			result+=Character.toUpperCase(ch); 
			flag=false;
		 }
		else
		 {
     		result+=Character.toLowerCase(ch);  
		 }
			 
	  }
	  System.out.print(result);
		  
	  
  }
}