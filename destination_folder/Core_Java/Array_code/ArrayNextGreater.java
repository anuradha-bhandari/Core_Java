import java.util.*;
public class ArrayNextGreater{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int []a=new int[7];
int  i,j;
Boolean flag=false;
System.out.println("Enter the elements in array\n");
 for(i=0;i<a.length;i++)
    {
     a[i]=s.nextInt();
     } 
  System.out.println("display the modified array\n");
  for(i=0;i<a.length;i++)
    {
       for(j=i+1;j<a.length-1;j++)
           {
              if(a[i]<a[j])
                  {
                   a[i]=a[j];
                   break;
                  
                   }
       
           }
    }
a[a.length-1]=-1;
for(i=0;i<a.length;i++)
    {
     System.out.println(a[i]);

     } 

}
}
