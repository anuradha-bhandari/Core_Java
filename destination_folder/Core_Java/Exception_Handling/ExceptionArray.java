//Array index out of bounds
public class ExceptionArray
{
  public static void main(String x[])
  {
	 int a[]=new int[]{1,2,3,4,5};
	 try
	 {
		 for(int i=0;i<=a.length;i++)
		 {
		  System.out.println(a[i]); 
		 }
	 }
	 
	 catch(ArrayIndexOutOfBoundsException e) 
	 {
	   System.out.println("Error is: "+e);
	 }
	  
  }
}
