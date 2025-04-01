/*Q1. WAP to create two threads in java Even and Odd and print even number between 1 to 10 using Even thread and Odd values between  1 to 10 using Odd Thread using join method.
*/

import java.util.*;

class Even extends Thread
{
   public void run()
	{
	 try
		{
		 for(int i=1;i<=10;i++)
		  {
			if(i%2==0)
			{
			System.out.println("even "+ i);
			}
			sleep(1000);
		  }
		}  
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Odd extends Thread
{
	
	public void run()
	{
	 try
		{		
		 for(int i=1;i<=10;i++)
		 {
			if(i%2==1)
			{
				System.out.println("odd "+i);
			}
			sleep(1000);
		 }
		}
		 
	  catch(Exception e)
		{
		 System.out.println(e);
		}
	}	 
}
public class Thread_Jan_18_Que1
{
	public static void main(String x[]) throws InterruptedException
	{
		
		 
		 Even e=new Even();
		 e.start();
		 e.join();


		 Odd o=new Odd();
		 o.start();
	}
}