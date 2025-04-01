import java.util.*;
class ArrayReverse
{
  int a[];
  //int end,mid;
  
  void setArray(int m[])
     {
	  a=m;
	 }
	 void reverseArray()
       {
	    int end=a.length-1;
		int mid=a.length/2;
	     for(int i=0;i<mid;i++,end--)
		   {
		     int temp=a[end];
			 a[end]=a[i];
			 a[i]=temp;
		   }
	   } 
 int []	getArray()
    {
	 return a;
	} 
	 
}

public class ClassArrayReverse
{
public static void main(String x[])
{
ArrayReverse r=new ArrayReverse();
Scanner s=new Scanner(System.in);
int d[]=new int[5];
System.out.println("Enter the elements in array");
for(int i=0;i<d.length;i++)
{
 d[i]=s.nextInt();
}
r.setArray(d);
r.reverseArray();
int [] result=r.getArray();
System.out.println("After reverce the array");
for(int i=0;i<d.length;i++)
{
 System.out.println(result[i]);
}


}

}