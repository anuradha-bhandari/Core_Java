import java.util.*;
public class RecursionSumDigitInNo
{
static int rem,sum=0;

public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
Digit(no);
System.out.println("sum of digit in number  is:"+sum);

}
public static void Digit(int no)
{
  if(no>0)
       {
        rem=no%10;
        no=no/10;
        sum=sum+rem;
        Digit(no);
       }
}
}


