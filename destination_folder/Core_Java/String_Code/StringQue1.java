/*
 * Q1. WAP program input the string from keyboard and extract number from string and calculate its sum?
Example: abc123mno45stv
Output: Sum is 15

 */
package Org.String;
import java.util.*;
public class StringQue1 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=s.nextLine();
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
        	if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
        	{
        		sum=sum+s1.charAt(i)-48;
        	}
        	
        }
        System.out.println("Sum of digit "+sum);
	}

}
