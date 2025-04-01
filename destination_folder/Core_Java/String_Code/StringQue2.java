/*
 * Q2. WAP to input the string from the keyboard and count the vowels , constant and digit as well as special characters from the string?
 */
package Org.String;
import java.util.*;
public class StringQue2 {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String");
      String s1=s.nextLine();
      int v=0,c=0,sp=0;
      for(int i=0;i<s1.length();i++)
      {
    	  if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'||s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U')
    	  {
    		 v++; 
    	  }
    	  else if((s1.charAt(i)!='a'||s1.charAt(i)!='e'||s1.charAt(i)!='i'||s1.charAt(i)!='o'||s1.charAt(i)!='u'||s1.charAt(i)!='A'||s1.charAt(i)!='E'||s1.charAt(i)!='I'||s1.charAt(i)!='O'||s1.charAt(i)!='U')&&((s1.charAt(i)>='A'&&s1.charAt(i)<='Z')||(s1.charAt(i)>='a'&&s1.charAt(i)<='z')))
    	  {
    		  c++;
    	  }
    	  else
    	  {
    		  sp++;
    	  }
      }
      System.out.println("no of vowels "+v);
      System.out.println("no of consonant "+c);
      System.out.println("no of specail symbols "+sp);


	}

}
