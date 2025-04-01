import java.util.*;
public class Two_D_Multiplication_2_Matrices
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
int i,j,k;
System.out.println("Enter the elements in 1st array");
 for(i=0;i<a.length;i++)
      {
        for(j=0;j<a.length;j++)
             {
              a[i][j]=s.nextInt();
             }
      }
System.out.println("Enter the elements in 2nd  array");

for(i=0;i<a.length;i++)
      {
        for(j=0;j<b.length;j++)
             {
              b[i][j]=s.nextInt();
             }
      }

 for(i=0;i<c.length;i++)
       {
         for(j=0;j<c.length;j++)
             {
               for(k=0;k<c.length;k++)
                    {
                      c[i][j]+=a[i][k]*b[k][j];
                    }
             }
      }
System.out.println("multiplication of 2 matrices");
 for(i=0;i<c.length;i++)
       {
        for(j=0;j<c.length;j++)
             {
              System.out.printf("%d ",c[i][j]);
             }
              System.out.println("");

       }
}
}

