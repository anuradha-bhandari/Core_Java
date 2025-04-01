import java.util.*;
public class FunctionCount
{
public static void main(String x[])
{
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int no=s.nextInt();
Digit(no);
}
public static void Digit(int no)
{
 int c=0;
 while(no>0)
{
 no=no/10;
 c++;

 }
System.out.println(c);
}

}
