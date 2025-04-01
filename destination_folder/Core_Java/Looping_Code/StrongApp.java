import java.util.*;

public class StrongApp
{
  public static void main(String x[])
   {
     Scanner s=new Scanner(System.in);
	 System.out.println("Enter the number");
	 int no=s.nextInt();
	 int sum=0;
	 int temp=no;
	 while(no>0)
	  {
		int rem=no%10;
        no=no/10;
		  int fact=1;
		  
           for(int i=1;i<=rem;i++)
		   {
			 fact=fact*i;  
		   }
        	 sum+=fact;	   
	  }
	  no=temp;
	  if(sum==no)
	   {
		 System.out.println("Number is the Strong");  
	   }
	   else
	   {
		   System.out.println("Number is not strong");
	   }		   
	}
}	