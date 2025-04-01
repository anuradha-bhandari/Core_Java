import java.util.*;
class Prime
{
 int no;
 boolean flag=false;
  void setValue(int x)
  {
   no=x;
  }
  boolean ShowPrime()
  {
   for(int i=2;i<=no/2;i++)
        {
		 if(no%i==0)
		       {
			    flag=true;
			
			    }

		}
		return flag; 
}
}

public class ClassPrime
{
public static void main(String x[])
{
 Prime p1=new Prime();
 Scanner s=new Scanner(System.in);
 System.out.println("Enter the number");
 int no=s.nextInt();
 p1.setValue(no);
 boolean result=p1.ShowPrime();
 if(no!=1&&!result)
		    {
				System.out.println("Number is prime");
			    }
				else        
			    {
				System.out.println("Number is not prime");
			    }
 
}
}