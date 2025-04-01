import java.util.*;
class Majority
{
  int a[];
  int c=1;
  Majority(int a[])
   {
    this.a=a;
   }
   int getMajority()
    {
	  for(int i=0;i<a.length;i++)
	    {
		  for(int j=i+1;j<a.length;j++)
		   {
		     if(a[i]==a[j])
			   {
			    c++;
			   }
			   
		   }
		   
		}
	 return c;	
		  
	}   

}
public class ConstructMajority
{
 public static void main(String x[])
  {
   Scanner s=new Scanner(System.in);
   int a[]=new int[6];
   System.out.println("Enter the elemnts in array");
    for(int i=0;i<a.length;i++)
	   {
	    a[i]=s.nextInt();
	   }
	   
	   
	   Majority m=new Majority(a);
	   
	   
	   int r=m.getMajority();
	   if(r>a.length/2)
		     {
			  System.out.println("Present");
			 }
			else
              {
			  System.out.println("Not Present");
			  }	
          	
	   
	   
  }
}