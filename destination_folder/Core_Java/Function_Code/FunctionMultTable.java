import java.util.*;
public class FunctionMultTable
{
public static void main(String x[])
{
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int no=s.nextInt();
Table(no);
}
public static void Table(int no)
{
for(int i=1;i<=10;i++)
{
  int table=no*i;
  System.out.println(table);

 }
 return;
}
}
