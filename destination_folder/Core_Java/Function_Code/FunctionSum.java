import java.util.*;
public class FunctionSum
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
Add(n);
System.out.println(Add(n));
}
public static int Add(int n)
{
   int sum=0;
    for(int i=1;i<=n;i++)
         {
           sum=sum+i;
         }
  return sum;
}
}
   