
import java.util.*;

class Prime extends Thread
{
	int n;
	Prime(int n)
	{
		this.n=n;
	}
	public void run()
	{
		int n,no=2,c=0;
	 while(no<=n)
	  {
		 for(int i=2;i<=no/2;i++)
		 {
			 if(no%i==0)
			 {
				 c=1;
				 break;
			 }
		 }
		
		  if(c==0)
		  {
			System.out.println(no);  
		  }
		 no++;
	  }
   }
}
public class Thread_Jan_Que4
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println(enter the limit);
		int n=s.nextInt();
	     Prime p=new Prime(n);
		 p.start();
	}
}