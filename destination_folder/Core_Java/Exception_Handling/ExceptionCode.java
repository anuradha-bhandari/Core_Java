/*Q4. Create a Java program to demonstrate exception handling by catching and handling multiple exceptions. 
The program should: 
Functionality: 
Accept a string array as input. 
Parse the first element of the array to an integer. 
Access an index in the array specified by the parsed integer. 
 
Error Handling: 
Catch and handle the following exceptions: 
ArrayIndexOutOfBoundsException: Handle cases where the specified index is outside the bounds of 
the array. 
NumberFormatException: Handle cases where the first element cannot be parsed into an integer. 
Output: 
Display custom error messages for each exception. 
Handle cases gracefully to ensure the program does not crash.*/

import java.util.*;
public class ExceptionCode
{
  public static void main(String x[])
  {
	 Scanner s=new Scanner(System.in);
     System.out.println("Enter the string array");
     String word[]=new String[4];// array
      
        for(int i=0;i<word.length;i++)
		{
		  word[i]=s.nextLine();	
		}
          
		
	 try
		{
		  int index=Integer.parseInt(word[0]);
		  System.out.println("parse index: "+index);
          System.out.println("array element at parse index: "+word[index]);		  
		} 
     catch(NumberFormatException e)
	      {
		    System.out.println("String cannot converted into integer\n"+e);
	      }
	catch(ArrayIndexOutOfBoundsException e)
	     {
		   System.out.println("index is outside the bounds of the array\n"+e);
	     }
	catch(Exception e)
	     {
		   System.out.println(e);
	     }	
		
  }
  
}
 

