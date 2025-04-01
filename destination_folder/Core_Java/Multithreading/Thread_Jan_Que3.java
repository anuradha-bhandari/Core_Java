/*Q3. Create a thread that prints the multiplication table of a given number. The thread should print one line at a time with a 1-second delay between lines. Use join() in the main thread to wait for the multiplication table thread to finish.
*/
class Table extends Thread
{
 public void run()
    {
	 try
	  {
	  for(int i=1;i<=10;i++)
	   {
		 System.out.println(5*i);
         sleep(1000);		 
	   }
      } 
      catch(Exception e)
	  {
		System.out.println(e); 
	  }	  
	}	
}

public class Thread_Jan_Que3
{
  public static void main(String x[]) throws InterruptedException
  {
	  Table t=new Table();
	  t.start();
	 t.join();
	  System.out.println("Hello");
  }
}
