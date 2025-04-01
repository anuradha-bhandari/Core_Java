import java.util.*;
public class FunctionNatural1toN
{
public static void main(String x[])
{

System.out.println("Enter the limit");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
System.out.println("print natural number");
Natural(n);

}
public static void Natural(int n)
{
  
 for(int i=n;i>0;i--)//for(i=1;i<n;i++)
{
 System.out.println(i);
 }
 return;
}
}
