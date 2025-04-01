import java.util.*;
public class TwoD_Array_Sparse
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[2][2];
int i,j,c1=0,c2=0;
System.out.println("Enter elements in array");
for(i=0;i<a.length;i++)
    {
       for(j=0;j<a.length;j++)
           {
            a[i][j]=s.nextInt();
           }
     }
for(i=0;i<a.length;i++)
    {
       for(j=0;j<a.length;j++)
           {
             if(a[i][j]==0)
                    {
                     c1++;
            
                     }
            else
                {
                 c2++;
                }
           }
     }
System.out.println("");

            if(c1>c2)
                {
                System.out.println("Given matrix is sparse matrix");
                }
        else
           {
             System.out.println("Given matrix is not sparse matrix");

            }

          
}
}





