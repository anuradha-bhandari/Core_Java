import java.util.*;
public class ArrayLargestGap
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int []a=new int[6];
int i,gap,maxgap=0;
System.out.println("Enter the elements\n");
for(i=0;i<a.length;i++)
   {
    a[i]=s.nextInt();
   }
 System.out.println("Display Array in Ascending order"); 
    for(i=0;i<a.length;i++)
        {
           for(int j=i+1;j<a.length;j++)
              {
            if(a[i]>a[j])
                {
                 int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp; 
                }
             }
 System.out.println(a[i]); 

         }
System.out.println("Maximum gap between element is");

  for(i=0;i<a.length-1;i++)
       {
         gap=a[i+1]-a[i];
         if(maxgap<gap)
               {
                maxgap=gap;
               }
       }
System.out.println(maxgap);
}
}
