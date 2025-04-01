/*WAP to Given integer array move all 0’s at the end while maintaining the relative order the non zero elements.
Note: perform operation on same do not use duplicate or another array.
Example:
Input: nums=[0,1,0,3,12];
Output: 1 ,3,12,0 0
*/
import java.util.*;
class ShiftZero
{
	int a[],end;
  ShiftZero(int a[])
    {
	 this.a=a; 
    }  
 int [] getArrayAfterShifting()
 {  
    int temp=0;
	for(int i=0;i<a.length;i++)//
	  {
	      if(a[i]==0)
		   {
		     for(int j=i;j<a.length-1;j++)
		      {
			   a[j]=a[j+1];
		      }
			 a[a.length-1]=temp; 
		   }
         		 
         		 
	  }	
	  return a;
	
 } 
}
public class ConstuctShiftZeroAtEnd
{
 public static void main(String x[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the elemnts in array");
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
	  a[i]=s.nextInt();	 
	}
	
	
	ShiftZero s1=new ShiftZero(a);
	int r[]=s1.getArrayAfterShifting();
	System.out.println("Display after sorting ");
	
	for(int i=0;i<r.length;i++)
	{
	 System.out.print(" "+r[i]); 
	}
   	  
 }
}
