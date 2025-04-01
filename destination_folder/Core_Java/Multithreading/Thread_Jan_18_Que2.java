/*Q2. Calculate Factorial Using a Thread
Write a program where one thread calculates the factorial of a given number.
Pass the number as an argument to the thread.
Print the result in the thread's run() method.
*/
import java.util.*;
class Factorial extends Thread
{int no;
  Factorial(int no)
	{
		this.no=no;
	}
	public void run()
	{
	 int fact=1;	
	 for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
	  System.out.println("Factorial is: "+fact);
	}
}
public class Thread_Jan_18_Que2
{
  public static void main(String x[])
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int no=s.nextInt();
	  Factorial f=new Factorial(no);
	  f.start();
  }
}