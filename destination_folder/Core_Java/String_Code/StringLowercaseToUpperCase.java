package Org.String;

import java.util.Scanner;

public class StringLowercaseToUpperCase {

	public static void main(String[] args) {
         
		Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=s.nextLine();
        String s2=" ";
        for(int i=0;i<s1.length();i++)
        	{
        		if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
        			{
        			   s2+=(char)(int)(s1.charAt(i)-32);
        			}
        		else{
        				s2+=s1.charAt(i);
        			}
        	} 
        System.out.println(" Lower to uppercase "+s2);
	}

}
