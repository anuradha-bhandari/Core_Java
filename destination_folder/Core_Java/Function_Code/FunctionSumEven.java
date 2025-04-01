import java.util.*;
public class FunctionSumEven
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
 SumEven(n);
System.out.println(SumEven(n));
}
public static int  SumEven(int n)
{
 int sum=0;
 for(int i=1;i<n;i++)
{
   if(i%2==0)
      {
       sum=sum+i;
      }
}
return sum;
}
}