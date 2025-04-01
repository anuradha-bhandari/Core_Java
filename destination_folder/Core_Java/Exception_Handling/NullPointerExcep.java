//Null Pointer Handling



class ABC
{
    void show()
	{
	 System.out.println("This is show method");
	}
}
public class NullPointerExcep
{
  public static void main(String x[])
  {
     ABC a=null; 
    try
	{
	    a.show();
	}	

    catch(NullPointerException n)
       {
	    System.out.println("Error is: "+n);
	   }	 
  }
}