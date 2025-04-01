

import java.util.*;

public class StringPalindromeApp
{
  public static void main(String x[])
  {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String s1=s.nextLine();
	String result="";
	
	for(int i=s1.length()-1;i>=0;i--)
	 {
	    result+=s1.charAt(i);
	 }
	System.out.println("Reverse is: "+result);
	
	String str=(s1.equals(result))?"String is pallindrome":"String is not Palindrome";
	System.out.println(str);
	
  }
} 