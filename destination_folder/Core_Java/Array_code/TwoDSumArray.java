import java.util.*;
public class TwoDSumArray
{
public static void main(String x[])
{
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int i,j,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter elements in first array");
 for(i=0;i<a.length;i++)
       {
         for(j=0;j<a.length;j++)
            {  
              a[i][j]=s.nextInt();
             
            }
       }
 System.out.println("Enter elements in second array");
   for(i=0;i<a.length;i++)
        {
          for(j=0;j<b.length;j++)
             {  
              b[i][j]=s.nextInt();
             }
       } 
  System.out.println("Sum of two matrices");
  for(i=0;i<a.length;i++)
         {
           for(j=0;j<a.length;j++)
             {  
              
              sum=sum+(a[i][j]+b[i][j]);//sub=sub+(a[i][j]-b[i][j]);
             System.out.printf("%d ",sum);
                sum=0;
             }
  System.out.println();
        } 
}
}

 



 

