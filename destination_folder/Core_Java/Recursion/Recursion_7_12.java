/*2. Write a java program to count the digit of number using function recursion and return its count of number.
*/
import java.util.*;
public class Recursion_7_12
{
	static int c=0;
   public static void main(String x[])
   {
	   
	   Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number");
		int no;
		no=s.nextInt();
	    Count(no); 
       // System.out.println("Count is:"+c);	   
   }
   
   public static void Count(int no)// function defination
   {
	  if(no>0)
	  {
		no=no/10; 
		
         c++;
       	Count(no);  		 
	  } 

   }
}
