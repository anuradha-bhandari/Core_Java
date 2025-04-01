/*Q4. WAP to convert new string with existing string without using replace function?*/

import java.util.*;
public class StringReplaceWithExistingString
{
   public static void main(String x[])
   {
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the String");
	 String s1=s.nextLine();
	 String r ="";
	 
	 System.out.println("Enter the Existing String");
	 String se=s.nextLine();
	 
	 System.out.println("Enter the New String");
	 String sn=s.nextLine();
	 
	 //starting index of existing string
	 int indx=s1.indexOf(se);
	 
	 if(indx!=1)
	 {
	  String prev=s1.substring(0,indx);
	  String last=s1.substring(indx+se.length(),s1.length());
	   
	   r+=prev+sn+last;
	  System.out.println("after replace the existing string with new string: "+r);
	 }
	 
   }
}