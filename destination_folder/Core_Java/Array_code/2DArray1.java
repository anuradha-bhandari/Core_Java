import java.util.*;
public class TwoDArray1
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
int [][]a=new int[3][3];
int i,j;
System.out.println("Enter element in array");
for(i=0;i<a.length;i++)
{
   for(j=0;j<a.length;j++)
       {
        a[i][j]=s.nextInt();
       }
}
System.out.println("Display element in array");
for(i=0;i<a.length;i++)
{
   for(j=0;j<a.length;j++)
       {
        System.out.println(a[i][j]);
        }
}
}
}