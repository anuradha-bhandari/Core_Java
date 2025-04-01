import java.util.*;
public class ArrayShuffle10
{
 public static void main(String x[])
 {
    Random r= new Random();
    Scanner s=new Scanner(System.in);
    int []a=new int[6];
    int i,j;
   System.out.println("Enter the elements in array");
    for(i=0;i<a.length;i++)
        {
         a[i]=s.nextInt();
        }
     for(i=0;i<a.length;i++)
         {
          j=r.nextInt(i+1);
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
          }

   System.out.println("After shuffling Elements");
   for(i=0;i<a.length;i++)
      {
       System.out.println(a[i]);
       }
}
}