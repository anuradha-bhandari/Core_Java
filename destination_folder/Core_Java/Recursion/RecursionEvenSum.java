import java.util.*;
public class RecursionEvenSum
{
public static void main(String x[])
{
static int i=1,sum=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
Sum(n);
System.out.println(sum);
}
public static int Sum(int n)
{
  if(i<n)
        {
           if(i%2==0)
          {
          }
          i++;
          sum=sum+i;
          Sum(n); 
        }
       return sum;

}
