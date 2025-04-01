import java.util.*;
public class ArraySumPair
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int []a=new int[5];
int i,j,sum;
System.out.println("Enter the elements in array");
   for(i=0;i<a.length;i++)
        {
         a[i]=s.nextInt();
         }
System.out.println("Enter the sum of elements");
  sum=s.nextInt();
 System.out.println("pair sum of elements");

  for(i=0;i<a.length;i++)
     {
          for(j=i+1;j<a.length;j++)
             {
               if(a[i]+a[j]==sum)
                 {
                   System.out.println(i+","+j);
                  }

             }
      }

 }
}


