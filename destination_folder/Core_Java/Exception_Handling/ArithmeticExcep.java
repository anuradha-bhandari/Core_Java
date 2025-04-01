//Divide by Zero

import java.util.*;
public class ArithmeticExcep
{
  public static void main(String x[])
  {
      Scanner s=new Scanner(System.in);
	  System.out.println("Enter two values:");
	  int a,b,c;
	  a=s.nextInt();
	  b=s.nextInt();
	  
	  try
	     {
		  c=a/b;
		  System.out.println("Division is:"+c);
	     }
		 
		catch(ArithmeticException ex)
            {
			   System.out.println("Error is:"+ex);
			}		
  }
  
}