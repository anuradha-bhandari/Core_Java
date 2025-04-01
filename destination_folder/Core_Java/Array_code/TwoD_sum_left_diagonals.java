import java.util.*;
public class  TwoD_sum_left_diagonals  
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[3][3];
int i,j;
  System.out.println("Enter elemnets in array");
   for(i=0;i<a.length;i++)
       {
          for(j=0;j<a.length;j++)
              {
               a[i][j]=s.nextInt();
               }
       }
   System.out.println("Display matrix");
   for(i=0;i<a.length;i++)
       {
          for(j=0;j<a.length;j++)
              {
               System.out.printf("%d",a[i][j]);
               }
            System.out.println();
       }
System.out.println("left daigonal sum ");
      int sum=0;
   for(i=0;i<a.length;i++)
       {
          for(j=0;j<a.length;j++)
              {
                   if(j==2-i)//if(j==i)
                      {
                       sum=sum+a[i][j];

                      {
                       sum=sum+a[i][j];
                      }
               }
            System.out.println();
       }
 System.out.printf("%d",sum);

 }

}


 