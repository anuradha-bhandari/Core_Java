import java.util.*;
public class LoopSeriesFraction
{
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the limit");
int n=s.nextInt();
float sum=0,r;
for(int i=1;i<=n;i++)
{
 System.out.printf("1/%d\t",i);
 r=1/i;
 sum=sum+r;
}
System.out.println("Sum"+sum);

}
}