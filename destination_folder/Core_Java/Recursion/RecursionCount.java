import java.util.*;
public class RecursionCount
{
 static int c=0;
public static void main(String x[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int no=s.nextInt();
System.out.println("count of digit in number is:");
Count(no);
System.out.println(c);

}
public static void Count(int no)
{
   if(no>0)
     {
         no=no/10;
         c++;
         Count(no);
     }
  

}

}
