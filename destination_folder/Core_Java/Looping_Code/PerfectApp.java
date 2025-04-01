
import java.util.*;

public class PerfectApp
{
  public static void main(String x[])
   {
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the limit");
	 int n=s.nextInt();
	 int sum=0;
	 int no=1;
	while(no<n)
	 {
	  for(int i=1;i<=no/2;i++)
	     {
		   if(no%i==0)
		   {
			 sum+=i;  
		   }
		 }
	  if(no==sum)
		{
		 System.out.println(no);	
		}	
      
	no++;
	sum=0;
   }	
   }
 }  
   