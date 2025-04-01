/*Q2. Java String Program to Insert a String into Another String

Input: originalString = "JavaLanguage", 
            stringToBeInserted = "is", 
            index = 4

Output: "JavaisLanguage"
*/
import java.util.*;
public class StringInsertDataSoecificIndex
{
  public static void main(String x[])
  {
   Scanner s=new Scanner(System.in);
   String result="";
   System.out.println("Enter the String");
   String s1=s.nextLine();
   
    System.out.println("Enter the index data to be inserted");
    int indx=s.nextInt();
     s.nextLine();
	 
    System.out.println("Enter the data");
    String data=s.nextLine();
   
    String prev=s1.substring(0,indx);
	String last=s1.substring(indx,s1.length());
	 
	result+=prev+data+last;
	System.out.println(result);
   
     
  }
} 