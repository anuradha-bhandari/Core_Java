import java.util.*;
public class TwoD_ArrayIdentityMatrix
{
public static void main(String x[])
{ 
int a[][]=new int[3][3];
boolean flag=true;
int i,j;
Scanner s=new Scanner(System.in);
System.out.println("Enter elemnts in array");
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
         if((i==j && a[i][j]!=1)||(i!=j && a[i][j]!=0))
           {
           flag=false;
           }
         }
}

if(flag)
  {
   System.out.println("THe given matrix is identity matrix");
  }
else
{
  System.out.println("THe given matrix is not identity matrix");

}
}
}

