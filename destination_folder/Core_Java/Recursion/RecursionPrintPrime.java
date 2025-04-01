import java.util.*;
public class RecursionPrintPrime
{ static int i=2,c=0,j=2;

  public static void main(String x[])
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the limit");
   int n=s.nextInt();
   Prime(n);
   }
   
   public static void Prime(int n)
   {
	 c=0;
	  if(i<n)
	 {
		while(j<=i/2)
		{	 
		  if(i%j==0)
		  {
			c++; 
		  }
		 j++;  
        }
     if(c==0)
	 {
		System.out.print(" "+i); 
	 }		 
	    i++;
	   Prime(n);
	 }		 
   }
 }  