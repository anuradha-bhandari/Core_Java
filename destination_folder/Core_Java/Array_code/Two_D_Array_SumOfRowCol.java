import java.util.*;
public class Two_D_Array_SumOfRowCol
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int i,j,sum=0;
int a[][]=new int[2][2];

System.out.println("enter elements in array"); 
 for(i=0;i<a.length;i++)
     {
        for(j=0;j<a.length;j++)
            {
             a[i][j]=s.nextInt();
             }

      }
System.out.println("display sum of row"); 
 for(i=0;i<a.length;i++)
      {
        for(j=0;j<a.length;j++)
            {
             sum=sum+a[i][j];
            }
          System.out.printf("%d",sum);
          sum=0;
          System.out.println();
      }


System.out.println("display sum of coloumn"); 
 for(j=0;j<a.length;j++)
      {
        for(i=0;i<a.length;i++)
            {
             sum=sum+a[i][j];
             }
        System.out.printf("%d",sum);
        sum=0;
        System.out.println( );
      }
}  
}