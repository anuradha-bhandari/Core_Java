import java.util.*;
public class TwoD_Array_Equal
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int i,j,c=0;
System.out.println("Enter elements in 1st array");
for(i=0;i<a.length;i++)
    {
       for(j=0;j<a.length;j++)
           {
            a[i][j]=s.nextInt();
           }
    }
 System.out.println("Enter elements in 2nd array");
 for(i=0;i<b.length;i++)
     {
       for(j=0;j<b.length;j++)
           {
            b[i][j]=s.nextInt();
           }
    }

 for(i=0;i<b.length;i++)
     {
       for(j=0;j<b.length;j++)
           {
           if(a[i][j]==b[i][j])
                     {
                      c++;
                      }
           }
    }
if(c>=a.length-1)
            {
             System.out.println("The two matrices are equal");
             }
else
   {

     System.out.println("The two matrices are not equal");
 
    }
}
}


