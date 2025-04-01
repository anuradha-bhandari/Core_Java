/*Q1. Program to Add Binary Strings
Input : str1 = "1001"
             str2 = "11"

Output : "1100"
*/
import java.util.*;
public class StringBinaryAPP_13Jan
{
  public static void main(String x[])
  {
   Scanner s=new Scanner(System.in);
   
   System.out.println("enter the String 1");//1001
   String s1=s.nextLine();
   
   System.out.println("enter the String 2");//11
   String s2=s.nextLine();
      
	while(s1.length()<s2.length())
	{
		s1="0"+s1;
	}	
    
    while(s1.length()>s2.length())
	{
		s2="0"+s2;
	}		
   
    int carry=0;
	String result="";
	for(int i=s1.length()-1;i>=0;i--)
	{
		int a=s1.charAt(i)-48;//1
		int b=s2.charAt(i)-48;//1
		
		int sum=a+b+carry; //2
		result=sum%2+result; 
		carry=sum/2;
		
	}
	
  if(carry==1)
	{
	  result="1"+result;
	}
	
	System.out.println("Addition of binary digit: "+result);
  }
}
