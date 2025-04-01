import java.util.*;
public class RecursionSum
{ static int sum=0,i=1;
public static void main(String x[])
{
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Sum(n);
System.out.println(Sum(n));

}
public static int Sum(int n)
{

 if(i<=n)
{
  sum=sum+i;
  i++;
 }
 return sum;
}


}