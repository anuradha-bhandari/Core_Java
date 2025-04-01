import java.util.*;
public class RecursionShiftZero
{ static int i=0,k=0,temp=0;
 public static void main(String x[])
  {
   Scanner s=new Scanner(System.in);
   int a[]=new int[5];
   System.out.print("Enter the Elements in array");
   for(int i=0;i<a.length;i++)
     {
	  a[i]=s.nextInt();
	 }
	 
     Shift(a); 
	 for(int i=0;i<a.length;i++)
     {
	   System.out.print(" "+a[i]);
	 }
	 
  }
  
  public static void Shift(int a[])
  {
    if(i<a.length)
	  {
	     if(a[i]!=0)
		   {
		    temp=a[k];
			a[k]=a[i];
			a[i]=temp;
			k++;
		   }
	  i++;
	  Shift(a);
	  }
	  
	  
  }
}