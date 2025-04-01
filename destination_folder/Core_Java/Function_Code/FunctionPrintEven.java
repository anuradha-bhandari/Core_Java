import java.util.*;
public class FunctionPrintEven
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit");
int n=s.nextInt();
Even(n);
}
public static void Even(int n)
{
  for(int i=1;i<n;i++)
    {
      if(i%2==0)
         {
          System.out.println(i);
        }
    }
}
}