import java.util.*;
public class Pattern_18App
{
   public static void main(String x[])
   {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the row");
	  int row=s.nextInt();
	   
	  for(int i=1;i<=row;i++)
	  {
		for(int j=1;j<=row*2;j++)
		 {
			if(j<=i)
			 {
			  System.out.print(j); 
			 }
		   else if(j>row*2-i)
			{
			 System.out.print((row*2+1)-j);
			}
           else 
		   {
			 System.out.print(" ");
		   }			   
		 } 
         System.out.println();		 
	  }		  
   }
}