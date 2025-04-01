import java.util.*;
public class RecursionProduct
{
static int rem,p=1;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
Mult(no);
System.out.println("Product of Digit is:"+p);

}
public static void Mult(int no)
{
 if(no>0)
{
  rem=no%10;
  no=no/10;
  p=p*rem;
  Mult(no);

}

}
}
 