/*Q4.Java String Program to Check Anagram

Input: str1 = "Listen" 
       str2 = "Silent"
*/

import java.util.*;

public class StringAnagramApp
{
 public static void main(String x[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String 1");
	String s1=s.nextLine();
	
	System.out.println("Enter the String 2");
	String s2=s.nextLine();
	 
	//convert to lower case
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	
   // Convert strings to char arrays 	 
	char[] charArray1=s1.toCharArray();
    char[] charArray2=s2.toCharArray(); 
	
	 
	 Arrays.sort(charArray1);
	 Arrays.sort(charArray2);
	 
	if(s1.length()!=s2.length())
	{
		  
	 System.out.println("Lengths of strings are not match");
	 return;
	}
	
	boolean flag=false;
	for(int i=0;i<charArray1.length;i++)
	 {
		
		  if(charArray1[i]!=charArray2[i])
		  {
			 flag=true;
			 break;
		  }
		  
		
	 }
	 
	 if(!flag)
	 {
	  System.out.println("Given string is Anagram");
	 }
	else
	 {
		System.out.println("Given string is not Anagram"); 
	 }
 }
}