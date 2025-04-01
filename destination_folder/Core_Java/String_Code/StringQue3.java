//Q3. WAP to input the string and find the number of words in the string without using the split() method?
 
package Org.String;
import java.util.*;
public class StringQue3 {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String s1=s.nextLine();
        int c=0;
        String word[]=s1.split("\\s+");
       
        boolean flag=false;
        for(int i=0;i<s1.length();i++) //  uui hjj kkk
        {
        	if(s1.charAt(i)!=' ' && !flag)
        	{
        		c++;
        		flag=true;
        	
        	 }
        	if(s1.charAt(i)==' ')
        	{
        		flag=false;
        	}
        }
        		
                System.out.println("Count of the word are "+c);

	}

}
