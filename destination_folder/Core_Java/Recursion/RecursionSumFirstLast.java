import java.util.*;
public class RecursionSumFirstLast
{
static int rem=0;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
int last=no%10;
System.out.println("sum of first and last number is: ");
Swap(no);
System.out.println(rem+last);
//System.out.println(last);

}
public static void Swap(int no)
{
  if(no>0)
   {
    rem=no%10;
    no=no/10;
    Swap(no);
    }
 

}
}