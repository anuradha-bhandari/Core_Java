import java.util.*;
public class PracticeArrayShiftingZero
{
public static void main(String x[])
{
    int a[]=new int[]{11,0,3,0,8,0,9};
    int temp=0,k=0;
	for(int i=0;i<a.length;i++)
	    { 
		 if(a[i]!=0)
		 {
		  temp=a[k];
		  a[k]=a[i];
		  a[i]=temp;
		  k++;
		  }
		  
		}
	
   for(int i=0;i<a.length;i++)
      {
	    System.out.print(" "+a[i]);
	  }   
	
}
}